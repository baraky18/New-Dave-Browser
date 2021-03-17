package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class FollowupIntentInfo {

	private String followupIntentName;
	private String parentFollowupIntentName;
	
	public String getFollowupIntentName() {
		return followupIntentName;
	}
	public void setFollowupIntentName(String followupIntentName) {
		this.followupIntentName = followupIntentName;
	}
	public String getParentFollowupIntentName() {
		return parentFollowupIntentName;
	}
	public void setParentFollowupIntentName(String parentFollowupIntentName) {
		this.parentFollowupIntentName = parentFollowupIntentName;
	}
}
