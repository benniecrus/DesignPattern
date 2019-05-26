/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

import edu.fa.model.Manager;
import edu.fa.model.Programmer;
import edu.fa.model.Tester;

public class Application {

  public static void main(String[] args) {
    Manager manager = new Manager();
    Tester tester = new Tester();
    Programmer programmer = new Programmer();

    manager.work();
    tester.work();
    programmer.work();
  }

}
