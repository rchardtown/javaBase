package cn;

import cn.Temp;

public class Temp{
	
//	java �������
	//1. �������
		//���������һ��ʵ��
	//��Ա���������������ʱ��ʵ����:��ɫ��ʾ����ʵ����������ʱ���ʵ������
	String beeed;
	int age;
	String color;
	//ʵ������������static���η���������������������Ψһ����Ҳ������static����
	
	static int flag;
	public void setAge(int n) {
		age = n;
	}
	public int  getAge() {
		return age;
	}
	void barking() {
	}
	void sleeping() {
	}
	//����Ĵ���
//	�����Ǹ������������ģ���Java�У��ùؼ���new����������
	//���󴴽���ȫ���̣��������ߣ�1.����2.����3.��ʼ������ʼ��ʱ���õ��ǹ��췽������ɳ�ʼ����
	public Temp(String name ) {
		System.out.println("С����������   ��" + name);
	}
	public static void main(String[] args) {
		//����           //����       //��ʼ��
		Temp temp = new Temp("TONY");
		//�ô����Ķ���������ʵ�������ͷ���
		int i = temp.age;
		//����ʵ������
		System.out.println(temp.age);
		//���ʷ���
		temp.barking();
		
		temp.setAge(10);
		System.out.println(temp.getAge());
		
		
	}
	//����ʵ�������ͷ�������Java�в��������Ե�˵����ֻ�б����ĸø���ֱ�Ϊ��ʵ����������(��̬)�����;ֲ�����
	
	}