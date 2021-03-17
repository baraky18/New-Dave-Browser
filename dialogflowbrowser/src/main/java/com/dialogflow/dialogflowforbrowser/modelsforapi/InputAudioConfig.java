package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class InputAudioConfig {

	private AudioEncoding audioEncoding;
	private int sampleRateHertz;
	private String languageCode;
	private boolean enableWordInfo;
	private String[] phraseHints;
	private SpeechContext[] speechContexts;
	private String model;
	private SpeechModelVariant speechModelVariant;
	private boolean singleUtterance;
	
	public AudioEncoding getAudioEncoding() {
		return audioEncoding;
	}
	public void setAudioEncoding(AudioEncoding audioEncoding) {
		this.audioEncoding = audioEncoding;
	}
	public int getSampleRateHertz() {
		return sampleRateHertz;
	}
	public void setSampleRateHertz(int sampleRateHertz) {
		this.sampleRateHertz = sampleRateHertz;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public boolean isEnableWordInfo() {
		return enableWordInfo;
	}
	public void setEnableWordInfo(boolean enableWordInfo) {
		this.enableWordInfo = enableWordInfo;
	}
	public String[] getPhraseHints() {
		return phraseHints;
	}
	public void setPhraseHints(String[] phraseHints) {
		this.phraseHints = phraseHints;
	}
	public SpeechContext[] getSpeechContexts() {
		return speechContexts;
	}
	public void setSpeechContexts(SpeechContext[] speechContexts) {
		this.speechContexts = speechContexts;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public SpeechModelVariant getSpeechModelVariant() {
		return speechModelVariant;
	}
	public void setSpeechModelVariant(SpeechModelVariant speechModelVariant) {
		this.speechModelVariant = speechModelVariant;
	}
	public boolean isSingleUtterance() {
		return singleUtterance;
	}
	public void setSingleUtterance(boolean singleUtterance) {
		this.singleUtterance = singleUtterance;
	}
}
