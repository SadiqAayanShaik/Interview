package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpMain {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		Employee e1 = new Employee("Aayan", 24, 80000);
		Employee e2 = new Employee("Sadiq", 23, 90000);
		Employee e3 = new Employee("Umar", 25, 85000);
		Employee e4 = new Employee("Farooq", 27, 77000);
		Employee e5 = new Employee("Aayan", 22, 60000);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e5);
		employees.add(e4);

		System.out.println("Original salary");
		System.out.println(employees);

		List<Employee> incrimentedSalary = employees.stream().map(e -> {

			if (e.getAge() > 24) {
				e.setSalary((long) (e.getSalary() * 1.10));
			}
			return e;

		}).collect(Collectors.toList());

		System.out.println("\n\tIncrimented salary who has age >25\n");
		System.out.println(incrimentedSalary);
	}

}
