package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class Entity {

	private String value;
	private String[] synonyms;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String[] getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String[] synonyms) {
		this.synonyms = synonyms;
	}
}
