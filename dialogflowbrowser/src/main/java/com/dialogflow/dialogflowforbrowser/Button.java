package com.dialogflow.dialogflowforbrowser;

import com.dialogflow.dialogflowforbrowser.modelsforapi.OpenUriAction;

public class Button {

	private String title;
	private OpenUriAction openUriAction;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public OpenUriAction getOpenUriAction() {
		return openUriAction;
	}
	public void setOpenUriAction(OpenUriAction openUriAction) {
		this.openUriAction = openUriAction;
	}
}
