package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������������");
		System.out.println("����end ��������");
	
		do{
			str = br.readLine();
			System.out.println(str);
		}while(! str.equals("end"));
	}
}
