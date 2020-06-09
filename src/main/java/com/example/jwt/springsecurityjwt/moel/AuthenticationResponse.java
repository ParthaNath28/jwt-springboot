package com.example.jwt.springsecurityjwt.moel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class AuthenticationResponse {

    private final String jwt;
}
