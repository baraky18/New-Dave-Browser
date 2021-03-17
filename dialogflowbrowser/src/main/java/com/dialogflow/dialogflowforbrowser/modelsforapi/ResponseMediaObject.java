package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class ResponseMediaObject {

	private String name;
	private String description;
	private String contentUrl;
	private Image largeImage;
	private Image icon;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContentUrl() {
		return contentUrl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public Image getLargeImage() {
		return largeImage;
	}
	public void setLargeImage(Image largeImage) {
		this.largeImage = largeImage;
	}
	public Image getIcon() {
		return icon;
	}
	public void setIcon(Image icon) {
		this.icon = icon;
	}
}
