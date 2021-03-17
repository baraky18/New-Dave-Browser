package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class Intent {

	private String name;
	private String displayName;
	private WebhookState webhookState;
	private int priority;
	private boolean isFallback;
	private boolean mlDisabled;
	private String[] inputContextNames;
	private String[] events;
	private TrainingPhrase[] trainingPhrases;
	private String action;
	private Context[] outputContexts;
	private boolean resetContexts;
	private Parameter parameters;
	private Message messages;
	private Platform[] defaultResponsePlatforms;
	private String rootFollowupIntentName;
	private String parentFollowupIntentName;
	private FollowupIntentInfo[] followupIntentInfo;
	private boolean endInteraction;
	
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
	public WebhookState getWebhookState() {
		return webhookState;
	}
	public void setWebhookState(WebhookState webhookState) {
		this.webhookState = webhookState;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public boolean isFallback() {
		return isFallback;
	}
	public void setFallback(boolean isFallback) {
		this.isFallback = isFallback;
	}
	public boolean isMlDisabled() {
		return mlDisabled;
	}
	public void setMlDisabled(boolean mlDisabled) {
		this.mlDisabled = mlDisabled;
	}
	public String[] getInputContextNames() {
		return inputContextNames;
	}
	public void setInputContextNames(String[] inputContextNames) {
		this.inputContextNames = inputContextNames;
	}
	public String[] getEvents() {
		return events;
	}
	public void setEvents(String[] events) {
		this.events = events;
	}
	public TrainingPhrase[] getTrainingPhrases() {
		return trainingPhrases;
	}
	public void setTrainingPhrases(TrainingPhrase[] trainingPhrases) {
		this.trainingPhrases = trainingPhrases;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Context[] getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(Context[] outputContexts) {
		this.outputContexts = outputContexts;
	}
	public boolean isResetContexts() {
		return resetContexts;
	}
	public void setResetContexts(boolean resetContexts) {
		this.resetContexts = resetContexts;
	}
	public Parameter getParameters() {
		return parameters;
	}
	public void setParameters(Parameter parameters) {
		this.parameters = parameters;
	}
	public Message getMessages() {
		return messages;
	}
	public void setMessages(Message messages) {
		this.messages = messages;
	}
	public Platform[] getDefaultResponsePlatforms() {
		return defaultResponsePlatforms;
	}
	public void setDefaultResponsePlatforms(Platform[] defaultResponsePlatforms) {
		this.defaultResponsePlatforms = defaultResponsePlatforms;
	}
	public String getRootFollowupIntentName() {
		return rootFollowupIntentName;
	}
	public void setRootFollowupIntentName(String rootFollowupIntentName) {
		this.rootFollowupIntentName = rootFollowupIntentName;
	}
	public String getParentFollowupIntentName() {
		return parentFollowupIntentName;
	}
	public void setParentFollowupIntentName(String parentFollowupIntentName) {
		this.parentFollowupIntentName = parentFollowupIntentName;
	}
	public FollowupIntentInfo[] getFollowupIntentInfo() {
		return followupIntentInfo;
	}
	public void setFollowupIntentInfo(FollowupIntentInfo[] followupIntentInfo) {
		this.followupIntentInfo = followupIntentInfo;
	}
	public boolean isEndInteraction() {
		return endInteraction;
	}
	public void setEndInteraction(boolean endInteraction) {
		this.endInteraction = endInteraction;
	}
}
