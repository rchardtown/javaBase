package com.test;

public class SuperClass {
// 构造器 又称   构造方法 或   构造函数
	private int n ;
	SuperClass() {
		System.out.println("SuperClass()");
	}

	SuperClass(int n) {
		System.out.println("SuperClass(int n)");
		this.n = n;//this.n 这个n是实例变量n ，= n 这个n是参数n
	}
}
