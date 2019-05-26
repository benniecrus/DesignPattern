/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern.service;

import edu.fa.service.CustomerService;
import edu.fa.service.PaymentService;
import edu.fa.service.ProductService;

public class ShoppingService {
  
  public void shop(String username, String password, String productName) {
	  	CustomerService customerService = new CustomerService();
	    customerService.authenticate(username, password);
	    ProductService productService = new ProductService();
	    productService.isAvailable("True");
	    customerService.updateCart(productName);
	    PaymentService paymentService = new PaymentService();
	    paymentService.checkout("Payment");
  }
}
