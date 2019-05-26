/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

import edu.fa.model.Employee;

public class Application {

  public static void main(String[] args) {
    Printer printer1 = new Printer("LA", "10.14.15.16", "Eastern Wing");
    Employee emp1 = new Employee("David", printer1);
    System.out.println(emp1);
    
    Printer printer2 = new Printer("LA", "10.14.15.18", "Western Wing");
    Employee emp2 = new Employee("Peter", printer2);
    System.out.println(emp2);
  }
}
