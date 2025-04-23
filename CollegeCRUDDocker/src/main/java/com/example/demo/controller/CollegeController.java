package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.College;
import com.example.demo.service.CollegeService;

@RestController
public class CollegeController {

	
	@Autowired
	private CollegeService cs;
	
	@GetMapping("/display")
	public List<College> display(){
		return cs.display();
	}
	
	@PostMapping("/add")
	public College add(@RequestBody College college) {
		return cs.add(college);
	}
	
	@DeleteMapping("/delele/{id}")
	public void delete(@PathVariable int id) {
		cs.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public void update(@RequestBody College c,@PathVariable int id) {
		cs.update(c, id);
	}
}
