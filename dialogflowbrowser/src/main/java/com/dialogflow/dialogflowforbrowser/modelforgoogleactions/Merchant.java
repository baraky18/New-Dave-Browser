package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Merchant {

	private String id;
	private String name;
	private Image image;
	private PhoneNumber[] phoneNumbers;
	private Location address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public PhoneNumber[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Location getAddress() {
		return address;
	}
	public void setAddress(Location address) {
		this.address = address;
	}
}
