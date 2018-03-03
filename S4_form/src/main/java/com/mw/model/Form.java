package com.mw.model;

public class Form {
	private String name;
	private String last;
	private int age;
	private String email;
	private String language = "intermediate";
	private String gender;

	public Form() {
	}

	public Form(String name, String last, int age, String email, String language, String gender) {
		this.name = name;
		this.last = last;
		this.age = age;
		this.email = email;
		this.language = language;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
