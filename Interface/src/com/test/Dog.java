package com.test;

//实现接口时，访问修饰符必须为public
public class Dog implements Animal {
	// 实现接口中的抽象方法时，访问修饰符必须是public
	@Override
	public void eat() {
		System.out.println("Dog eat 骨头");
	}

	@Override
	public void drink() {
		System.out.println("Dog drink 水");
	}

	public int noOfLegs() {
		return 0;
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.drink();
		d.eat();
		d.noOfLegs();
	}
}
