package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class Entry {

	private String name;
	private String[] synonyms;
	private EntryDisplay display;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String[] synonyms) {
		this.synonyms = synonyms;
	}
	public EntryDisplay getDisplay() {
		return display;
	}
	public void setDisplay(EntryDisplay display) {
		this.display = display;
	}
}
