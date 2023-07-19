package com.cg.day4;

public class Encapsule {
	private String name;
	private int no;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	// to string method
	@Override
	public String toString() {
		return "Data [name=" + name + ", no=" + no + ", age=" + age + ", gender=" + gender + "]";
	}
	
}