package com.enployee;

public class EmployeeTest {
	public static void main(String[] args) {
		//创建实例对象，分三步走：1：声明2：创建3：初始化
		Emoloyee enployee = new Emoloyee("Runoob");
		enployee.setAge(10);
		enployee.setDesignation("java中级开发工程师");
		enployee.setSalary(1000);
		enployee.printEmployee();
	}
}
