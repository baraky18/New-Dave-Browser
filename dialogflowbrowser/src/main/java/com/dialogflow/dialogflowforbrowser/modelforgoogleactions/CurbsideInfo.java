package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class CurbsideInfo {

	private CurbsideFulfillmentType curbsideFulfillmentType;
	private Vehicle userVehicle;
	
	public CurbsideFulfillmentType getCurbsideFulfillmentType() {
		return curbsideFulfillmentType;
	}
	public void setCurbsideFulfillmentType(CurbsideFulfillmentType curbsideFulfillmentType) {
		this.curbsideFulfillmentType = curbsideFulfillmentType;
	}
	public Vehicle getUserVehicle() {
		return userVehicle;
	}
	public void setUserVehicle(Vehicle userVehicle) {
		this.userVehicle = userVehicle;
	}
}
