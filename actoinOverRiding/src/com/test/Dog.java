package com.test;

public class Dog extends Animal {
	private String name;
	@Override //写上后，如果子类的方法名写错了会提示
	protected String move(String name) {
		//需要调用父类方法时，用super.方法名(参数列表)搞定
		super.move(name);
		this.name = name;
		
		return "返会Dog类名字："+name;
	}
	public void testDog() {
		//子类中的方法调用用this来做区分
		String s=this.move(name);
		System.out.println(s);
	}
	public static void main(String[] args) {
		Dog b = new Dog();//Dog 对象
		b.move("黑豹");
		b.testDog();
	}
}