/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.template.service;

public abstract class TrainingService {
	// concrete apply
	public void apply() {
		System.out.println("System.out.println(\"Applied Fresher Academy\");");
	}
	// abstract method: verify and enroll
	abstract void verity(String applicationId);
	
	abstract void enroll(String candidateName);
	
	// template method
	public void register(String applicationId, String candidateName) {
		apply();
		verity(applicationId);
		enroll(candidateName);
	}
}
