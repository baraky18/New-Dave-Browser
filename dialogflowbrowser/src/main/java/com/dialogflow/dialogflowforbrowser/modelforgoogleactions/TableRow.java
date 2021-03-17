package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class TableRow {

	private TableCell[] cells;
	private boolean divider;
	
	public TableCell[] getCells() {
		return cells;
	}
	public void setCells(TableCell[] cells) {
		this.cells = cells;
	}
	public boolean isDivider() {
		return divider;
	}
	public void setDivider(boolean divider) {
		this.divider = divider;
	} 
}
