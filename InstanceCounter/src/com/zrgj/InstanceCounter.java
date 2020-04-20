package com.zrgj;


public class InstanceCounter {
	private static int numCounter = 0;
	public int i;

	protected static int getCount() {
		return InstanceCounter.numCounter;
	}

	private static void addInstance() {
		numCounter++;
		System.out.println("我是静态方法");
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

	//final :  final强调的是不能被修改
	//1.final 修饰类：该类不能被继承
	//2.final 修饰方法：该方法可被继承，但不能被重写
	//3.final 修饰变量：该变量不能被修改值
	
	
	//abstract :abstract 和抽象类出现的意义相悖。abstract 出现的唯一目的是将该类进行扩充
	//final 自然和abstract 不能同时出现来修饰同一个类
	//1.上面提到的扩充的理解为：
		//抽象类中本身存在着非抽象的方法，将以后要扩充的方法用抽象方法留空（只要类中包含着
		//抽象方法，该类就是抽象类）。当然合适的情况下，抽象子类中，只有抽象方法或者没有抽象方法。
	//2.抽象方法是没有任何实现的方法，具体的实现由子类提供
	//3.抽象方法没有实体，如：public abstract sample();
	
}
