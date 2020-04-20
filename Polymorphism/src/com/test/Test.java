package com.test;

public class Test {
	public static void main(String[] args) {
		show(new Dog());// 以Dog对象调用show方法
		System.out.println("-----------");
		show(new Cat());// 以Cat对象调用show方法
		System.out.println("-----秀操作------");
		Animal a = new Cat();// 向上转型
		a.drink();// 调用Cat类中继承了Animal的方法
		a.eat();// 调用Cat类中继承了Animal的方法
		Cat c = (Cat) a;//向下转型调用Cat独有的方法
		c.work();

	}

	// 参数是Animal ,在传参的时候不只是Animal 可以传，Animal的子类也可以传
	// 比如Dog Cat 对象都可以
	// But :因为传递的时Animal 对象，所以他的子类Dog Cat 调用的方法只能为
	// 继承的Animal 的方法，而自己独有的方法是不能调用的，除非大转小，
	// 强转为 子类型，才可调用子类本身的方法
	public static void show(Animal a) {
		a.eat();
		a.drink();

		if (a instanceof Cat) {
			// 强转为自己的类型，目的是调用自己本身的方法
			Cat c = (Cat) a;
			c.work();
		} else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.work();
		}
	}
}
