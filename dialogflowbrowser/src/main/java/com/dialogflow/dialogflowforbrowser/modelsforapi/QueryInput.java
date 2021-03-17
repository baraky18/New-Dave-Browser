package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class QueryInput {

	private InputAudioConfig audioConfig;
	private TextInput text;
	private EventInput event;
	
	public InputAudioConfig getAudioConfig() {
		return audioConfig;
	}
	public void setAudioConfig(InputAudioConfig audioConfig) {
		this.audioConfig = audioConfig;
	}
	public TextInput getText() {
		return text;
	}
	public void setText(TextInput text) {
		this.text = text;
	}
	public EventInput getEvent() {
		return event;
	}
	public void setEvent(EventInput event) {
		this.event = event;
	}
}
