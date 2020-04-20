package com.test;
//继承抽象类时访问修饰符一般也用默认
//对抽象类中的每一个抽象方法 都必须重写，除非子类也是抽象类
 class Cat extends Animal{
	 @Override
	void eat() {
		 System.out.println("吃鱼");
	 }
	 @Override
	void drink() {
		 System.out.println("喝汤");
	}
	 //该方法时父类中的非抽象方法，根据需求决定是否调用
	 @Override
	  void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	 //子类中可以添加自己独有的方法
	 void work() {
		 System.out.println("抓老鼠");
	 }

}
