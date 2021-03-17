package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Table {

	private String title;
	private String subtitle;
	private Image image;
	private TableColumn[] columns;
	private TableRow[] rows;
	private Link button;
	
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
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public TableColumn[] getColumns() {
		return columns;
	}
	public void setColumns(TableColumn[] columns) {
		this.columns = columns;
	}
	public TableRow[] getRows() {
		return rows;
	}
	public void setRows(TableRow[] rows) {
		this.rows = rows;
	}
	public Link getButton() {
		return button;
	}
	public void setButton(Link button) {
		this.button = button;
	}
}
