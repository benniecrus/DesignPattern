/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern;

import edu.fa.pattern.model.Employee;

public class Application {

	public static void main(String[] args) {
		SingletonPrinter singletonPrinter1 = SingletonPrinter.getSingletonPrinter("LA", "10.14.15.16", "Eastern Wing");;
		
		Employee emp1 = new Employee("David", singletonPrinter1);
		System.out.println(emp1);
		
		SingletonPrinter singletonPrinter2 = SingletonPrinter.getSingletonPrinter("LA", "10.14.15.18", "Western Wing");
		
		Employee emp2 = new Employee("Peter", singletonPrinter2);
		System.out.println(emp2);
		
	}
}
