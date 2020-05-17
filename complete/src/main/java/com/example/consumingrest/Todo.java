package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Todo {

	private String type;
	private Event value;

	public Todo() {
	}

	public String getType() {
		return type;
	}

	public Event getValue() {
		return value;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setValue(Event value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Quote{" +
				"type='" + type + '\'' +
				", value=" + value +
				'}';
	}
}