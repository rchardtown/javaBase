package com.test;

import java.util.Enumeration;
import java.util.Vector;

//ö�٣�ָ�Ӷ��󼯺���һ��һ���Ļ�ȡ���ݵķ�ʽ

//ö�������ķ�����boolean hasMoreElements(), Object nextElement()
public class EnumerationDelation {

	public static void main(String[] args) {
		// ����ö�ټ���
		Enumeration<String> days;
		// ����һ����̬����
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		//����̬�����е�Ԫ�ظ�ֵΪö�ٶ���
		days= dayNames.elements();
		//�ж�ö�ٶ������Ƿ����Ԫ�أ��������ӡ
		while (days.hasMoreElements()) {
			String string = (String) days.nextElement();
			System.out.println(string);
		}
			
		
	}
}
