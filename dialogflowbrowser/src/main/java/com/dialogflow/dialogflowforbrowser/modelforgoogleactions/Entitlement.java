package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Entitlement {

	private String sku;
	private SkuType skuType;
	private SignedData inAppDetails;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public SkuType getSkuType() {
		return skuType;
	}
	public void setSkuType(SkuType skuType) {
		this.skuType = skuType;
	}
	public SignedData getInAppDetails() {
		return inAppDetails;
	}
	public void setInAppDetails(SignedData inAppDetails) {
		this.inAppDetails = inAppDetails;
	}
}
