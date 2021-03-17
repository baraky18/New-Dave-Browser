package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Disclosure {

	private String title;
	private DisclosureText disclosureText;
	private DisclosurePresentationOptions presentationOptions;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public DisclosureText getDisclosureText() {
		return disclosureText;
	}
	public void setDisclosureText(DisclosureText disclosureText) {
		this.disclosureText = disclosureText;
	}
	public DisclosurePresentationOptions getPresentationOptions() {
		return presentationOptions;
	}
	public void setPresentationOptions(DisclosurePresentationOptions presentationOptions) {
		this.presentationOptions = presentationOptions;
	}
}
