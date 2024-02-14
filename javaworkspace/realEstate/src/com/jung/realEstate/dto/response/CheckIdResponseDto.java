package com.jung.realEstate.dto.response;

import com.jung.realEstate.interfaces.Code;

public class CheckIdResponseDto {

	private Code code;
	private String date;
	
	public CheckIdResponseDto() {}
	
	
	public CheckIdResponseDto(Code code, String date) {
		this.code = code;
		this.date = date;
	}
	
	public Code getCode() {
		return code;
	}
	
	public void setCode(Code code) {
		this.code = code;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
