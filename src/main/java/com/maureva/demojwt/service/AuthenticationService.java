package com.maureva.demojwt.service;


import com.maureva.demojwt.dto.request.SignUpRequest;
import com.maureva.demojwt.dto.request.SigninRequest;
import com.maureva.demojwt.dto.response.JwtAuthenticationResponse;


public interface AuthenticationService {
    void register(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
