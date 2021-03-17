package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

import java.util.Map;

public class Session {

	private String id;
	private Map<String, Object> params;
	private TypeOverride[] typeOverrides;
	private String languageCode;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	public TypeOverride[] getTypeOverrides() {
		return typeOverrides;
	}
	public void setTypeOverrides(TypeOverride[] typeOverrides) {
		this.typeOverrides = typeOverrides;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
