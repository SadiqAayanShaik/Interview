package com.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		 List<Employee> list=Arrays.asList(new Employee(100,"sadiq","IT","DXC"),
				                           new Employee(101,"Aayan","IT","DXC"),
				                           new Employee(102,"shaik","HR","DXC"),
				                           new Employee(103,"sadiq","manager","DXC"));
		 
		Map<String,List<Employee>> employees= list.stream().collect(Collectors.groupingBy(e->e.getDepartement()));
        
		System.out.println(employees);
	}

}
