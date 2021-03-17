package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class OrderUpdate {

	private Type type;
	private Order order;
	private String updateMask;
	private UserNotification userNotification;
	private String reason;
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getUpdateMask() {
		return updateMask;
	}
	public void setUpdateMask(String updateMask) {
		this.updateMask = updateMask;
	}
	public UserNotification getUserNotification() {
		return userNotification;
	}
	public void setUserNotification(UserNotification userNotification) {
		this.userNotification = userNotification;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
