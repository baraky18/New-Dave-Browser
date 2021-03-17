package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Scene {

	private String name;
	private SlotFillingStatus slotFillingStatus;
	private Slot[] slots;
	private NextScene next;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SlotFillingStatus getSlotFillingStatus() {
		return slotFillingStatus;
	}
	public void setSlotFillingStatus(SlotFillingStatus slotFillingStatus) {
		this.slotFillingStatus = slotFillingStatus;
	}
	public Slot[] getSlots() {
		return slots;
	}
	public void setSlots(Slot[] slots) {
		this.slots = slots;
	}
	public NextScene getNext() {
		return next;
	}
	public void setNext(NextScene next) {
		this.next = next;
	}
}
