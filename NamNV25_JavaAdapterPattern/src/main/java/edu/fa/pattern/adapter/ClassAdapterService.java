/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.adapter;

import edu.fa.service.EmployeeService;
import edu.fa.service.HrService;

public class ClassAdapterService extends HrService implements EmployeeService{

	public String getDetails(int id) {
		// TODO Auto-generated method stub
		return getStatus(id) + " " + getSalary(id);
	}
	
	
}
