/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

import java.util.Date;

import edu.fa.model.Employee;

public class Application {
	public static void main(String[] args) {
		Employee employee = new Employee("David", "Beckham", "Manchester", "Football Player", 45, new Date());
		System.out.println(employee);

		// Confuse parameter order
		employee = new Employee("Manchester", "Beckham", "David", "Football Player", 45, new Date());
		System.out.println(employee);
	}
}
