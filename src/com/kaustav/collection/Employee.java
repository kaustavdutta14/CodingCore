package com.kaustav.collection;


public class Employee{
	
	public int age;
	public String firstName;
	public String lastName;

	public Employee(int age,String fname,String lname) {
		this.age = age;
		this.firstName = fname;
		this.lastName = lname;
	}
	
	@Override
	public String toString() {
		return this.firstName+" "+this.lastName+" : "+this.age;
		
	}

}
