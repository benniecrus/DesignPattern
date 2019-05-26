/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern;

import edu.fa.pattern.service.ShoppingService;

public class Application {
  public static void main(String[] args) {
	  ShoppingService shoppingService = new ShoppingService();
	  shoppingService.shop("NamNV25", "password", "Macbook Super Pro");
  }
}
