package com.sharingsession;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sharingsession.model.SimpleObject;

@SpringBootApplication
public class ApplicationMain {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}
	
	@Bean
	public List<SimpleObject> repositories() {
		List<SimpleObject> repositories = new ArrayList<>();
		SimpleObject so = new SimpleObject();
			so.setId(1L);
			so.setSimpleField("Simple Object");
		repositories.add(so);
		return repositories;
	}

}
