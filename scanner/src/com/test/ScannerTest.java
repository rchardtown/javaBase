package com.test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		float f = 0.00f;
		System.out.println("�������� ��");
		//�ж��Ƿ�����������
		if (scanner.hasNextInt()) {
			i= scanner.nextInt();
			System.out.println("�������"+i);
		}else {
			System.out.println("����Ĳ�������");
		}
		System.out.println("����С��");
		if (scanner.hasNextFloat()) {
			f = scanner.nextFloat();
			System.out.println("С�����ݣ�"+f);
		}else {
			System.out.println("����Ĳ���С��");
		}
	}
}
