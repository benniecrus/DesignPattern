/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.service;

public class EmployeeService {
  public int authenticate(String username, String password) {
    if(username.equals("David") && password.equals("Beckham")) {
      return 1;
    }
    return 0;
  }
}
