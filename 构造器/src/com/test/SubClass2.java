package com.test;

public class SubClass2  extends SuperClass{
	//��Ϊ�ı�Ը��๹�����ĵ���˳��
	
	private int n ;
	//�����޲��е��ø�����в�
	SubClass2(){
		super(200);//��Ҫʱ���Ե���
		//���๹�췽��
		System.out.println("SubClass2");
	}
	//������޲�ֻ����������в��е�����
	SubClass2(int n ){
		//�Զ����ø�����޲ι��췽��
		//������вι��췽��
		System.out.println("SubClass2(int n )"+ n);
		this.n = n;
		
	}
	
	
}
