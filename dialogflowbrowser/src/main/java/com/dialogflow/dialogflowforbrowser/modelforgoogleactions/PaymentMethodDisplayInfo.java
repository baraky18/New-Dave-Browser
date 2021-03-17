package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PaymentMethodDisplayInfo {

	private PaymentType paymentType;
	private String paymentMethodDisplayName;
	private String paymentMethodVoiceName;
	
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentMethodDisplayName() {
		return paymentMethodDisplayName;
	}
	public void setPaymentMethodDisplayName(String paymentMethodDisplayName) {
		this.paymentMethodDisplayName = paymentMethodDisplayName;
	}
	public String getPaymentMethodVoiceName() {
		return paymentMethodVoiceName;
	}
	public void setPaymentMethodVoiceName(String paymentMethodVoiceName) {
		this.paymentMethodVoiceName = paymentMethodVoiceName;
	}
}
