package com.enployee;

public class EmployeeTest {
	public static void main(String[] args) {
		//����ʵ�����󣬷������ߣ�1������2������3����ʼ��
		Emoloyee enployee = new Emoloyee("Runoob");
		enployee.setAge(10);
		enployee.setDesignation("java�м���������ʦ");
		enployee.setSalary(1000);
		enployee.printEmployee();
	}
}
