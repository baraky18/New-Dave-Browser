package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class TableCardRow {

	private TableCardCell[] cells;
	private boolean dividerAfter;
	
	public TableCardCell[] getCells() {
		return cells;
	}
	public void setCells(TableCardCell[] cells) {
		this.cells = cells;
	}
	public boolean isDividerAfter() {
		return dividerAfter;
	}
	public void setDividerAfter(boolean dividerAfter) {
		this.dividerAfter = dividerAfter;
	}
}
