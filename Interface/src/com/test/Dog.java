package com.test;

//ʵ�ֽӿ�ʱ���������η�����Ϊpublic
public class Dog implements Animal {
	// ʵ�ֽӿ��еĳ��󷽷�ʱ���������η�������public
	@Override
	public void eat() {
		System.out.println("Dog eat ��ͷ");
	}

	@Override
	public void drink() {
		System.out.println("Dog drink ˮ");
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
