package com.ex.model;

public class UserReg {
	int uid;
	String name;
	String email;
	int age;
	
	public UserReg()	{}
	
	public UserReg( String name, String email, int age) {
		super();	
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public UserReg(int uid, String name, String email, int age) {
		super();
		this.uid = uid;			this.name = name;
		this.email = email;		this.age = age;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserReg [uid=" + uid + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	} 
	
}
