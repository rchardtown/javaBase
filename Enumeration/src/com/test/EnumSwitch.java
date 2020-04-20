package com.test;

public class EnumSwitch{
	// 在JDK1.5之前，我们定义常量都是public static final ...,
	// 现在好了有了枚举，可以把相关的常量都分组到一个枚举的类型中
	enum Singal {
		GREEN, YELLOW, RED;
	}
	public void test() {
		Singal color = Singal.RED;
		switch (color) {
		case RED:
			System.out.println("===read====");
			break;
		case YELLOW:
			System.out.println("===yellow====");

			break;
		case GREEN:
			System.out.println("===green====");

			break;
		default:
			System.out.println("------finish------");
		}
	}

	public static void main(String[] args) {
		EnumSwitch et = new EnumSwitch();
		et.test();

	}
}
