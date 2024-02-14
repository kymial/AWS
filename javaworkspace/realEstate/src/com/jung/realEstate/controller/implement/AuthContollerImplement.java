package com.jung.realEstate.controller.implement;

import com.jung.realEstate.controller.AuthController;
import com.jung.realEstate.dto.request.CheckIdRequestDto;
import com.jung.realEstate.dto.request.SendCodeRequestDto;
import com.jung.realEstate.dto.response.CheckIdResponseDto;
import com.jung.realEstate.dto.response.SendCodeResponeseDto;
import com.jung.realEstate.interfaces.Code;
import com.jung.realEstate.service.AuthService;
import com.jung.realEstate.service.implement.AuthServiceImplement;

public class AuthContollerImplement implements AuthController {

	private AuthService authService;
	
	public AuthContollerImplement (AuthService authService) {
		this.authService = authService;
	}
	
	@Override
	public CheckIdResponseDto checkID(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if(!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkID(request);
		return response;
	}

	@Override
	public SendCodeResponeseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEamil();
		if (!valid) return new SendCodeResponeseDto(Code.VF, null);
		
		SendCodeResponeseDto response = authService.sendCode(request);
		return response;
	}

}