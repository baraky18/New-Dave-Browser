package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class TableCard {

	private String title;
	private String subtitle;
	private Image image;
	private ColumnProperties[] columnProperties;
	private TableCardRow[] rows;
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
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public ColumnProperties[] getColumnProperties() {
		return columnProperties;
	}
	public void setColumnProperties(ColumnProperties[] columnProperties) {
		this.columnProperties = columnProperties;
	}
	public TableCardRow[] getRows() {
		return rows;
	}
	public void setRows(TableCardRow[] rows) {
		this.rows = rows;
	}
	public com.dialogflow.dialogflowforbrowser.Button[] getButtons() {
		return buttons;
	}
	public void setButtons(com.dialogflow.dialogflowforbrowser.Button[] buttons) {
		this.buttons = buttons;
	}
}
