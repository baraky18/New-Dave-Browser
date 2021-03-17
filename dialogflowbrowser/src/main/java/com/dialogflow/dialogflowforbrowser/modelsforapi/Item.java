package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class Item {

	private SelectItemInfo info;
	private String title;
	private String description;
	private Image image;
	
	public SelectItemInfo getInfo() {
		return info;
	}
	public void setInfo(SelectItemInfo info) {
		this.info = info;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
}
