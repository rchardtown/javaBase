package cn.test;

import java.util.Scanner;

public class Reload {
//	��ν���������ؾ��������ز������������Ʋ��㣬����ֵ���ͣ��������ͺ��������ڱ�
	Scanner input = new Scanner(System.in);
	int res;

	public static void main(String[] args) {
		System.out.println("start:           ");
		Reload r1 = new Reload();
		System.out.println(r1.max_value(12.00, 11.2));
		System.out.println(r1.max_value(10, 5));
	}

	int max_value(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	double max_value(double d1, double d2) {
		if (d1 > d2)
			return d1;
		else
			return d2;
	}
}
