package com.jung.realEstate.dto.request;

public class SendCodeRequestDto {
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean validEamil() {
		boolean valid = email.length() <= 50;
		return valid;
	}

}
