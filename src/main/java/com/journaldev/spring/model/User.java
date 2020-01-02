package com.journaldev.spring.model;

public class User 
{
	
	
	private String id;
	private String fname;
	private String lname;
	private String age;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "	 [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

	
}
