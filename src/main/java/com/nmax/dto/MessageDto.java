package com.nmax.dto;

public class MessageDto {

	private String type = "Object";
	private String message;
	
	public MessageDto() {}
	
	public MessageDto(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
