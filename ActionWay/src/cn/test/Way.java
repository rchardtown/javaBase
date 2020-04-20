package cn.test;

public class Way {
	static private int num1 = 1;
	static private int num2 = 2;
	void print() {
		
		System.out.println("num1  :" + num1);
		System.out.println("num2  :" + num2);
	}
//	public static void main(String[] args) {
//		Way way =new Way();
//		System.out.println("交换前");
//		way.print();
//		way.swap();
//		System.out.println("交换后");
//		way.print();
//		
//	}

	private void  swap() {
		int temp = Way.num1;
		Way.num1=Way.num2;
		Way.num2 = temp;
		System.out.println("交换成功 ！");
	}

}
