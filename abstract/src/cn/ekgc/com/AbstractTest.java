package cn.ekgc.com;

public class AbstractTest extends AbstractClassAndAbstractMethod  {
	// 继承抽象类中的抽象方法，用到了@override
//	@Override
//	public void m() {
//		System.out.println("我继承了抽象方法：m()");
//	}
//	@Override
//	void c() {
//		System.out.println("我继承了抽象方法：C()");
//	}
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest();
//		at.m();
//		at.c();
		AbstractClassAndAbstractMethod.st();
	}
}
