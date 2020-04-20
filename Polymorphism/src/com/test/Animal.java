package com.test;
//多态的就是对同一个接口或者抽象方法使用不同的实例而执行不同的操作

//多态的实现方式：
	// 1.方法的重写：
		// 父类的方法被不同的子类重写实现不同的功能
	// 2.接口的实现
		// 同一个接口被不同的类实现后，完成不同的功能
	// 3.抽象类和抽象方法
		//父类中的抽象方法被不同的子类实现后实现不同的功能



//抽象类的访问修饰符一般为默认的
abstract class Animal {
	//对父类的同一个抽象方法eat() ，不同的子类继承后会有不同的操作，这就是多态
	abstract void eat();

	abstract void drink();

	 void test() {
		System.out.println("heheda");
	}
}
