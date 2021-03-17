package com.dialogflow.dialogflowforbrowser.modelsforapi;

import java.io.Serializable;

public class DetectIntentResponse implements Serializable{

	private static final long serialVersionUID = -6563059076351508501L;
	
	private String responseId;
	private QueryResult queryResult;
	private Status webhookStatus;
	private String outputAudio;
	private OutputAudioConfig outputAudioConfig;
	
	public DetectIntentResponse(){}
	
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public QueryResult getQueryResult() {
		return queryResult;
	}
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}
	public Status getWebhookStatus() {
		return webhookStatus;
	}
	public void setWebhookStatus(Status webhookStatus) {
		this.webhookStatus = webhookStatus;
	}
	public String getOutputAudio() {
		return outputAudio;
	}
	public void setOutputAudio(String outputAudio) {
		this.outputAudio = outputAudio;
	}
	public OutputAudioConfig getOutputAudioConfig() {
		return outputAudioConfig;
	}
	public void setOutputAudioConfig(OutputAudioConfig outputAudioConfig) {
		this.outputAudioConfig = outputAudioConfig;
	}
}
