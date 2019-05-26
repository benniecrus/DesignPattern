/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.factory;

import edu.fa.model.Manager;
import edu.fa.model.Programmer;
import edu.fa.model.Tester;

public class Application {

	public static void main(String[] args) {

		HrFactory hrFactory = new HrFactory();

		Manager manager = (Manager) hrFactory.createEmployee("Manager");
		Tester tester = (Tester) hrFactory.createEmployee("Tester");
		Programmer programmer = (Programmer) hrFactory.createEmployee("Programmer");

		manager.work();
		tester.work();
		programmer.work();

	}

}
