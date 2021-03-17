package com.dialogflow.handlers;

import com.dialogflow.dialogflowforbrowser.modelsforapi.ApiRequest;
import com.dialogflow.dialogflowforbrowser.modelsforapi.QueryInput;
import com.dialogflow.dialogflowforbrowser.modelsforapi.TextInput;

public class RequestHandler {

	public ApiRequest createRequest() {
		ApiRequest apiRequest = new ApiRequest();
		apiRequest.setQueryInput(createQueryInput());
		return apiRequest;
	}

	private QueryInput createQueryInput() {
		QueryInput queryInput = new QueryInput();
		queryInput.setEvent(null);
		queryInput.setText(createText());
		return queryInput;
	}

	private TextInput createText() {
		TextInput textInput = new TextInput();
		textInput.setLanguageCode("EN");
		textInput.setText("hi");
		return textInput;
	}
}
