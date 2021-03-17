package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class BrowseCarouselCard {

	private BrowseCarouselCardItem[] items;
	private ImageDisplayOptions imageDisplayOptions;
	
	public BrowseCarouselCardItem[] getItems() {
		return items;
	}
	public void setItems(BrowseCarouselCardItem[] items) {
		this.items = items;
	}
	public ImageDisplayOptions getImageDisplayOptions() {
		return imageDisplayOptions;
	}
	public void setImageDisplayOptions(ImageDisplayOptions imageDisplayOptions) {
		this.imageDisplayOptions = imageDisplayOptions;
	}
}
