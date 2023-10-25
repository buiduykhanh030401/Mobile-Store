package com.r2s.mobilestore.user.controllers;

import com.r2s.mobilestore.security.JwtTokenUtil;
import com.r2s.mobilestore.user.dtos.AuthDTO;
import com.r2s.mobilestore.user.dtos.JwtResponseDTO;
import com.r2s.mobilestore.user.entities.User;
import com.r2s.mobilestore.utils.Constants;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Represents auth controller
 *
 * @author KhanhBD
 * @since 2023-10-09
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("${user.user}")
@Validated
public class AuthController {
    private final AuthenticationManager authManager;
    @Autowired
    JwtTokenUtil jwtUtil;

    /**
     * Login handling
     *
     * @param authDTO This authentication dto
     * @return ResponseEntity
     */
    @PostMapping("${user.login}")
    public ResponseEntity<?> login(@RequestBody @Valid AuthDTO authDTO) {
        var authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authDTO.getEmail(), authDTO.getPassword()));

        var user = (User) authentication.getPrincipal();

        var token = jwtUtil.generateAccessToken(authentication);
        var jwtResponse = new JwtResponseDTO(token, Constants.AUTHORIZATION_TYPE, user.getEmail(), user.getRoles());

        // Successfully
        return new ResponseEntity<>(jwtResponse, HttpStatus.OK);
    }
}