package com.test;

public class Dog extends Animal {
	private String name;
	@Override //д�Ϻ��������ķ�����д���˻���ʾ
	protected String move(String name) {
		//��Ҫ���ø��෽��ʱ����super.������(�����б�)�㶨
		super.move(name);
		this.name = name;
		
		return "����Dog�����֣�"+name;
	}
	public void testDog() {
		//�����еķ���������this��������
		String s=this.move(name);
		System.out.println(s);
	}
	public static void main(String[] args) {
		Dog b = new Dog();//Dog ����
		b.move("�ڱ�");
		b.testDog();
	}
}