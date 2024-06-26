package com.anil1;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("This Constructor.");
	}
	
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(String name) {
		this.name= name;
	}
	
	public Employee(int id, String name){
		this.id = id;
		this.name= name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
}
