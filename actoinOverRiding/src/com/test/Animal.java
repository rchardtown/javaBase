package com.test;

public class Animal {
	//��������д�ֳƸ��Ǻ͸�д
	//������дԭ��
		// 1 �����б�������ȫ�뱻��д�ķ�����ͬ��������������д�����ص�
		// 2 ����ֵ���Ϳ��Բ�ͬ������ͬҲ�Ǹ����Ӧ��������ֵ���͵�������
		// 3����Ȩ��ֻ�ܱȸ�����ͬ���߸���
		// 4����ֻ�ܱ�������д
		// 5����final �÷������ܱ���д
		// 6����static �÷������ܱ���д
		// 7������private �÷������ܱ���д
		// 8����������д��ʱ�������е��ø÷����϶��ǵ��ñ���д��ķ���
			//  ��ô��Ҫ���ñ���д�ĸ��෽����ô�죿 ��super.������(�����б�)
			//	����ʽ����
		// 9���������쳣�׳�ʱ���������Ҫ�׳��쳣����Ҫע���ʱ�׳����쳣ֻ����ͬ���߸��Ӿ��壬�����Ǹ��ӿ������������µ��쳣
			// ���磬�����׳�����IOException ,����Ͳ����׳�Exception
		// 10 ��д�ĸ��෽��ֻ�ܱ�public��protected����,ϰ���Եľ�д��protected
	
	// ���������أ�ʵ���ǶԲ���������
	//	����������������ͳһ�ķ�ʽ������ͬ���͵����ݵ�һ���ֶΡ����÷�����ͨ�����ݸ����ǵĲ�ͬ���������͵Ĳ�������������ʹ���ĸ�
	//  �������⼸�Ƕ�̬�ԡ�
	//	�����б���ָͬ���ǣ� ���������͡�����������˳��ͬ
	// 	���ز�ע�ط���ֵ���ͣ����Ƿ���ͬ����
	//	���ز�ע���쳣�������ͺ���Ŀ�������޹�
	//	���ز�ע�ط������η���ֻ�������б�
	
	
	protected String move(String name) {System.out.println("��������ƶ�");return "���ض��������֣� "+name;}
	//��д����ѡ���Եģ�heheda�����Ϳ��Բ�����д
	protected void heheda() {}
}