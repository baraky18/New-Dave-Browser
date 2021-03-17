package com.dialogflow.dialogflowbrowser;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.dialogflow.dialogflowbrowser.service.JwtGeneratorService;
import com.dialogflow.dialogflowforbrowser.model.FulfillmentMessages;
import com.dialogflow.dialogflowforbrowser.model.OAuthToken;
import com.dialogflow.dialogflowforbrowser.model.TestRequest;
import com.dialogflow.dialogflowforbrowser.model.TestResponse;
import com.dialogflow.dialogflowforbrowser.model.Text;
import com.dialogflow.dialogflowforbrowser.modelforgoogleactions.GoogleActionsWebhookRequest;
import com.dialogflow.dialogflowforbrowser.modelforgoogleactions.GoogleActionsWebhookResponse;
import com.dialogflow.dialogflowforbrowser.modelforgoogleactions.Prompt;
import com.dialogflow.dialogflowforbrowser.modelforgoogleactions.Simple;
import com.dialogflow.dialogflowforbrowser.modelsforapi.DetectIntentResponse;
import com.dialogflow.handlers.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
@RequestMapping("/dialogflow")
public class HelloWorldController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RequestHandler requestHandler;

	@Autowired
	private JwtGeneratorService jwtGeneratorService;

	/*
	 * this REST is the gate to the application. it embeds the Dialogflow chat inside helloworld.html and when
	 * user is typing something, it goes to Dialogflow and Dialogflow is calling /test REST below to fetch the audio file.
	 * when the audio file is fetched, it cannot be played automatically
	 */
	@GetMapping("/hello")
	public ModelAndView helloWorld(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("helloworld");
		return mv;
	}

	/*
	 * this REST is called by Dialogflow using the fulfillment API and returning an audio file
	 */
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public TestResponse helloWorld(@RequestBody TestRequest testRequest){
		String[] textArr = {"<speak><audio src=\"https://storage.googleapis.com/new_dave_poc/damn_new.wav\">didn't get your wav audio file</audio></speak>"};
		Text text = new Text();
		text.setText(textArr);
		TestResponse testResponse = new TestResponse();
		FulfillmentMessages[] fulfillmentMessages = new FulfillmentMessages[1];
		fulfillmentMessages[0] = new FulfillmentMessages();
		fulfillmentMessages[0].setText(text);
		testResponse.setFulfillmentMessages(fulfillmentMessages);
		return testResponse;
	}
	
	/*
	 * this REST is called from Google Assistant that calls Google Actions using a webhook and returning an audio file
	 */
	@RequestMapping(value="/google_actions_webhook", method=RequestMethod.POST)
	public GoogleActionsWebhookResponse googleActionsWebhook(@RequestBody GoogleActionsWebhookRequest googleActionsWebhookResponse){
		Simple simpleResponse = new Simple();
		simpleResponse.setSpeech("<speak><audio src=\"https://storage.googleapis.com/new_dave_poc/damn_new.wav\">didn't get your wav audio file</audio></speak>");
		Prompt prompt = new Prompt();
		prompt.setFirstSimple(simpleResponse);
		GoogleActionsWebhookResponse response = new GoogleActionsWebhookResponse();
		response.setPrompt(prompt);
		return response;
	}


	@RequestMapping("/example")
	public ModelAndView example(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("example");
		return mv;
	}

	@RequestMapping("/sendtodialogflow")
	public ModelAndView sendToDialogflow(@RequestParam("user_text") String userText) throws NoSuchAlgorithmException, InvalidKeySpecException, IOException, LineUnavailableException, UnsupportedAudioFileException{

		OAuthToken oAuthToken = restTemplate.postForObject("https://oauth2.googleapis.com/token?grant_type=urn:ietf:params:oauth:grant-type:jwt-bearer&assertion=" + jwtGeneratorService.createJwtRsa(), null, OAuthToken.class);

		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(oAuthToken.getAccess_token());
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String jsonRequest = ow.writeValueAsString(requestHandler.createRequest());

		HttpEntity<String> entity = new HttpEntity<String>(jsonRequest, headers);
		ResponseEntity<DetectIntentResponse> detectIntentResponse = restTemplate.exchange(createUrlAndHeader(), HttpMethod.POST, entity, DetectIntentResponse.class);

		String audioUrl = "";
		if(detectIntentResponse.getBody().getQueryResult() != null &&
				detectIntentResponse.getBody().getQueryResult().getFulfillmentMessages() != null &&
				detectIntentResponse.getBody().getQueryResult().getFulfillmentMessages().length > 0 &&
				detectIntentResponse.getBody().getQueryResult().getFulfillmentMessages()[0].getText() != null &&
				detectIntentResponse.getBody().getQueryResult().getFulfillmentMessages()[0].getText().getText() != null &&
				detectIntentResponse.getBody().getQueryResult().getFulfillmentMessages()[0].getText().getText().length > 0 &&
				detectIntentResponse.getBody().getQueryResult().getFulfillmentMessages()[0].getText().getText()[0].contains("https")){
			audioUrl = StringUtils.substringBetween(detectIntentResponse.getBody().getQueryResult().getFulfillmentMessages()[0].getText().getText()[0],"src=\"", "\">didn't");
		}
		URL url = new URL(audioUrl);
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("example");
		return mv;
	}

	private String createUrlAndHeader() {
		StringBuilder url = new StringBuilder("https://content-dialogflow.googleapis.com/v2/projects/testagent-ui9q/agent/sessions/*:detectIntent?");
		url.append("&%24.xgafv=1");
		url.append("&prettyPrint=true");
		url.append("&alt=json");
		url.append("&upload_protocol=HTTP");
		return url.toString();
	}
}
