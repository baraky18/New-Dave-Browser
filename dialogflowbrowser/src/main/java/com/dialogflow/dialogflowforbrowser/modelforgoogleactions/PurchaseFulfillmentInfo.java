package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PurchaseFulfillmentInfo {

	private String id;
	private com.dialogflow.dialogflowforbrowser.modelforgoogleactions.duplicatednames.Type fulfillmentType;
	private Time expectedFulfillmentTime;
	private Time expectedPreparationTime;
	private Location location;
	private String expireTime;
	private PriceAttribute price;
	private UserInfo fulfillmentContact;
	private String shippingMethodName;
	private String storeCode;
	private PickupInfo pickupInfo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public com.dialogflow.dialogflowforbrowser.modelforgoogleactions.duplicatednames.Type getFulfillmentType() {
		return fulfillmentType;
	}
	public void setFulfillmentType(
			com.dialogflow.dialogflowforbrowser.modelforgoogleactions.duplicatednames.Type fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}
	public Time getExpectedFulfillmentTime() {
		return expectedFulfillmentTime;
	}
	public void setExpectedFulfillmentTime(Time expectedFulfillmentTime) {
		this.expectedFulfillmentTime = expectedFulfillmentTime;
	}
	public Time getExpectedPreparationTime() {
		return expectedPreparationTime;
	}
	public void setExpectedPreparationTime(Time expectedPreparationTime) {
		this.expectedPreparationTime = expectedPreparationTime;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public PriceAttribute getPrice() {
		return price;
	}
	public void setPrice(PriceAttribute price) {
		this.price = price;
	}
	public UserInfo getFulfillmentContact() {
		return fulfillmentContact;
	}
	public void setFulfillmentContact(UserInfo fulfillmentContact) {
		this.fulfillmentContact = fulfillmentContact;
	}
	public String getShippingMethodName() {
		return shippingMethodName;
	}
	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public PickupInfo getPickupInfo() {
		return pickupInfo;
	}
	public void setPickupInfo(PickupInfo pickupInfo) {
		this.pickupInfo = pickupInfo;
	}
}
