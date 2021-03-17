package com.dialogflow.dialogflowforbrowser.modelsforapi;

import java.io.Serializable;

public class ApiRequest implements Serializable{


	private static final long serialVersionUID = 2080024988942984848L;
	
	private QueryParameters queryParams;
	private QueryInput queryInput;
	private OutputAudioConfig outputAudioConfig;
	private String outputAudioConfigMask;
	private String inputAudio;
	
	public ApiRequest() {}
	
	public QueryParameters getQueryParams() {
		return queryParams;
	}
	public void setQueryParams(QueryParameters queryParams) {
		this.queryParams = queryParams;
	}
	public QueryInput getQueryInput() {
		return queryInput;
	}
	public void setQueryInput(QueryInput queryInput) {
		this.queryInput = queryInput;
	}
	public OutputAudioConfig getOutputAudioConfig() {
		return outputAudioConfig;
	}
	public void setOutputAudioConfig(OutputAudioConfig outputAudioConfig) {
		this.outputAudioConfig = outputAudioConfig;
	}
	public String getOutputAudioConfigMask() {
		return outputAudioConfigMask;
	}
	public void setOutputAudioConfigMask(String outputAudioConfigMask) {
		this.outputAudioConfigMask = outputAudioConfigMask;
	}
	public String getInputAudio() {
		return inputAudio;
	}
	public void setInputAudio(String inputAudio) {
		this.inputAudio = inputAudio;
	}
}
