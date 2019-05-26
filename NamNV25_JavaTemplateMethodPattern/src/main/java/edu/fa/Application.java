/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

import edu.fa.service.JuniorTrainingService;
import edu.fa.service.SeniorTrainingService;

public class Application {
	public static void main(String[] args) {
		JuniorTrainingService juniorTrainingService = new JuniorTrainingService();
		juniorTrainingService.apply();
		// Enroll vs Verify different way
		juniorTrainingService.enroll("David");
		juniorTrainingService.verity("Application 1");

		SeniorTrainingService seniorTrainingService = new SeniorTrainingService();
		seniorTrainingService.apply();
		// Enroll vs Verify different way
		seniorTrainingService.enroll("Peter");
		seniorTrainingService.verity("Application 2");
	}
}
