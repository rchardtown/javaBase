package cn;

import cn.Temp;

public class Temp{
	
//	java 对象和类
	//1. 对象概念
		//对象是类的一个实例
	//成员变量（创建对象的时候实例化:蓝色表示在是实例被创建的时候就实例化）
	String beeed;
	int age;
	String color;
	//实例变量带上了static修饰符成了类变量，和类变量的唯一区别也是有了static修饰
	
	static int flag;
	public void setAge(int n) {
		age = n;
	}
	public int  getAge() {
		return age;
	}
	void barking() {
	}
	void sleeping() {
	}
	//对象的创建
//	对象是根据类来创建的，在Java中，用关键字new来创建对象。
	//对象创建的全过程，分三步走：1.声明2.创建3.初始化（初始化时调用的是构造方法来完成初始化）
	public Temp(String name ) {
		System.out.println("小狗的名字是   ：" + name);
	}
	public static void main(String[] args) {
		//声明           //创建       //初始化
		Temp temp = new Temp("TONY");
		//用创建的对象来访问实例变量和方法
		int i = temp.age;
		//访问实例变量
		System.out.println(temp.age);
		//访问方法
		temp.barking();
		
		temp.setAge(10);
		System.out.println(temp.getAge());
		
		
	}
	//访问实例变量和方法（在Java中不存在属性的说法，只有变量的该概念，分别为：实例变量、类(静态)变量和局部变量
	
	}