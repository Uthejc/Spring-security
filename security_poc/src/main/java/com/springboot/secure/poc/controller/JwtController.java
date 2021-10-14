package com.springboot.secure.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.secure.poc.entity.JwtRequest;
import com.springboot.secure.poc.entity.JwtResponse;
import com.springboot.secure.poc.service.JwtService;

@RestController
@CrossOrigin
public class JwtController {

	@Autowired
	private JwtService jwtService;

	@PostMapping({ "/authenticate" })
	public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		return jwtService.createJwtToken(jwtRequest);
	}
}
