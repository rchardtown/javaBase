package com.test;

public class VariableParameter {
	//可变参数，传递的参数个数：0 ~ 无数 
	public static void main(String[] args) {
		printMax(34,12,2,3,53.2f);
		printMax(new float [] {12,23.00f,23.20f});

	}

	public static void printMax(float ... numbers) {
		if (numbers.length == 0) {
			System.out.println("No arguement passed ");
			return ;
		}
		double res = numbers[0];
		for (int i =1;i<numbers.length;i++) {
			if(numbers[i]>res) {
				res = numbers[i];
			}
			
		}
		System.out.println("the max value is : "+res);
	}
}
