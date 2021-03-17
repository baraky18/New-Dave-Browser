package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class SignedData {

	private Object inAppPurchaseData;
	private String inAppDataSignature;
	
	public Object getInAppPurchaseData() {
		return inAppPurchaseData;
	}
	public void setInAppPurchaseData(Object inAppPurchaseData) {
		this.inAppPurchaseData = inAppPurchaseData;
	}
	public String getInAppDataSignature() {
		return inAppDataSignature;
	}
	public void setInAppDataSignature(String inAppDataSignature) {
		this.inAppDataSignature = inAppDataSignature;
	}
}
