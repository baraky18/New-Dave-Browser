package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class UserInfo {

	private String email;
	private String firstName;
	private String lastName;
	private String displayName;
	private PhoneNumber[] phoneNumbers;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public PhoneNumber[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
}
