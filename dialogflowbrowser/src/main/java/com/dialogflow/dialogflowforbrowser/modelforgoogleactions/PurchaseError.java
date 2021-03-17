package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PurchaseError {

	private ErrorType type;
	private String description;
	private String entityId;
	private PriceAttribute updatedPrice;
	private int availableQuantity;
	
	public ErrorType getType() {
		return type;
	}
	public void setType(ErrorType type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public PriceAttribute getUpdatedPrice() {
		return updatedPrice;
	}
	public void setUpdatedPrice(PriceAttribute updatedPrice) {
		this.updatedPrice = updatedPrice;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
}
