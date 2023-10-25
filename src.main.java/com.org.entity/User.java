package com.org.entity;

public class User {
	private int id;
	private String fullNmae;
	private String email;
	private String password;
	public User(String fullNmae, String email, String password) {
		super();
		this.fullNmae = fullNmae;
		this.email = email;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullNmae() {
		return fullNmae;
	}
	public void setFullNmae(String fullNmae) {
		this.fullNmae = fullNmae;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
