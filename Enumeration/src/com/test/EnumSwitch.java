package com.test;

public class EnumSwitch{
	// ��JDK1.5֮ǰ�����Ƕ��峣������public static final ...,
	// ���ں�������ö�٣����԰���صĳ��������鵽һ��ö�ٵ�������
	enum Singal {
		GREEN, YELLOW, RED;
	}
	public void test() {
		Singal color = Singal.RED;
		switch (color) {
		case RED:
			System.out.println("===read====");
			break;
		case YELLOW:
			System.out.println("===yellow====");

			break;
		case GREEN:
			System.out.println("===green====");

			break;
		default:
			System.out.println("------finish------");
		}
	}

	public static void main(String[] args) {
		EnumSwitch et = new EnumSwitch();
		et.test();

	}
}
