package com.basedata.temp;

public class BaseDataType {
	// 数据类型分为，基本数据类型和非基本数据类型
	// 变量的本质：根据变量的类型在内存中申请
	// 一块空间来存储变量。根据变量类型的不同，
	// 申请的内存空间存储大小也则不同，且分配
	// 的空间也只能用来存储这种类型的数据
	// java的数据类型分为：内置数据类型和引用数据类型
	// 谈谈八种内置数据类型
	static boolean flag;
	static byte b;
	static short s;
	static int i;
	static float f;
	static double d;
	static long l;
	static char c;
	static String str;
	// java 中常量的定义
	public static float PI = 3.14f;

	public static void main(String[] args) {
		System.out.println("bit:位；Byte:拜特、字节；1byte==8bit==8位");
		System.out.println("--Byte二进制的位数--");
		System.out.println(Byte.SIZE + "==" + Byte.SIZE / 8 + "个字节");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("-----------------");
		System.out.println("--short二进制的位数--");
		System.out.println(Short.SIZE + "==" + Short.SIZE / 8 + "个字节");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("--Int二进制的位数--");
		System.out.println(Integer.SIZE + "==" + Integer.SIZE / 8 + "个字节");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("--Float二进制的位数--");
		System.out.println(Float.SIZE + "==" + Float.SIZE / 8 + "个字节");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println("--Double二进制的位数--");
		System.out.println(Double.SIZE + "==" + Double.SIZE / 8 + "个字节");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println("--Char二进制的位数--");
		System.out.println(Character.SIZE + "==" + Character.SIZE / 8 + "个字节");
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println("*************************");
		System.out.println(flag);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(c);
		System.out.println(str);
		System.out.println("************\n\t********");
		System.out.println(PI);

		System.out.println("-------->>>>>------>>>>>");
		System.out.println("byte-->short-->char-->int-->float-->long-->double-->");
		// 转换的实质是大小容量不同的对象之间的相互转换，在转换的过程中可能存在精度的变换
		// 比如，大转小时的精度损失，小转大时的内存溢出等
		i = 128;
		byte by = (byte) i;
		System.out.println(by);
		double dd = 230.001d;
		byte bb = (byte) dd;
		System.out.println(bb);
		byte bye = 120;
		double ll =bye;
		System.out.println(ll);
		System.out.println("byte--short--char--int--float--long--double--");
		char c1 ='a';
		int i1 = c1;
		System.out.println(c1 + 1);
	
	}
}
