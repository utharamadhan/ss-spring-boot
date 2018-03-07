package com.sharingsession;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
@ConfigurationProperties(prefix = "sharingsession.dev")
public class ApplicationPropertiesDev {
	
	private String test;
	
	public String getTest() {
		return test;
	}
	
	public void setTest(String test) {
		this.test = test;
	}

}
