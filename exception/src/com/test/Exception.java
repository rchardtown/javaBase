package com.test;

public class Exception {
//异常的分类：1、用户输入非法数据；2、要打开的文件不存在；网络通信链接中断，或JVM内存溢出
//需掌握的三种异常：检查性异常、运行时异常、错误
	// 检查性异常：
	// 最具带表性的检查性异常是由于用户的错误和问题引起的异常，这是程序员无法预见的。例如要打开
	// 不存在的文件时，异常就发生了，这些异常在编译时不能被简单地忽略
	// 运行时异常：
	// 运行时异常是可能被程序避免的异常。与检查性异常相反的是，运行时的异常可在编译时被忽略
	// 错误：
	// 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，他们在编译时也检查不到的。
//Exception类的层次
	// 所有的异常都是由java.lang.Exception类继承的子类
	// Exception和Error继承父类Throwable
	// java 程序一般不捕获错误。错误一般发生在出现严重严重故障时，他们在java程序处理能力范畴之外。
	// Error用来只是运行时环境发生的错误。例如：JVM内存溢出等。一般的程序没有能力从错误中恢复
//综上：
	// Throwable:
	// Error:
	// Exception:
	// IoException(检查性异常)
	// RuntimeExcetion(运行时异常)
//Java中封装好的异常：
	// 1.标准库中的异常：（主要适用于运行时的异常类）
	// Java在运行时，异常类Exception的子类是最常见的异常见的异常类。由于java.lang 包是默认加载到所有的java 程序的，所以大部分的
	// 从运行时的异常类中继承而来的异常都就可以直接使用
	// 2.Java定义了一些除了标准库中异常之外的非检查性异常
	// ArithmeticException ：算数异常
	// ArrayStoreException :试图将错误类型的数据存储到一个对象数组中
	// ArrayIndexOutOfBoundsException ：数组的索引为负或大于等于数组的大小，数组索引超界
	// ClassCastException :类型转换异常，试图将对象转换为不是实例的子类时抛出的异常
	// ILLegalArgumentException :非法参数异常，向方法传递的不是一个合法的参数
	// IllegalMonitorStateException
	// ：抛出的异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器而本身没有指定监视器的线程。
	// IllegalStateException ： 在非法或不适当的时间调用方法时产生的信号。换句话说，即 Java 环境或 Java
	// 应用程序没有处于请求操作所要求的适当状态下。
	// IllegalThreadStateException ：线程没有处于请求操作所要求的适当状态时所抛出的异常
	// IndexOutOfBoundsException ：索引超界异常，指示某排序索引（字符串，向量，数组）超出范围
	// NegativeArraySizeException :程序应用试图建立大小为负数的数组时抛出
	// NullPointerException ：当程序试图在需要对象的地方使用null时抛出
	// NumberFormatException: 当程序司徒将一个字符串转换为数值，但该字符串不能转换为合适的格式时抛出
	// SecurityException： 由安全管理器抛出的异常，只是存在安全侵犯
	// StringIndexOutOfBoundsException ：字符串索引为负数或者超出字符串大小时抛出
	// UnsupportedOperationException ：当不支持请求操作时抛出
	// 3.java.lang 中的检查性异常类
	// ClassNotFoundException ：程序试图去加载类，但是没有找到相应的类，抛出异常。
	// CloneNotSupportedException : 当调用 Object 类中的 clone 方法克隆对象，但该对象的类无法实现 Cloneable
	// 接口时，抛出该异常
	// ILLeagalAccessException :拒绝访问一个类时，抛出该异常
	// InstantiationException ：当试图使用 Class 类中的 newInstance
	// 方法创建一个类的实例，而指定的类对象因为是一个接口或是一个抽象类而无法实例化时，抛出该异常
	// InterruptedException ：一个线程被另一个线程中断，抛出该异常。
	// NoSuchFiledException : 请求的变量不存在
	// NoSuchMethodException :请求的方法不存在
// 下面是Throwable类的主要方法：
	// public String getMessage():
	// 返回发生的异常的详细信息。这个消息在Throwable类的构造方法中初始化了
	// public Throwable getCause():
	// 返回Throwable对象代表异常原因
	// public String toString():
	// 使用getMessage()的结果返回类的串级名字
	// public void printStackTrace():
	// 打印toString()的结果和栈层次的System.err,即错误输出流
	// public StackTranceElement [] getStackTrace():
	// 返回一个包含堆栈层次的数组。下表为0的元素表示栈顶，最后一个元素代表方法调用堆栈的栈底
	// public Throwable filllnStack Trace():
	// 用当前的调用栈层次填充Throwablle对象栈层次，添加到栈层次任何先前信息中
	public static void main(String[] args) {
		int [] a= new int[2];
		try {
			System.out.println("Access Element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown :"+e);
		}
		
	}

}
