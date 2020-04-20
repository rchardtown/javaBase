package com.second;

abstract class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
		System.out.println("Constructing an Employee ");
	}

	double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}

	void milCheck() {
		System.out.println("Mailinig a check to " + this.name + " " + this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNumber() {
		return number;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}
	  void mailCheck()
	   {
	      System.out.println("Mailing a check to " + this.name
	       + " " + this.address);
	   }
}
