package com.test;


public class ActionOverload {
	// ������дԭ��
	// 1 �����б������ȫ�뱻��д�ķ�����ͬ��������������д�����ص�
	// 2 ����ֵ���Ϳ��Բ�ͬ������ͬҲ�Ǹ����Ӧ��������ֵ���͵�������
	// 3����Ȩ��ֻ�ܱȸ�����ͬ���߸���
	// 4����ֻ�ܱ�������д
	// 5����final �÷������ܱ���д
	// 6����static �÷������ܱ���д
	// 7������private �÷������ܱ���д
	// 8����������д��ʱ�������е��ø÷����϶��ǵ��ñ���д��ķ���
	// ��ô��Ҫ���ñ���д�ĸ��෽����ô�죿 ��super.������(�����б�)
	// ����ʽ����
	// 9���������쳣�׳�ʱ���������Ҫ�׳��쳣����Ҫע���ʱ�׳����쳣ֻ����ͬ���߸��Ӿ��壬�����Ǹ��ӿ���������µ��쳣
	// ���磬�����׳�����IOException ,����Ͳ����׳�Exception
	// 10 ��д�ĸ��෽��ֻ�ܱ�public��protected����,ϰ���Եľ�д��protected

// ���������أ�ʵ���ǶԲ���������,��������д�ļ̳й�ϵ
//	����������������ͳһ�ķ�ʽ����ͬ���͵����ݵ�һ���ֶΡ����÷�����ͨ�����ݸ����ǵĲ�ͬ���������͵Ĳ�������������ʹ���ĸ�
//  �������⼸�Ƕ�̬�ԡ�
//	�����б�ָͬ���ǣ� ���������͡�����������˳��ͬ
// 	���ز�ע�ط���ֵ���ͣ����Ƿ���ͬ����
//	���ز�ע���쳣�������ͺ���Ŀ�������޹�
//	���ز�ע�ط������η���ֻ�������б�

	
	//�޲�
	private int test() {
		System.out.println("test1");
		return 1;
	}
	//һ������
	void test(String s) {
		System.out.println("test2");
	}
	//����������String  int 
	protected String test(String s, int i) {
		System.out.println("test3");
		return s;
	}
	//�������� int String 
	public void test(int i, String s) {
		System.out.println("test4");
	}
	
	public static void main(String[] args) {
		ActionOverload ao = new ActionOverload();
		ao.test();
		ao.test("heheda");
		ao.test(1, "memeda");
		ao.test("wahaha", 2);
	}
}
