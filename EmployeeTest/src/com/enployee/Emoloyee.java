package com.enployee;

public class Emoloyee {
	// 设置构造方法
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
		System.out.println("名字： "+name);
		System.out.println("年龄： "+age);
		System.out.println("薪水： "+salary);
		System.out.println("职位： "+designation);
	}
}
