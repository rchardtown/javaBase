package com.test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		float f = 0.00f;
		System.out.println("输入整数 ：");
		//判断是否有整数输入
		if (scanner.hasNextInt()) {
			i= scanner.nextInt();
			System.out.println("输出整数"+i);
		}else {
			System.out.println("输入的不是整数");
		}
		System.out.println("输入小数");
		if (scanner.hasNextFloat()) {
			f = scanner.nextFloat();
			System.out.println("小数数据："+f);
		}else {
			System.out.println("输入的不是小数");
		}
	}
}
