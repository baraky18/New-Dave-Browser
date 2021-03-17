package com.dialogflow.dialogflowforbrowser.modelsforapi;

public class SessionEntityType {

	private String name;
	private EntityOverrideMode entityOverrideMode;
	private Entity[] entities;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EntityOverrideMode getEntityOverrideMode() {
		return entityOverrideMode;
	}
	public void setEntityOverrideMode(EntityOverrideMode entityOverrideMode) {
		this.entityOverrideMode = entityOverrideMode;
	}
	public Entity[] getEntities() {
		return entities;
	}
	public void setEntities(Entity[] entities) {
		this.entities = entities;
	}
}
