package com.sharingsession.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharingsession.ApplicationPropertiesDev;

@RestController
@Profile("dev")
public class TestControllerDev {
	
	private Logger log = LoggerFactory.getLogger(TestControllerDev.class);
	
	@Autowired
	private ApplicationPropertiesDev devProperties;
	
	@RequestMapping("/")
	public ResponseEntity<Object> testController() {
		log.info("message : {}", devProperties.getTest());
		return ResponseEntity.ok().body(devProperties.getTest());
	}

}
