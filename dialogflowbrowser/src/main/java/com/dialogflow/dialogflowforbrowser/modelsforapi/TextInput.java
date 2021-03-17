package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class TextInput {

	private String text;
	private String languageCode;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
