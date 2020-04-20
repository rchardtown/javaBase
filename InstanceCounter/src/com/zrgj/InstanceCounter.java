package com.zrgj;


public class InstanceCounter {
	private static int numCounter = 0;
	public int i;

	protected static int getCount() {
		return InstanceCounter.numCounter;
	}

	private static void addInstance() {
		numCounter++;
		System.out.println("���Ǿ�̬����");
	}

	public InstanceCounter() {
		i++;
		InstanceCounter.addInstance();
	}

	public static void main(String[] args) {
		System.out.println("Starting with " +

				"hjh" + InstanceCounter.getCount() + "instances");
		for (int i = 0; i < 5; i++) {
			new InstanceCounter();
		}
		System.out.println("Created " + InstanceCounter.getCount() + "instances");
	}

	//final :  finalǿ�����ǲ��ܱ��޸�
	//1.final �����ࣺ���಻�ܱ��̳�
	//2.final ���η������÷����ɱ��̳У������ܱ���д
	//3.final ���α������ñ������ܱ��޸�ֵ
	
	
	//abstract :abstract �ͳ�������ֵ�������㣡�abstract ���ֵ�ΨһĿ���ǽ������������
	//final ��Ȼ��abstract ����ͬʱ����������ͬһ����
	//1.�����ᵽ����������Ϊ��
		//�������б�������ŷǳ���ķ��������Ժ�Ҫ����ķ����ó��󷽷����գ�ֻҪ���а�����
		//���󷽷���������ǳ����ࣩ����Ȼ���ʵ�����£����������У�ֻ�г��󷽷�����û�г��󷽷���
	//2.���󷽷���û���κ�ʵ�ֵķ����������ʵ���������ṩ
	//3.���󷽷�û��ʵ�壬�磺public abstract sample();
	
}
