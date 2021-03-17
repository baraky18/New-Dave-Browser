package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class SpeechContext {

	private String[] phrases;
	private int boost;
	
	public String[] getPhrases() {
		return phrases;
	}
	public void setPhrases(String[] phrases) {
		this.phrases = phrases;
	}
	public int getBoost() {
		return boost;
	}
	public void setBoost(int boost) {
		this.boost = boost;
	}
}
