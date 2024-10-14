package com.inexture.sso.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointsController {
  
	@RequestMapping("/userInfo")
	public  String userInfo(@AuthenticationPrincipal Jwt jwt) {
		System.out.println("User Ifo Calling");
		return "Hello"+jwt.getSubject();
	}
}
