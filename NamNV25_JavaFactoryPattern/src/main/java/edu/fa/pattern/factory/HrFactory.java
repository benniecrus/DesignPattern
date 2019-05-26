/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.factory;

import edu.fa.model.Employee;
import edu.fa.model.Manager;
import edu.fa.model.Programmer;
import edu.fa.model.Tester;

public class HrFactory {
	public Employee createEmployee(String position) {

		if (position == null) {
			return null;
		}

		if ("Manager".equalsIgnoreCase(position)) {
			return new Manager();
		} else if ("Programmer".equalsIgnoreCase(position)) {
			return new Programmer();
		} else if ("Tester".equalsIgnoreCase(position)) {
			return new Tester();
		}

		return null;
	}
}
