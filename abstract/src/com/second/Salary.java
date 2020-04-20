package com.second;

public class Salary extends Employee {

	private double salary;

	// 同样是方法的重写，当你重写一个非抽象类的时候，构造方法的调用上
	// 不含参数的构造方法是默认调用的
	// 含参的构造方法，是根据自己的需要决定是否要调用的
	// But
	// 对于抽象类的继承，父类的含参数构造方法是必须去调用的
	public Salary(String name, String address, int number, double salary) {
		// 首先显示的继承父类的构造方法
		super(name, address, number);
		// 添加上自己独有的构造方法
		// this.salary= salary; 常见的处理方式
		setSalary(salary);// 也可以通过set方法做一些初始化处理
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
