package com.dialogflow.dialogflowbrowser;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.dialogflow.handlers.RequestHandler;

@Configuration
public class DialogflowConfiguration {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	public RequestHandler getRequestHandler(){
		return new RequestHandler();
	}
}
