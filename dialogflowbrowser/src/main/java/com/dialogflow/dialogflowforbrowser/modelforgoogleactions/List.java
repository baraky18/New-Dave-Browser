package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class List {

	private String title;
	private String subtitle;
	private ListItem[] items;
	
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
	public ListItem[] getItems() {
		return items;
	}
	public void setItems(ListItem[] items) {
		this.items = items;
	}
}
