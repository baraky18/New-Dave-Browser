package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class BasicCard {

	private String title;
	private String subtitle;
	private String formattedText;
	private Image image;
	private com.dialogflow.dialogflowforbrowser.Button[] buttons;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getFormattedText() {
		return formattedText;
	}
	public void setFormattedText(String formattedText) {
		this.formattedText = formattedText;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public com.dialogflow.dialogflowforbrowser.Button[] getButtons() {
		return buttons;
	}
	public void setButtons(com.dialogflow.dialogflowforbrowser.Button[] buttons) {
		this.buttons = buttons;
	}
}
