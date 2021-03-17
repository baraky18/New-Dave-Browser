package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class MediaContent {

	private MediaType mediaType;
	private ResponseMediaObject[] mediaObjects;
	
	public MediaType getMediaType() {
		return mediaType;
	}
	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
	
	public ResponseMediaObject[] getMediaObjects() {
		return mediaObjects;
	}
	public void setMediaObjects(ResponseMediaObject[] mediaObjects) {
		this.mediaObjects = mediaObjects;
	}
}
