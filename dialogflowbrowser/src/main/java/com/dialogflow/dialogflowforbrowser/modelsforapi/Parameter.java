package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class Parameter {

	private String name;
	private String displayName;
	private String value;
	private String defaultValue;
	private String entityTypeDisplayName;
	private boolean mandatory;
	private String[] prompts;
	private boolean isList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getEntityTypeDisplayName() {
		return entityTypeDisplayName;
	}
	public void setEntityTypeDisplayName(String entityTypeDisplayName) {
		this.entityTypeDisplayName = entityTypeDisplayName;
	}
	public boolean isMandatory() {
		return mandatory;
	}
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	public String[] getPrompts() {
		return prompts;
	}
	public void setPrompts(String[] prompts) {
		this.prompts = prompts;
	}
	public boolean isList() {
		return isList;
	}
	public void setList(boolean isList) {
		this.isList = isList;
	}
}
