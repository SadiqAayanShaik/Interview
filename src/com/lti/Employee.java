package com.lti;

public class Employee {
	
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		 
	}
	@Override
	public String toString() {
		return "Salary of " + name + " is: " + salary + "\n";
	}
	

}
