package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Canvas {

	private String ur;
	private Object[] data;
	private boolean suppressMic;
	
	public String getUr() {
		return ur;
	}
	public void setUr(String ur) {
		this.ur = ur;
	}
	public Object[] getData() {
		return data;
	}
	public void setData(Object[] data) {
		this.data = data;
	}
	public boolean isSuppressMic() {
		return suppressMic;
	}
	public void setSuppressMic(boolean suppressMic) {
		this.suppressMic = suppressMic;
	}
}
