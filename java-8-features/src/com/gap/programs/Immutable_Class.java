package com.gap.programs;

/*
 How to create Immutable class in Java?
Immutable class means that once an object is created, we cannot change its content. In Java, all the 
wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. We can create our 
own immutable class as well.

Following are the requirements:

The class must be declared as final (So that child classes can’t be created)
Data members in the class must be declared as final (So that we can’t change the value of it after 
object creation)
A parameterized constructor
Getter method for all the variables in it
No setters(To not have the option to change the value of the instance variable)
 */

final class Immutable_Class {
	final String empName;
	final Integer empId;
	
	public Immutable_Class(String empName, Integer empId) {
		this.empName = empName;
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public Integer getEmpId() {
		return empId;
	}
}
