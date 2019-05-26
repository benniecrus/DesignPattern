/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa.pattern;

public class SingletonPrinter {
	private String name;
	private String ipAddress;
	private String location;

	private static SingletonPrinter singletonPrinter;

	private SingletonPrinter(String name, String ipAddress, String location) {
		super();
		this.name = name;
		this.ipAddress = ipAddress;
		this.location = location;
		System.out.println("Created a printer...");
	}

	public static SingletonPrinter getSingletonPrinter(String name, String ipAddress, String location) {
		if (singletonPrinter == null) {
			synchronized (SingletonPrinter.class) {
				if (singletonPrinter == null) {
					singletonPrinter = new SingletonPrinter(name, ipAddress, location);
				}
			}
		}
		return singletonPrinter;
	}

	public String getName() {
		return name;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return name + " " + ipAddress + " " + location;
	}

}
