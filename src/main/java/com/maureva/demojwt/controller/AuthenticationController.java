package com.maureva.demojwt.controller;


import com.maureva.demojwt.dto.request.SignUpRequest;
import com.maureva.demojwt.dto.request.SigninRequest;
import com.maureva.demojwt.dto.response.JwtAuthenticationResponse;
import com.maureva.demojwt.service.AuthenticationService;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody SignUpRequest request) {
        authenticationService.register(request);
        return ResponseEntity.ok("User Registered Successfully");
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }
}
