package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Engagement {

	private IntentSubscription[] pushNotificationIntents;
	private IntentSubscription[] dailyUpdateIntents;
	
	public IntentSubscription[] getPushNotificationIntents() {
		return pushNotificationIntents;
	}
	public void setPushNotificationIntents(IntentSubscription[] pushNotificationIntents) {
		this.pushNotificationIntents = pushNotificationIntents;
	}
	public IntentSubscription[] getDailyUpdateIntents() {
		return dailyUpdateIntents;
	}
	public void setDailyUpdateIntents(IntentSubscription[] dailyUpdateIntents) {
		this.dailyUpdateIntents = dailyUpdateIntents;
	}
}
