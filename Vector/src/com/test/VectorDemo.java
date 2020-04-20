package com.test;

import java.util.Enumeration;
import java.util.Vector;



public class VectorDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// initial size is 3 ,increatment is 2
		Vector v = new Vector(3, 2);
		System.out.println("initial size is "+ v.size());
		System.out.println("initial capacity is "+v.capacity());
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println("------------------");
		v.addElement(1.20);
		v.addElement(0.22);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println("------------------");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		//以枚举的方式输出所有的Vector中的元素
		if (v.contains(1)) {
			Enumeration<Object> vEnum= v.elements();
			while (vEnum.hasMoreElements()) {
				Object object = (Object) vEnum.nextElement();
				System.out.println(object);
			}
			};			
		}
		
	}

