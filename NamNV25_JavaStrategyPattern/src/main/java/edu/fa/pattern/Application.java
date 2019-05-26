/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern;

import java.util.Arrays;

import edu.fa.pattern.service.JuniorDeveloperTrainingService;
import edu.fa.pattern.service.JuniorTrainingService;
import edu.fa.pattern.service.TrainingService;

public class Application {

  public static void main(String[] args) {
    TrainingService trainingService = new JuniorTrainingService();
    trainingService.evaluate(Arrays.asList(new String[] {}));
    trainingService = new JuniorDeveloperTrainingService();
    trainingService.evaluate(Arrays.asList(new String[] {}));
  }

}
