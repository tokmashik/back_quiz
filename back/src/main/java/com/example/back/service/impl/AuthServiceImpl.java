package com.example.back.service.impl;

import com.example.back.domain.user.User;
import com.example.back.service.AuthService;
import com.example.back.service.UserService;
import com.example.back.web.dto.auth.JwtRequest;
import com.example.back.web.dto.auth.JwtResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {


    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
