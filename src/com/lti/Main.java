package com.lti;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee("Aayan", 90000);
		Employee e2=new Employee("Sadiq", 99000);
		Employee e3=new Employee("Umar", 80000);
		Employee e4=new Employee("SadiqAayan", 120000);
		
		List<Employee> list= new ArrayList<>();
		list.add(e3);
		list.add(e2);
		list.add(e4);
		list.add(e1);
		
		List<Employee> sortedlist=list.stream().sorted((s1,s2)->s2.getSalary()-s1.getSalary()).collect(Collectors.toList());
	
		System.out.println(sortedlist);
	}

}
