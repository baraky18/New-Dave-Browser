package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class LineItem {

	private String id;
	private String name;
	private String userVisibleStateLabel;
	private Merchant provider;
	private PriceAttribute[] priceAttributes;
	private Action[] followUpActions;
	private UserInfo[] recipients;
	private Image image;
	private String description;
	private String[] notes;
	private Disclosure[] disclosures;
	private Vertical vertical;
	
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
	public String getUserVisibleStateLabel() {
		return userVisibleStateLabel;
	}
	public void setUserVisibleStateLabel(String userVisibleStateLabel) {
		this.userVisibleStateLabel = userVisibleStateLabel;
	}
	public Merchant getProvider() {
		return provider;
	}
	public void setProvider(Merchant provider) {
		this.provider = provider;
	}
	public PriceAttribute[] getPriceAttributes() {
		return priceAttributes;
	}
	public void setPriceAttributes(PriceAttribute[] priceAttributes) {
		this.priceAttributes = priceAttributes;
	}
	public Action[] getFollowUpActions() {
		return followUpActions;
	}
	public void setFollowUpActions(Action[] followUpActions) {
		this.followUpActions = followUpActions;
	}
	public UserInfo[] getRecipients() {
		return recipients;
	}
	public void setRecipients(UserInfo[] recipients) {
		this.recipients = recipients;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getNotes() {
		return notes;
	}
	public void setNotes(String[] notes) {
		this.notes = notes;
	}
	public Disclosure[] getDisclosures() {
		return disclosures;
	}
	public void setDisclosures(Disclosure[] disclosures) {
		this.disclosures = disclosures;
	}
	public Vertical getVertical() {
		return vertical;
	}
	public void setVertical(Vertical vertical) {
		this.vertical = vertical;
	}
}
