package cn.ekgc.com;

public  class Synchronized {
	//��synchronized ���εķ�����ͬһ��ʱ�����ֻ�ܱ�һ���̷߳���
	//�ɴˣ�������synchronized �����е��̷߳�������
	public synchronized void showDetails() {
		System.out.println("ͬһʱ���֮�ظ�");
	}
	public static void main(String[] args) {
		Synchronized s= new Synchronized();
		s.showDetails();	
	}
}
