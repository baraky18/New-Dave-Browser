package com.dialogflow.dialogflowforbrowser.modelforgoogleactions;

public class AndroidApp {

	private String packageName;
	private VersionFilter[] versions;
	
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public VersionFilter[] getVersions() {
		return versions;
	}
	public void setVersions(VersionFilter[] versions) {
		this.versions = versions;
	}
}
