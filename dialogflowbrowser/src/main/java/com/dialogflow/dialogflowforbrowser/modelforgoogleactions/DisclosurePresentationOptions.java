package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class DisclosurePresentationOptions {

	private PresentationRequirement presentationRequirement;
	private boolean initiallyExpanded;
	
	public PresentationRequirement getPresentationRequirement() {
		return presentationRequirement;
	}
	public void setPresentationRequirement(PresentationRequirement presentationRequirement) {
		this.presentationRequirement = presentationRequirement;
	}
	public boolean isInitiallyExpanded() {
		return initiallyExpanded;
	}
	public void setInitiallyExpanded(boolean initiallyExpanded) {
		this.initiallyExpanded = initiallyExpanded;
	}
}
