package com.example.demo.service;

import java.util.List;

import com.example.demo.model.College;

public interface CollegeService {
	
	public College add(College college);
	public List<College> display();
	public void delete(int id);
	public void update(College college,int id);
	
}
