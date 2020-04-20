package com.test;

public class SubClass2  extends SuperClass{
	//人为改变对父类构造器的调用顺序
	
	private int n ;
	//在子无参中调用父类的有参
	SubClass2(){
		super(200);//需要时可以调用
		//子类构造方法
		System.out.println("SubClass2");
	}
	//父类的无参只能在子类的有参中调用了
	SubClass2(int n ){
		//自动调用父类的无参构造方法
		//子类的有参构造方法
		System.out.println("SubClass2(int n )"+ n);
		this.n = n;
		
	}
	
	
}
