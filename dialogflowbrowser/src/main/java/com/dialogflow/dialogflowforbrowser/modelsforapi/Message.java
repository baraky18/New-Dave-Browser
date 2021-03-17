package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class Message {

	private Platform platform;
	private Text text;
	private Image image;
	private QuickReplies quickReplies;
	private Card card;
	private Object payload;
	private SimpleResponses simpleResponses;
	private BasicCard basicCard;
	private Suggestions suggestions;
	private LinkOutSuggestion linkOutSuggestion;
	private ListSelect listSelect;
	private CarouselSelect carouselSelect;
	private BrowseCarouselCard browseCarouselCard;
	private TableCard tableCard;
	private MediaContent mediaContent;
	
	public Text getText() {
		return text;
	}
	public void setText(Text text) {
		this.text = text;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public QuickReplies getQuickReplies() {
		return quickReplies;
	}
	public void setQuickReplies(QuickReplies quickReplies) {
		this.quickReplies = quickReplies;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
	public SimpleResponses getSimpleResponses() {
		return simpleResponses;
	}
	public void setSimpleResponses(SimpleResponses simpleResponses) {
		this.simpleResponses = simpleResponses;
	}
	public BasicCard getBasicCard() {
		return basicCard;
	}
	public void setBasicCard(BasicCard basicCard) {
		this.basicCard = basicCard;
	}
	public Suggestions getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(Suggestions suggestions) {
		this.suggestions = suggestions;
	}
	public LinkOutSuggestion getLinkOutSuggestion() {
		return linkOutSuggestion;
	}
	public void setLinkOutSuggestion(LinkOutSuggestion linkOutSuggestion) {
		this.linkOutSuggestion = linkOutSuggestion;
	}
	public ListSelect getListSelect() {
		return listSelect;
	}
	public void setListSelect(ListSelect listSelect) {
		this.listSelect = listSelect;
	}
	public CarouselSelect getCarouselSelect() {
		return carouselSelect;
	}
	public void setCarouselSelect(CarouselSelect carouselSelect) {
		this.carouselSelect = carouselSelect;
	}
	public BrowseCarouselCard getBrowseCarouselCard() {
		return browseCarouselCard;
	}
	public void setBrowseCarouselCard(BrowseCarouselCard browseCarouselCard) {
		this.browseCarouselCard = browseCarouselCard;
	}
	public TableCard getTableCard() {
		return tableCard;
	}
	public void setTableCard(TableCard tableCard) {
		this.tableCard = tableCard;
	}
	public MediaContent getMediaContent() {
		return mediaContent;
	}
	public void setMediaContent(MediaContent mediaContent) {
		this.mediaContent = mediaContent;
	}
}
