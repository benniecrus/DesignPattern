/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.template;

import edu.fa.pattern.template.service.JuniorTrainingService;
import edu.fa.pattern.template.service.SeniorTrainingService;
import edu.fa.pattern.template.service.TrainingService;

public class Application {
	public static void main(String[] args) {
		TrainingService juniorTrainingService = new JuniorTrainingService();
		juniorTrainingService.register("Application 1", "David");
		System.out.println("-----");
		TrainingService seniorTrainingService = new SeniorTrainingService();
		seniorTrainingService.register("Application 2", "Peter");
	}
}
