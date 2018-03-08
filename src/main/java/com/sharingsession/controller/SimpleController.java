package com.sharingsession.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sharingsession.model.SimpleObject;
import com.sharingsession.service.ISimpleService;

@RestController
public class SimpleController {
	
	private Logger log = LoggerFactory.getLogger(SimpleController.class);
	
	@Autowired
	private ISimpleService simpleService;
	
	@GetMapping("/all")
	public ResponseEntity<List<SimpleObject>> getAll() {
		return ResponseEntity.ok().body(simpleService.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Object> getById(@PathVariable("id") Long id) {
		return ResponseEntity.ok().body(simpleService.findById(id));
	}
	
	@PostMapping("/")
	public ResponseEntity<SimpleObject> post(@RequestBody SimpleObject object) {
		simpleService.saveOrUpdate(object);
		return ResponseEntity.ok().body(object);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<SimpleObject> update(@PathVariable("id") Long id, @RequestBody SimpleObject object) {
		simpleService.saveOrUpdate(object);
		return ResponseEntity.ok().body(object);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<SimpleObject> delete(@PathVariable("id") Long id) {
		return ResponseEntity.ok().body(simpleService.delete(id));
	}

}
