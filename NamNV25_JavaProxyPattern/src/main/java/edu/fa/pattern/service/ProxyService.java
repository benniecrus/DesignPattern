/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.service;

import edu.fa.service.EmployeeService;

public class ProxyService {
	private EmployeeService employeeService = new EmployeeService();
	
	public boolean authenticate(String userName, String password) {
		int result = employeeService.authenticate(userName, password);
		return result == 1;
	}
	
}
