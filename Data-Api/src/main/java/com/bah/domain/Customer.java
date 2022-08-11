package com.bah.domain;

public class Customer {
	private String name, pass, email;
	private int id;
	
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Customer(int id, String name, String pass, String email) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.email = email;
	}

}
