package com.enployee;

public class Emoloyee {
	// ���ù��췽��
	String name;
	int age;
	String designation;
	double salary;

	public Emoloyee(String name) {
		this.name = name;
	}

	public void setAge(int n) {
		this.age = n;
	}

	public void setDesignation(String empdesignation) {
		this.designation = empdesignation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployee() {
		System.out.println("���֣� "+name);
		System.out.println("���䣺 "+age);
		System.out.println("нˮ�� "+salary);
		System.out.println("ְλ�� "+designation);
	}
}
