package com.jung.realEstate.service;

import com.jung.realEstate.dto.request.CheckIdRequestDto;
import com.jung.realEstate.dto.request.SendCodeRequestDto;
import com.jung.realEstate.dto.response.CheckIdResponseDto;
import com.jung.realEstate.dto.response.SendCodeResponeseDto;

public interface AuthService {
	CheckIdResponseDto checkID(CheckIdRequestDto dto);
	SendCodeResponeseDto sendCode(SendCodeRequestDto dto);
}
