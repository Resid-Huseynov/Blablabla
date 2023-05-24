package com.example.Blablabla.controller;

import com.example.Blablabla.dto.AuthenticationDto;
import com.example.Blablabla.dto.JwtResponseDto;
import com.example.Blablabla.repository.RoleRepository;
import com.example.Blablabla.repository.UserRepository;
import com.example.Blablabla.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtUtils jwtUtils;

//    @GetMapping("/login")
    @PostMapping("/login")
    public ResponseEntity<JwtResponseDto> getToken(@RequestBody AuthenticationDto registerDto) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(registerDto.getUsername(), registerDto.getPassword()));

        String jwt = jwtUtils.generateJwtToken(authentication);

        JwtResponseDto jwtResponseDto = new JwtResponseDto(jwt);
        return ResponseEntity.ok(jwtResponseDto);
    }
}
