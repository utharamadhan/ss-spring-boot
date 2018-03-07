package com.sharingsession.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharingsession.ApplicationProperties;

@RestController
public class TestController {
	
	@Autowired
	private ApplicationProperties properties;
	
	@RequestMapping("/")
	public ResponseEntity<Object> testController() {
		return ResponseEntity.ok().body(properties.getTest());
	}

}
