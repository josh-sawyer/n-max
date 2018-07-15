package com.nmax.dto;

public class MessageDto {

	private String type = "Object";
	private String message = "You did not send a message you dummy. To add message /obj?message=YOUR MESSAGE";
	
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
