package com.sharingsession;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("sit")
@Configuration
@ConfigurationProperties(prefix = "sharingsession.sit")
public class ApplicationPropertiesSIT {
	
	private String test;
	
	public String getTest() {
		return test;
	}
	
	public void setTest(String test) {
		this.test = test;
	}

}
