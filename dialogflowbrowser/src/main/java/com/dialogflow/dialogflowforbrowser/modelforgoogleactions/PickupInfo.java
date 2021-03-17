package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class PickupInfo {

	private PickupType pickupType;
	private CurbsideInfo curbsideInfo;
	private CheckInInfo checkInInfo;
	
	public PickupType getPickupType() {
		return pickupType;
	}
	public void setPickupType(PickupType pickupType) {
		this.pickupType = pickupType;
	}
	public CurbsideInfo getCurbsideInfo() {
		return curbsideInfo;
	}
	public void setCurbsideInfo(CurbsideInfo curbsideInfo) {
		this.curbsideInfo = curbsideInfo;
	}
	public CheckInInfo getCheckInInfo() {
		return checkInInfo;
	}
	public void setCheckInInfo(CheckInInfo checkInInfo) {
		this.checkInInfo = checkInInfo;
	}
}
