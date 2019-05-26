/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern;

import java.util.Date;

import edu.fa.pattern.model.Employee;

public class Application {
	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder().setFirstName("David").setLastName("Beckham")
				.setAddress("Manchester").setTitle("Football player").setAge(45).setStartDate(new Date())
				.buildEmployee();
		// ("David", "Beckham", "Manchester", "Football Player", 45, new Date())
		System.out.println(employee);

		// Confuse parameter order
		employee = new Employee.EmployeeBuilder().setAddress("Manchester").setLastName("Beckham").setFirstName("David")
				.setTitle("Football player").setStartDate(new Date()).setAge(45).buildEmployee();
		// ("Manchester", "Beckham", "David", "Football Player", 45, new Date())
		System.out.println(employee);
	}
}
