package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.College;
import com.example.demo.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeRepository cr;
	
	@Override
	public College add(College college) {
		// TODO Auto-generated method stub
		return cr.save(college);
	}

	@Override
	public List<College> display() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public void update(College college, int id) {
		// TODO Auto-generated method stub
		college.setId(id);
		cr.save(college);
		
		
	}

}
