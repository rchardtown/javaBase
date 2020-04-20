package com.test;

public class Exception {
//�쳣�ķ��ࣺ1���û�����Ƿ����ݣ�2��Ҫ�򿪵��ļ������ڣ�����ͨ�������жϣ���JVM�ڴ����
//�����յ������쳣��������쳣������ʱ�쳣������
	// ������쳣��
	// ��ߴ����Եļ�����쳣�������û��Ĵ��������������쳣�����ǳ���Ա�޷�Ԥ���ġ�����Ҫ��
	// �����ڵ��ļ�ʱ���쳣�ͷ����ˣ���Щ�쳣�ڱ���ʱ���ܱ��򵥵غ���
	// ����ʱ�쳣��
	// ����ʱ�쳣�ǿ��ܱ����������쳣���������쳣�෴���ǣ�����ʱ���쳣���ڱ���ʱ������
	// ����
	// �������쳣�������������Ա���Ƶ����⡣�����ڴ�����ͨ�������ԡ����磬��ջ���ʱ��һ������ͷ����ˣ������ڱ���ʱҲ��鲻���ġ�
//Exception��Ĳ��
	// ���е��쳣������java.lang.Exception��̳е�����
	// Exception��Error�̳и���Throwable
	// java ����һ�㲻������󡣴���һ�㷢���ڳ����������ع���ʱ��������java��������������֮�⡣
	// Error����ֻ������ʱ���������Ĵ������磺JVM�ڴ�����ȡ�һ��ĳ���û�������Ӵ����лָ�
//���ϣ�
	// Throwable:
	// Error:
	// Exception:
	// IoException(������쳣)
	// RuntimeExcetion(����ʱ�쳣)
//Java�з�װ�õ��쳣��
	// 1.��׼���е��쳣������Ҫ����������ʱ���쳣�ࣩ
	// Java������ʱ���쳣��Exception��������������쳣�����쳣�ࡣ����java.lang ����Ĭ�ϼ��ص����е�java ����ģ����Դ󲿷ֵ�
	// ������ʱ���쳣���м̳ж������쳣���Ϳ���ֱ��ʹ��
	// 2.Java������һЩ���˱�׼�����쳣֮��ķǼ�����쳣
	// ArithmeticException �������쳣
	// ArrayStoreException :��ͼ���������͵����ݴ洢��һ������������
	// ArrayIndexOutOfBoundsException �����������Ϊ������ڵ�������Ĵ�С��������������
	// ClassCastException :����ת���쳣����ͼ������ת��Ϊ����ʵ��������ʱ�׳����쳣
	// ILLegalArgumentException :�Ƿ������쳣���򷽷����ݵĲ���һ���Ϸ��Ĳ���
	// IllegalMonitorStateException
	// ���׳����쳣����ĳһ�߳��Ѿ���ͼ�ȴ�����ļ�������������ͼ֪ͨ�������ڵȴ�����ļ�����������û��ָ�����������̡߳�
	// IllegalStateException �� �ڷǷ����ʵ���ʱ����÷���ʱ�������źš����仰˵���� Java ������ Java
	// Ӧ�ó���û�д������������Ҫ����ʵ�״̬�¡�
	// IllegalThreadStateException ���߳�û�д������������Ҫ����ʵ�״̬ʱ���׳����쳣
	// IndexOutOfBoundsException �����������쳣��ָʾĳ�����������ַ��������������飩������Χ
	// NegativeArraySizeException :����Ӧ����ͼ������СΪ����������ʱ�׳�
	// NullPointerException ����������ͼ����Ҫ����ĵط�ʹ��nullʱ�׳�
	// NumberFormatException: ������˾ͽ��һ���ַ���ת��Ϊ��ֵ�������ַ�������ת��Ϊ���ʵĸ�ʽʱ�׳�
	// SecurityException�� �ɰ�ȫ�������׳����쳣��ֻ�Ǵ��ڰ�ȫ�ַ�
	// StringIndexOutOfBoundsException ���ַ�������Ϊ�������߳����ַ�����Сʱ�׳�
	// UnsupportedOperationException ������֧���������ʱ�׳�
	// 3.java.lang �еļ�����쳣��
	// ClassNotFoundException ��������ͼȥ�����࣬����û���ҵ���Ӧ���࣬�׳��쳣��
	// CloneNotSupportedException : ������ Object ���е� clone ������¡���󣬵��ö�������޷�ʵ�� Cloneable
	// �ӿ�ʱ���׳����쳣
	// ILLeagalAccessException :�ܾ�����һ����ʱ���׳����쳣
	// InstantiationException ������ͼʹ�� Class ���е� newInstance
	// ��������һ�����ʵ������ָ�����������Ϊ��һ���ӿڻ���һ����������޷�ʵ����ʱ���׳����쳣
	// InterruptedException ��һ���̱߳���һ���߳��жϣ��׳����쳣��
	// NoSuchFiledException : ����ı���������
	// NoSuchMethodException :����ķ���������
// ������Throwable�����Ҫ������
	// public String getMessage():
	// ���ط������쳣����ϸ��Ϣ�������Ϣ��Throwable��Ĺ��췽���г�ʼ����
	// public Throwable getCause():
	// ����Throwable��������쳣ԭ��
	// public String toString():
	// ʹ��getMessage()�Ľ��������Ĵ�������
	// public void printStackTrace():
	// ��ӡtoString()�Ľ����ջ��ε�System.err,�����������
	// public StackTranceElement [] getStackTrace():
	// ����һ��������ջ��ε����顣�±�Ϊ0��Ԫ�ر�ʾջ�������һ��Ԫ�ش��������ö�ջ��ջ��
	// public Throwable filllnStack Trace():
	// �õ�ǰ�ĵ���ջ������Throwablle����ջ��Σ���ӵ�ջ����κ���ǰ��Ϣ��
	public static void main(String[] args) {
		int [] a= new int[2];
		try {
			System.out.println("Access Element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown :"+e);
		}
		
	}

}
