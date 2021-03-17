package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PostalAddress {

	private int revision;
	private String regionCode;
	private String languageCode;
	private String postalCode;
	private String sortingCode;
	private String administrativeArea;
	private String locality;
	private String sublocality;
	private String[] addressLines;
	private String[] recipients;
	private String organization;
	
	public int getRevision() {
		return revision;
	}
	public void setRevision(int revision) {
		this.revision = revision;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getSortingCode() {
		return sortingCode;
	}
	public void setSortingCode(String sortingCode) {
		this.sortingCode = sortingCode;
	}
	public String getAdministrativeArea() {
		return administrativeArea;
	}
	public void setAdministrativeArea(String administrativeArea) {
		this.administrativeArea = administrativeArea;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getSublocality() {
		return sublocality;
	}
	public void setSublocality(String sublocality) {
		this.sublocality = sublocality;
	}
	public String[] getAddressLines() {
		return addressLines;
	}
	public void setAddressLines(String[] addressLines) {
		this.addressLines = addressLines;
	}
	public String[] getRecipients() {
		return recipients;
	}
	public void setRecipients(String[] recipients) {
		this.recipients = recipients;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
}
