package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class TrainingPhrase {

	private String name;
	private Type type;
	private Part[] part;
	private int timesAddedCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Part[] getPart() {
		return part;
	}
	public void setPart(Part[] part) {
		this.part = part;
	}
	public int getTimesAddedCount() {
		return timesAddedCount;
	}
	public void setTimesAddedCount(int timesAddedCount) {
		this.timesAddedCount = timesAddedCount;
	}
}
