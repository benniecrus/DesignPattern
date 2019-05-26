/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

import java.util.Arrays;

import edu.fa.service.TrainingService;

public class Application {

  public static void main(String[] args) {
    TrainingService trainingService = new TrainingService();
    trainingService.evaluateJunior(Arrays.asList(new String[] {}));
    trainingService.evaluateSenior(Arrays.asList(new String[] {}));
  }
}
