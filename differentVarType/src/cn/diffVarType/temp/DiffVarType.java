package cn.diffVarType.temp;

public class DiffVarType {
	private static int allClicks = 0;
	private String str = "hello world";
	private double salary;
	public String name;
	public static String  ss ="��̬����";
	// ctrl +shift + o ɾ������İ�
//�������η������з���Ȩ���޶������η���
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
		System.out.println("�ֲ�����i�����������Ѿ�����");
		// �ֲ���������Ϊ���ڷ��������췽����������ִ�еĴ��룬
		// һ����������Щ�����������������������ͽ��������ԣ�
		// 1.������ҪҲ���ܱ��������η����Σ�
		// 2.���⣬�ֲ�����û�г�ʼֵ������һ��Ҫ��ʼ��
		// ---------------------------------------------------

		// ʵ����������һ�����󱻴�����ʱ��ʵ������Ҳ��֮������
		// ʵ�������ĺͶ���ͬ�����������������ʵ������������ʼ������
		// ��ˣ����������������ܱ����ʡ����Ҫ����������ʣ�����Ҫ��
		// �ݷ��ʵķ�Χ��Ӷ�Ӧ�ķ������η�
		// һ��Ὣʵ��������Ϊ˽�У�private ,������ֻ�и����пɼ�
		// -----------------------------------------------------
		// ʵ�������ĸ�ֵ��ʽ��1.����ʱ�͸�ֵ2.���췽���и�ֵ3.�������
		// ��һ��ʼ��ʱ��Ͷ�ʵ���������и�ֵ����ô����д����ר�Ž��и�ֵ��
		// ���ָ�������ʵ��ҵ���С�һ��Ĭ�ϵ���ʹ��setXxx�ķ������и�ֵ
		
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

	//��̬������
	//�ص㣺static ����
	//��ʵ����������1.�������ڴﵽ�������ʱ������2.�������ķ������η���public
	//���ʷ�ʽ��ͬ��ClassName.VariableName  ����,���磺  DiffVarType.ss
}	