package com.test;

public class Test {
	public static void main(String[] args) {
		show(new Dog());// ��Dog�������show����
		System.out.println("-----------");
		show(new Cat());// ��Cat�������show����
		System.out.println("-----�����------");
		Animal a = new Cat();// ����ת��
		a.drink();// ����Cat���м̳���Animal�ķ���
		a.eat();// ����Cat���м̳���Animal�ķ���
		Cat c = (Cat) a;//����ת�͵���Cat���еķ���
		c.work();

	}

	// ������Animal ,�ڴ��ε�ʱ��ֻ��Animal ���Դ���Animal������Ҳ���Դ�
	// ����Dog Cat ���󶼿���
	// But :��Ϊ���ݵ�ʱAnimal ����������������Dog Cat ���õķ���ֻ��Ϊ
	// �̳е�Animal �ķ��������Լ����еķ����ǲ��ܵ��õģ����Ǵ�תС��
	// ǿתΪ �����ͣ��ſɵ������౾��ķ���
	public static void show(Animal a) {
		a.eat();
		a.drink();

		if (a instanceof Cat) {
			// ǿתΪ�Լ������ͣ�Ŀ���ǵ����Լ�����ķ���
			Cat c = (Cat) a;
			c.work();
		} else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.work();
		}
	}
}
