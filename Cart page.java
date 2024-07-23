package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	
	private Integer sr;
	private String id ;
	private Integer password;
	
	
	
	public Cart() {
		super();
	}

	public Cart(Integer sr, String id, Integer password) {
		super();
		this.sr = sr;
		this.id = id;
		this.password = password;
	}

//getter and setter 
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getSr() {
		return sr;
	}

	public void setSr(Integer sr) {
		this.sr = sr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cart [sr=" + sr + ", id=" + id + ", password=" + password + "]";
	}

	
	
}