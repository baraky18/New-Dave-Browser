package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PurchaseOrderExtension implements Vertical {

	private PurchaseStatus status;
	private String userVisibleStatusLabel;
	private PurchaseType type;
	private PurchaseReturnsInfo returnsInfo;
	private PurchaseFulfillmentInfo fulfillmentInfo;
	private PurchaseLocationType purchaseLocationType;
	private PurchaseError[] errors;
	private Object extension;
	
	public PurchaseStatus getStatus() {
		return status;
	}
	public void setStatus(PurchaseStatus status) {
		this.status = status;
	}
	public String getUserVisibleStatusLabel() {
		return userVisibleStatusLabel;
	}
	public void setUserVisibleStatusLabel(String userVisibleStatusLabel) {
		this.userVisibleStatusLabel = userVisibleStatusLabel;
	}
	public PurchaseType getType() {
		return type;
	}
	public void setType(PurchaseType type) {
		this.type = type;
	}
	public PurchaseReturnsInfo getReturnsInfo() {
		return returnsInfo;
	}
	public void setReturnsInfo(PurchaseReturnsInfo returnsInfo) {
		this.returnsInfo = returnsInfo;
	}
	public PurchaseFulfillmentInfo getFulfillmentInfo() {
		return fulfillmentInfo;
	}
	public void setFulfillmentInfo(PurchaseFulfillmentInfo fulfillmentInfo) {
		this.fulfillmentInfo = fulfillmentInfo;
	}
	public PurchaseLocationType getPurchaseLocationType() {
		return purchaseLocationType;
	}
	public void setPurchaseLocationType(PurchaseLocationType purchaseLocationType) {
		this.purchaseLocationType = purchaseLocationType;
	}
	public PurchaseError[] getErrors() {
		return errors;
	}
	public void setErrors(PurchaseError[] errors) {
		this.errors = errors;
	}
	public Object getExtension() {
		return extension;
	}
	public void setExtension(Object extension) {
		this.extension = extension;
	}
}
