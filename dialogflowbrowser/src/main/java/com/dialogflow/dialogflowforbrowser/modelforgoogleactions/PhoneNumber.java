package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PhoneNumber {

	private String e164PhoneNumber;
	private String extension;
	private String preferredDomesticCarrierCode;
	
	public String getE164PhoneNumber() {
		return e164PhoneNumber;
	}
	public void setE164PhoneNumber(String e164PhoneNumber) {
		this.e164PhoneNumber = e164PhoneNumber;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getPreferredDomesticCarrierCode() {
		return preferredDomesticCarrierCode;
	}
	public void setPreferredDomesticCarrierCode(String preferredDomesticCarrierCode) {
		this.preferredDomesticCarrierCode = preferredDomesticCarrierCode;
	}
}
