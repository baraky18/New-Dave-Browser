package com.dialogflow.dialogflowbrowser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dialogflow.dialogflowforbrowser.model.FulfillmentMessages;
import com.dialogflow.dialogflowforbrowser.model.TestRequest;
import com.dialogflow.dialogflowforbrowser.model.TestResponse;
import com.dialogflow.dialogflowforbrowser.model.Text;

@RestController
@RequestMapping("/dialogflow")
public class HelloWorldController {

	@RequestMapping(value="/test", method=RequestMethod.POST)
	public TestResponse helloWorld(@RequestBody TestRequest testRequest){
		String[] textArr = {"<speak><audio src=\"https://storage.googleapis.com/new_dave_poc/damn_new.wav\">didn't get your MP3 audio file</audio></speak>"};
		Text text = new Text();
		text.setText(textArr);
		TestResponse testResponse = new TestResponse();
		FulfillmentMessages[] fulfillmentMessages = new FulfillmentMessages[1];
		fulfillmentMessages[0] = new FulfillmentMessages();
		fulfillmentMessages[0].setText(text);
		testResponse.setFulfillmentMessages(fulfillmentMessages);
		return testResponse;
	}
	
	@GetMapping("/hello")
	public ModelAndView helloWorld(){
		ModelAndView mv = new ModelAndView();
        mv.setViewName("helloworld");
		return mv;
	}
}
