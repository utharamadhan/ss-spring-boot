package com.sharingsession.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleObject {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("simple_field")
	private String simpleField;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSimpleField() {
		return simpleField;
	}

	public void setSimpleField(String simpleField) {
		this.simpleField = simpleField;
	}

}
