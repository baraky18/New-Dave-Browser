package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class MediaObject {

	private String name;
	private String description;
	private String url;
	private MediaImage image;
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public MediaImage getImage() {
		return image;
	}
	public void setImage(MediaImage image) {
		this.image = image;
	}
}
