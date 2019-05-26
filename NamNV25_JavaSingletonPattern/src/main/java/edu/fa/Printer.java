/*
 * (C) Copyright 2018 Fresher Academy. All Rights Reserved.
 *
 * @author viettn.admin
 * @date Apr 20, 2018
 * @version 1.0
 */
package edu.fa;

public class Printer {
  private String name;
  private String ipAddress;
  private String location;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Printer(String name, String ipAddress, String location) {
    super();
    this.name = name;
    this.ipAddress = ipAddress;
    this.location = location;
    System.out.println("Created a printer...");
  }

  public Printer() {
    super();
  }

  @Override
  public String toString() {
    return name + " " + ipAddress + " " + location;
  }

}
