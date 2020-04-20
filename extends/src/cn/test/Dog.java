package cn.test;

public class Dog extends Animal {
	//���������д����ķ�������Ϊ����ķ�������
	void eat() {System.out.println("Dog : eat");}
	//��������д�˸���ķ������������Ӽȿ��Ե��ø���ķ�����Ҳ���Ե�����������д��ĸ÷���
	void eatTest() {
		//ͨ��super�����ø����eat����
		super.eat();
		//ͨ��this ������������д��eat����
		this.eat();
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eat();
		d.eatTest();
	}
}


//
//Animal : eat
//Dog : eat
//Animal : eat
//Dog : eat