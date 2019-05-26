/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.model;

import edu.fa.Printer;

public class Employee {
  private String name;
  private Printer printer;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Printer getPrinter() {
    return printer;
  }

  public void setPrinter(Printer printer) {
    this.printer = printer;
  }

  public Employee(String name, Printer printer) {
    super();
    this.name = name;
    this.printer = printer;
  }

  public Employee() {
    super();
  }

  @Override
  public String toString() {
    return name + " " + printer.toString();
  }

}
