package com.basedata.temp;

public class BaseDataType {
	// �������ͷ�Ϊ�������������ͺͷǻ�����������
	// �����ı��ʣ����ݱ������������ڴ�������
	// һ��ռ����洢���������ݱ������͵Ĳ�ͬ��
	// ������ڴ�ռ�洢��СҲ��ͬ���ҷ���
	// �Ŀռ�Ҳֻ�������洢�������͵�����
	// java���������ͷ�Ϊ�������������ͺ�������������
	// ̸̸����������������
	static boolean flag;
	static byte b;
	static short s;
	static int i;
	static float f;
	static double d;
	static long l;
	static char c;
	static String str;
	// java �г����Ķ���
	public static float PI = 3.14f;

	public static void main(String[] args) {
		System.out.println("bit:λ��Byte:���ء��ֽڣ�1byte==8bit==8λ");
		System.out.println("--Byte�����Ƶ�λ��--");
		System.out.println(Byte.SIZE + "==" + Byte.SIZE / 8 + "���ֽ�");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("-----------------");
		System.out.println("--short�����Ƶ�λ��--");
		System.out.println(Short.SIZE + "==" + Short.SIZE / 8 + "���ֽ�");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("--Int�����Ƶ�λ��--");
		System.out.println(Integer.SIZE + "==" + Integer.SIZE / 8 + "���ֽ�");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("--Float�����Ƶ�λ��--");
		System.out.println(Float.SIZE + "==" + Float.SIZE / 8 + "���ֽ�");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println("--Double�����Ƶ�λ��--");
		System.out.println(Double.SIZE + "==" + Double.SIZE / 8 + "���ֽ�");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println("--Char�����Ƶ�λ��--");
		System.out.println(Character.SIZE + "==" + Character.SIZE / 8 + "���ֽ�");
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
		// ת����ʵ���Ǵ�С������ͬ�Ķ���֮����໥ת������ת���Ĺ����п��ܴ��ھ��ȵı任
		// ���磬��תСʱ�ľ�����ʧ��Сת��ʱ���ڴ������
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
