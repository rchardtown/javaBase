package com.test;

public class SuperClass {
// ������ �ֳ�   ���췽�� ��   ���캯��
	private int n ;
	SuperClass() {
		System.out.println("SuperClass()");
	}

	SuperClass(int n) {
		System.out.println("SuperClass(int n)");
		this.n = n;//this.n ���n��ʵ������n ��= n ���n�ǲ���n
	}
}
