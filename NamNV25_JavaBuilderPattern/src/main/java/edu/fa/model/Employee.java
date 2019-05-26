/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.model;

import java.util.Date;

public class Employee {
	private String firstname;
	private String lastname;
	private String address;
	private String title;
	private int age;
	private Date startDate;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Employee(String firstname, String lastname, String address, String title, int age, Date startDate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.title = title;
		this.age = age;
		this.startDate = startDate;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return firstname + " " + lastname + " " + address + " " + title + " " + age + " " + startDate;
	}

}
