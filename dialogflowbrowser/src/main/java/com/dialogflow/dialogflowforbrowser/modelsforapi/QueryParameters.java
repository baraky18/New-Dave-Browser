package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class QueryParameters {

	private String timeZone;
	private LatLng geoLocation;
	private Context[] contexts;
	private boolean resetContexts;
	private SessionEntityType[] sessionEntityTypes;
	private Object payload;
	private SentimentAnalysisRequestConfig sentimentAnalysisRequestConfig;
	private String webhookHeaders;
	
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public LatLng getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(LatLng geoLocation) {
		this.geoLocation = geoLocation;
	}
	public Context[] getContexts() {
		return contexts;
	}
	public void setContexts(Context[] contexts) {
		this.contexts = contexts;
	}
	public boolean isResetContexts() {
		return resetContexts;
	}
	public void setResetContexts(boolean resetContexts) {
		this.resetContexts = resetContexts;
	}
	public SessionEntityType[] getSessionEntityTypes() {
		return sessionEntityTypes;
	}
	public void setSessionEntityTypes(SessionEntityType[] sessionEntityTypes) {
		this.sessionEntityTypes = sessionEntityTypes;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
	public SentimentAnalysisRequestConfig getSentimentAnalysisRequestConfig() {
		return sentimentAnalysisRequestConfig;
	}
	public void setSentimentAnalysisRequestConfig(SentimentAnalysisRequestConfig sentimentAnalysisRequestConfig) {
		this.sentimentAnalysisRequestConfig = sentimentAnalysisRequestConfig;
	}
	public String getWebhookHeaders() {
		return webhookHeaders;
	}
	public void setWebhookHeaders(String webhookHeaders) {
		this.webhookHeaders = webhookHeaders;
	}
}
