package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Money {

	private String currencyCode;
	private String amountInMicros;
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getAmountInMicros() {
		return amountInMicros;
	}
	public void setAmountInMicros(String amountInMicros) {
		this.amountInMicros = amountInMicros;
	}
}
