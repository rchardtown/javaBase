package cn.test;

public class Encapsulation {
	private String name;
	private String idNum;
	private int age;

	public String getName() {
		
		return this.name;
	}

	public String getIdNum() {
		return idNum;

	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		//调用关键字this是为了与setName(String name)的那么区分
		this.name = name;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setAge(10);
		e.getAge();
		e.setIdNum("1000dddd");
		e.getIdNum();
		e.setName("eeee");
		e.getName();
		System.out.println("接口调用完毕！");
		
	}
}
