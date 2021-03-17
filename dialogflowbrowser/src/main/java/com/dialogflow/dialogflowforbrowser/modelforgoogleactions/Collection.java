package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Collection {

	private String title;
	private String subtitle;
	private CollectionItem[] items;
	private ImageFill imageFill;
	
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
	public CollectionItem[] getItems() {
		return items;
	}
	public void setItems(CollectionItem[] items) {
		this.items = items;
	}
	public ImageFill getImageFill() {
		return imageFill;
	}
	public void setImageFill(ImageFill imageFill) {
		this.imageFill = imageFill;
	}
}
