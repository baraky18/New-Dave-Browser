package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Media {

	private MediaType mediaType;
	private String startOffset;
	private OptionalMediaControls[] optionalMediaControls;
	private MediaObject[] mediaObject;
	
	public MediaType getMediaType() {
		return mediaType;
	}
	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
	public String getStartOffset() {
		return startOffset;
	}
	public void setStartOffset(String startOffset) {
		this.startOffset = startOffset;
	}
	public OptionalMediaControls[] getOptionalMediaControls() {
		return optionalMediaControls;
	}
	public void setOptionalMediaControls(OptionalMediaControls[] optionalMediaControls) {
		this.optionalMediaControls = optionalMediaControls;
	}
	public MediaObject[] getMediaObject() {
		return mediaObject;
	}
	public void setMediaObject(MediaObject[] mediaObject) {
		this.mediaObject = mediaObject;
	}
}
