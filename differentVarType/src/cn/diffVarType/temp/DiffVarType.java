package cn.diffVarType.temp;

public class DiffVarType {
	private static int allClicks = 0;
	private String str = "hello world";
	private double salary;
	public String name;
	public static String  ss ="静态变量";
	// ctrl +shift + o 删除多余的包
//访问修饰符：进行访问权限限定的修饰符号
	public void method() {
		allClicks = 2;
		System.out.println(allClicks);
	}

	public void temp() {
		int i = 1;
		System.out.println("i == " + i);
	}

	public static void main(String[] args) {
		DiffVarType df = new DiffVarType("peter");
		df.method();
		df.temp();
		System.out.println("局部变量i的声明周期已经结束");
		// 局部变量，因为是在方法，构造方法，语句块中执行的代码，
		// 一旦脱离了这些方法，它的生命周期立即就结束。所以，
		// 1.它不需要也不能被访问修饰符修饰；
		// 2.此外，局部变量没有初始值，所以一定要初始化
		// ---------------------------------------------------

		// 实例变量：当一个对象被创建的时候，实例变量也随之被创建
		// 实例变量的和对象同生死，它是随着类的实例化创建而开始生命的
		// 因此，在整个类中他都能被访问。如果要让其他类访问，则需要根
		// 据访问的范围添加对应的访问修饰符
		// 一般会将实例变量设为私有：private ,这样将只有该类中可见
		// -----------------------------------------------------
		// 实例变量的赋值方式：1.声明时就赋值2.构造方法中赋值3.如果不能
		// 在一开始的时候就对实例变量进行赋值，那么可以写方法专门进行赋值，
		// 这种更适用于实际业务中。一般默认的是使用setXxx的方法进行赋值
		
		System.out.println("111111111");
		System.out.println();
		DiffVarType dvt= new DiffVarType("Tom");
		dvt.setSalary(10000);
		dvt.printDiffVarType();
		System.out.println(DiffVarType.ss);
	}

	public DiffVarType(String name) {
		this.name = name;
	}

	public void setSalary(double empSalary) {
		salary = empSalary;
		System.out.println(ss);
	}

	public void printDiffVarType() {
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
	}

	//静态变量：
	//特点：static 修饰
	//与实例变量区别：1.生命周期达到程序结束时才销毁2.所以他的访问修饰符用public
	//访问方式不同：ClassName.VariableName  访问,例如：  DiffVarType.ss
}	