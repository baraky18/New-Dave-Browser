package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class OutputAudioConfig {

	private OutputAudioEncoding audioEncoding;
	private int sampleRateHertz;
	private SynthesizeSpeechConfig synthesizeSpeechConfig;
	
	public OutputAudioEncoding getAudioEncoding() {
		return audioEncoding;
	}
	public void setAudioEncoding(OutputAudioEncoding audioEncoding) {
		this.audioEncoding = audioEncoding;
	}
	public int getSampleRateHertz() {
		return sampleRateHertz;
	}
	public void setSampleRateHertz(int sampleRateHertz) {
		this.sampleRateHertz = sampleRateHertz;
	}
	public SynthesizeSpeechConfig getSynthesizeSpeechConfig() {
		return synthesizeSpeechConfig;
	}
	public void setSynthesizeSpeechConfig(SynthesizeSpeechConfig synthesizeSpeechConfig) {
		this.synthesizeSpeechConfig = synthesizeSpeechConfig;
	}
}
