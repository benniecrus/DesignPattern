/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

import edu.fa.pattern.adapter.ClassAdapterService;
import edu.fa.pattern.adapter.ObjectAdapterService;
import edu.fa.service.EmployeeService;

public class ClientApplication {

  public static void main(String[] args) {
    ClientApplication application = new ClientApplication();
     application.check(new ClassAdapterService(), 2018);
     application.check(new ObjectAdapterService(), 2018);
  }

  /**
   * Display the status and salary of employee with id
   * 
   * @param empService
   */
  public void check(EmployeeService empService, int id) {
    System.out.println(empService.getDetails(id));
  }
}
