package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Order {

	private String googleOrderId;
	private String merchantOrderId;
	private String userVisibleOrderId;
	private String userVisibleStateLabel;
	private UserInfo buyerInfo;
	private Image image;
	private String createTime;
	private String lastUpdateTime;
	private Merchant transactionMerchant;
	private Contents contents;
	private PriceAttribute[] priceAttributes;
	private Action[] followUpActions;
	private PaymentData paymentData;
	private String termsOfServiceUrl;
	private String note;
	private Promotion[] promotions;
	private Disclosure[] disclosures;
	private Vertical vertical;
	
	public String getGoogleOrderId() {
		return googleOrderId;
	}
	public void setGoogleOrderId(String googleOrderId) {
		this.googleOrderId = googleOrderId;
	}
	public String getMerchantOrderId() {
		return merchantOrderId;
	}
	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}
	public String getUserVisibleOrderId() {
		return userVisibleOrderId;
	}
	public void setUserVisibleOrderId(String userVisibleOrderId) {
		this.userVisibleOrderId = userVisibleOrderId;
	}
	public String getUserVisibleStateLabel() {
		return userVisibleStateLabel;
	}
	public void setUserVisibleStateLabel(String userVisibleStateLabel) {
		this.userVisibleStateLabel = userVisibleStateLabel;
	}
	public UserInfo getBuyerInfo() {
		return buyerInfo;
	}
	public void setBuyerInfo(UserInfo buyerInfo) {
		this.buyerInfo = buyerInfo;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Merchant getTransactionMerchant() {
		return transactionMerchant;
	}
	public void setTransactionMerchant(Merchant transactionMerchant) {
		this.transactionMerchant = transactionMerchant;
	}
	public Contents getContents() {
		return contents;
	}
	public void setContents(Contents contents) {
		this.contents = contents;
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
	public PaymentData getPaymentData() {
		return paymentData;
	}
	public void setPaymentData(PaymentData paymentData) {
		this.paymentData = paymentData;
	}
	public String getTermsOfServiceUrl() {
		return termsOfServiceUrl;
	}
	public void setTermsOfServiceUrl(String termsOfServiceUrl) {
		this.termsOfServiceUrl = termsOfServiceUrl;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Promotion[] getPromotions() {
		return promotions;
	}
	public void setPromotions(Promotion[] promotions) {
		this.promotions = promotions;
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
