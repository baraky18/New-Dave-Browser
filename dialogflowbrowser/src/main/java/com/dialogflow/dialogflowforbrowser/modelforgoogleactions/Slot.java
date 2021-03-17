package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Slot {

	private SlotMode mode;
	private SlotStatus status;
	private String value;
	private boolean updated;
	private Prompt prompt;
	
	public SlotMode getMode() {
		return mode;
	}
	public void setMode(SlotMode mode) {
		this.mode = mode;
	}
	public SlotStatus getStatus() {
		return status;
	}
	public void setStatus(SlotStatus status) {
		this.status = status;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isUpdated() {
		return updated;
	}
	public void setUpdated(boolean updated) {
		this.updated = updated;
	}
	public Prompt getPrompt() {
		return prompt;
	}
	public void setPrompt(Prompt prompt) {
		this.prompt = prompt;
	}
}
