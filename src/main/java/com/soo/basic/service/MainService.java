package com.soo.basic.service;

import org.springframework.http.ResponseEntity;

import com.soo.basic.dto.request.PatchNicknameRequestDto;
import com.soo.basic.dto.request.PostUserRequestDto;
import com.soo.basic.dto.request.SignInRequestDto;
import com.soo.basic.dto.response.DeleteUserResponseDto;
import com.soo.basic.dto.response.PatchNicknameResponseDto;
import com.soo.basic.dto.response.PostUserResponseDto;
import com.soo.basic.dto.response.SignInResponseDto;

public interface MainService {
    
    String getMethod();
    ResponseEntity<? super PostUserResponseDto> postUser(PostUserRequestDto dto);
    ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto);
    ResponseEntity<? super DeleteUserResponseDto> deleteUser(String email);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);

}
