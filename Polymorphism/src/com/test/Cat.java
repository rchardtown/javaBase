package com.test;
//�̳г�����ʱ�������η�һ��Ҳ��Ĭ��
//�Գ������е�ÿһ�����󷽷� ��������д����������Ҳ�ǳ�����
 class Cat extends Animal{
	 @Override
	void eat() {
		 System.out.println("����");
	 }
	 @Override
	void drink() {
		 System.out.println("����");
	}
	 //�÷���ʱ�����еķǳ��󷽷���������������Ƿ����
	 @Override
	  void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	 //�����п�������Լ����еķ���
	 void work() {
		 System.out.println("ץ����");
	 }

}
