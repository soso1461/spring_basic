package com.soo.basic.service;

import org.springframework.http.ResponseEntity;

import com.soo.basic.dto.request.PostUserRequestDto;
import com.soo.basic.dto.response.PostUserResponseDto;

public interface MainService {
    
    String getMethod();
    ResponseEntity<? super PostUserResponseDto> postUser(PostUserRequestDto dto);

}
