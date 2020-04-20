package com.second;

public class Salary extends Employee {

	private double salary;

	// ͬ���Ƿ�������д��������дһ���ǳ������ʱ�򣬹��췽���ĵ�����
	// ���������Ĺ��췽����Ĭ�ϵ��õ�
	// ���εĹ��췽�����Ǹ����Լ�����Ҫ�����Ƿ�Ҫ���õ�
	// But
	// ���ڳ�����ļ̳У�����ĺ��������췽���Ǳ���ȥ���õ�
	public Salary(String name, String address, int number, double salary) {
		// ������ʾ�ļ̳и���Ĺ��췽��
		super(name, address, number);
		// ������Լ����еĹ��췽��
		// this.salary= salary; �����Ĵ���ʽ
		setSalary(salary);// Ҳ����ͨ��set������һЩ��ʼ������
	}

	public void setSalary(double newSalary) {
		if (newSalary > 0.0) {
			this.salary = newSalary;
		}
	}
	@Override
	void mailCheck() {
		System.out.println("Within milCheck of Salary calss");
		System.out.println("Miling check to " + getName() + " with salary " + salary);
	}

	public double getSalary() {
		return salary;
	}

	double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary/getNumber();
	}
}
