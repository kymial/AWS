package com.jung.realEstate.controller;

import com.jung.realEstate.dto.request.CheckIdRequestDto;
import com.jung.realEstate.dto.request.SendCodeRequestDto;
import com.jung.realEstate.dto.response.CheckIdResponseDto;
import com.jung.realEstate.dto.response.SendCodeResponeseDto;

public interface AuthController {
	CheckIdResponseDto checkID(CheckIdRequestDto request);
	SendCodeResponeseDto sendCode(SendCodeRequestDto request);
	
	
	
	
}
