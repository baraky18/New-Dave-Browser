package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PurchaseReturnsInfo {

	private boolean isReturnable;
	private int daysToReturn;
	private String policyUrl;
	
	public boolean isReturnable() {
		return isReturnable;
	}
	public void setReturnable(boolean isReturnable) {
		this.isReturnable = isReturnable;
	}
	public int getDaysToReturn() {
		return daysToReturn;
	}
	public void setDaysToReturn(int daysToReturn) {
		this.daysToReturn = daysToReturn;
	}
	public String getPolicyUrl() {
		return policyUrl;
	}
	public void setPolicyUrl(String policyUrl) {
		this.policyUrl = policyUrl;
	}
}
