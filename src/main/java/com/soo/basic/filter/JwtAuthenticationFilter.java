package com.soo.basic.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

// description: Bearer Token 인증 방식을 사용한 JWT 인증 필터 //
// description: 역할 : Request Header의 Authorization 필드의 값을 가져와서 //
// description:        해당 토큰이 정상적인 토큰인지 확인하고 정상이 아닐 경우 요청을 거부 //
// description:        정상적인 토큰일 경우 인증된 사용자의 정보를 Controller에서 사용할 수 있도록 함 //

// description: OncePerRequestFilter를 확장하여 해당 클래스를 Filter 클래스로 만듦 //
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    // description: OncePerRequestFilter의 doFilterInternal 추상 메서드에 해당 필터에서 동작할 기능을 구현 //
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // description: Request의 Header에 있는 Authorization에서 JWT 추출 //
        
    }

    // description: Request 객체로부터 JWT 추출하는 메서드 //
    private String parseBearerToken (HttpServletRequest request) {

        // description: 1. Request 객체의 Header에서 Authorization 값을 추출 //
        String authorization = request.getHeader("Authorization");

    }
    

}
