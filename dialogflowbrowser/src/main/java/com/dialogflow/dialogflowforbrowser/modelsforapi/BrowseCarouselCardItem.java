package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class BrowseCarouselCardItem {

	private OpenUrlAction openUriAction;
	private String title;
	private String description;
	private Image image;
	private String footer;
	
	public OpenUrlAction getOpenUriAction() {
		return openUriAction;
	}
	public void setOpenUriAction(OpenUrlAction openUriAction) {
		this.openUriAction = openUriAction;
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
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
}
