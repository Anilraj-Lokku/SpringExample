package com.anil;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayinfo() {
		System.out.println("Hello" +" "+ name);
	}
}
