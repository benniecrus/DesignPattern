/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.template.service;

public class JuniorTrainingService extends TrainingService {

	@Override
	void verity(String applicationId) {
		// TODO Auto-generated method stub
		System.out.println("Verity Junior " + applicationId);
	}

	@Override
	void enroll(String candidateName) {
		// TODO Auto-generated method stub
		System.out.println("Enroll Junior " + candidateName);
	}
}
