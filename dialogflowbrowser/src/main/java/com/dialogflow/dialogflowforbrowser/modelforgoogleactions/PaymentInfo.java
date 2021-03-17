package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PaymentInfo {

	private PaymentMethodDisplayInfo paymentMethodDisplayInfo;
	private PaymentMethodProvenance paymentMethodProvenance;
	
	public PaymentMethodDisplayInfo getPaymentMethodDisplayInfo() {
		return paymentMethodDisplayInfo;
	}
	public void setPaymentMethodDisplayInfo(PaymentMethodDisplayInfo paymentMethodDisplayInfo) {
		this.paymentMethodDisplayInfo = paymentMethodDisplayInfo;
	}
	public PaymentMethodProvenance getPaymentMethodProvenance() {
		return paymentMethodProvenance;
	}
	public void setPaymentMethodProvenance(PaymentMethodProvenance paymentMethodProvenance) {
		this.paymentMethodProvenance = paymentMethodProvenance;
	}
}
