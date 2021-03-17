package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PaymentResult {

	private String googlePaymentData;
	private String merchantPaymentMethodId;
	
	public String getGooglePaymentData() {
		return googlePaymentData;
	}
	public void setGooglePaymentData(String googlePaymentData) {
		this.googlePaymentData = googlePaymentData;
	}
	public String getMerchantPaymentMethodId() {
		return merchantPaymentMethodId;
	}
	public void setMerchantPaymentMethodId(String merchantPaymentMethodId) {
		this.merchantPaymentMethodId = merchantPaymentMethodId;
	}
}
