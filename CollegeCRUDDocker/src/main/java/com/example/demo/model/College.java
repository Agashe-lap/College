package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private float fees;
	private String email;
	private String address;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int id, String name, float fees, String email) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", fees=" + fees + ", email=" + email + "]";
	}
	
	
	
}
