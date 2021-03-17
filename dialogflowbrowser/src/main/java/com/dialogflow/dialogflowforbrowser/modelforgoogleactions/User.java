package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

import java.util.Map;

public class User {

	private String locale;
	private Map<String, Object> params;
	private AccountLinkingStatus accountLinkingStatus;
	private UserVerificationStatus verificationStatus;
	private Engagement engagement;
	private PackageEntitlements[] packageEntitlements;
	
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	public AccountLinkingStatus getAccountLinkingStatus() {
		return accountLinkingStatus;
	}
	public void setAccountLinkingStatus(AccountLinkingStatus accountLinkingStatus) {
		this.accountLinkingStatus = accountLinkingStatus;
	}
	public UserVerificationStatus getVerificationStatus() {
		return verificationStatus;
	}
	public void setVerificationStatus(UserVerificationStatus verificationStatus) {
		this.verificationStatus = verificationStatus;
	}
	public Engagement getEngagement() {
		return engagement;
	}
	public void setEngagement(Engagement engagement) {
		this.engagement = engagement;
	}
	public PackageEntitlements[] getPackageEntitlements() {
		return packageEntitlements;
	}
	public void setPackageEntitlements(PackageEntitlements[] packageEntitlements) {
		this.packageEntitlements = packageEntitlements;
	}
}
