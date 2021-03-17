package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class SynthesizeSpeechConfig {

	private int speakingRate;
	private int pitch;
	private int volumeGainDb;
	private String effectsProfileId[];
	private VoiceSelectionParams voice;
	
	public int getSpeakingRate() {
		return speakingRate;
	}
	public void setSpeakingRate(int speakingRate) {
		this.speakingRate = speakingRate;
	}
	public int getPitch() {
		return pitch;
	}
	public void setPitch(int pitch) {
		this.pitch = pitch;
	}
	public int getVolumeGainDb() {
		return volumeGainDb;
	}
	public void setVolumeGainDb(int volumeGainDb) {
		this.volumeGainDb = volumeGainDb;
	}
	public String[] getEffectsProfileId() {
		return effectsProfileId;
	}
	public void setEffectsProfileId(String[] effectsProfileId) {
		this.effectsProfileId = effectsProfileId;
	}
	public VoiceSelectionParams getVoice() {
		return voice;
	}
	public void setVoice(VoiceSelectionParams voice) {
		this.voice = voice;
	}
}
