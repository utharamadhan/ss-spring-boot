package com.sharingsession.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharingsession.ApplicationPropertiesSIT;

@RestController
@Profile("sit")
public class TestControllerSit {
	
	@Autowired
	private ApplicationPropertiesSIT sitProperties;
	
	@RequestMapping("/")
	public ResponseEntity<Object> testController() {
		return ResponseEntity.ok().body(sitProperties.getTest());
	}

}
