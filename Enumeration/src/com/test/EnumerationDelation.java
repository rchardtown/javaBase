package com.test;

import java.util.Enumeration;
import java.util.Vector;

//枚举：指从对象集合中一次一个的获取数据的方式

//枚举声明的方法：boolean hasMoreElements(), Object nextElement()
public class EnumerationDelation {

	public static void main(String[] args) {
		// 定义枚举集合
		Enumeration<String> days;
		// 定义一个动态数组
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		//将动态数组中的元素赋值为枚举对象
		days= dayNames.elements();
		//判断枚举对象中是否存在元素，存在则打印
		while (days.hasMoreElements()) {
			String string = (String) days.nextElement();
			System.out.println(string);
		}
			
		
	}
}
