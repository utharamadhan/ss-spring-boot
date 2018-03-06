package com.sharingsession.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public ResponseEntity<Object> testController() {
		return ResponseEntity.ok().body("hello world");
	}

}
