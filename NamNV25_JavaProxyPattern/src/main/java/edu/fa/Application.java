/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

import edu.fa.pattern.service.ProxyService;

public class Application {

  public static void main(String[] args) {
    String username = "David";
    String password = "Beckham";
    
    // How to authenticate when Application does not know anything about EmployeeService
    ProxyService proxyService = new ProxyService();
    System.out.println(proxyService.authenticate(username, password));
  }

}
