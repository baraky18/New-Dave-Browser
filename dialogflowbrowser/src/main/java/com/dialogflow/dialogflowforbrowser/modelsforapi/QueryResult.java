package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class QueryResult {

	private String queryText;
	private String languageCode;
	private int speechRecognitionConfidence;
	private String action;
	private Object parameters;
	private boolean allRequiredParamsPresent;
	private String fulfillmentText;
	private Message[] fulfillmentMessages;
	private String webhookSource;
	private Object webhookPayload;
	private Object[] outputContexts;
	private Intent intent;
	private int intentDetectionConfidence;
	private Object diagnosticInfo;
	private SentimentAnalysisResult sentimentAnalysisResult;
	
	public String getQueryText() {
		return queryText;
	}
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public int getSpeechRecognitionConfidence() {
		return speechRecognitionConfidence;
	}
	public void setSpeechRecognitionConfidence(int speechRecognitionConfidence) {
		this.speechRecognitionConfidence = speechRecognitionConfidence;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Object getParameters() {
		return parameters;
	}
	public void setParameters(Object parameters) {
		this.parameters = parameters;
	}
	public boolean isAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}
	public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public Message[] getFulfillmentMessages() {
		return fulfillmentMessages;
	}
	public void setFulfillmentMessages(Message[] fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}
	public String getWebhookSource() {
		return webhookSource;
	}
	public void setWebhookSource(String webhookSource) {
		this.webhookSource = webhookSource;
	}
	public Object getWebhookPayload() {
		return webhookPayload;
	}
	public void setWebhookPayload(Object webhookPayload) {
		this.webhookPayload = webhookPayload;
	}
	public Object[] getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(Object[] outputContexts) {
		this.outputContexts = outputContexts;
	}
	public Intent getIntent() {
		return intent;
	}
	public void setIntent(Intent intent) {
		this.intent = intent;
	}
	public int getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}
	public void setIntentDetectionConfidence(int intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}
	public Object getDiagnosticInfo() {
		return diagnosticInfo;
	}
	public void setDiagnosticInfo(Object diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}
	public SentimentAnalysisResult getSentimentAnalysisResult() {
		return sentimentAnalysisResult;
	}
	public void setSentimentAnalysisResult(SentimentAnalysisResult sentimentAnalysisResult) {
		this.sentimentAnalysisResult = sentimentAnalysisResult;
	}
}
