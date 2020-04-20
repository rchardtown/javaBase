package com.test;


public class ActionOverload {
	// 方法重写原则：
	// 1 参数列表必须完全与被重写的方法相同，这是区别了重写与重载得
	// 2 返回值类型可以不同，但不同也是父类对应方法返回值类型的子类型
	// 3访问权限只能比父类相同或者更高
	// 4方法只能被子类重写
	// 5声明final 得方法不能被重写
	// 6声明static 得方法不能被重写
	// 7声明了private 得方法不能被重写
	// 8当方法被重写了时，子类中调用该方法肯定是调用被重写后的方法
	// 那么，要调用被重写的父类方法怎么办？ 用super.方法名(参数列表)
	// 的形式即可
	// 9当父类有异常抛出时，子类必须要抛出异常。需要注意的时抛出的异常只能相同或者更加具体，而不是更加宽泛，添加了新的异常
	// 例如，父类抛出的是IOException ,子类就不能抛出Exception
	// 10 重写的父类方法只能被public和protected修饰,习惯性的就写成protected

// 方法的重载，实质是对参数的重载,不存在重写的继承关系
//	方法的重载是类以统一的方式处理不同类型的数据的一中手段。调用方法是通过传递给他们的不同个数和类型的参数来决定具体使用哪个
//  方法，这几是多态性。
//	参数列表不同指的是： 参数的类型、数量、或者顺序不同
// 	重载不注重返回值类型，其是否相同都行
//	重载不注重异常，其类型和数目与重载无关
//	重载不注重访问修饰符，只看参数列表

	
	//无参
	private int test() {
		System.out.println("test1");
		return 1;
	}
	//一个参数
	void test(String s) {
		System.out.println("test2");
	}
	//两个参数，String  int 
	protected String test(String s, int i) {
		System.out.println("test3");
		return s;
	}
	//两个参数 int String 
	public void test(int i, String s) {
		System.out.println("test4");
	}
	
	public static void main(String[] args) {
		ActionOverload ao = new ActionOverload();
		ao.test();
		ao.test("heheda");
		ao.test(1, "memeda");
		ao.test("wahaha", 2);
	}
}
