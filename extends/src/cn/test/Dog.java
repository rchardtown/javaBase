package cn.test;

public class Dog extends Animal {
	//子类可以重写父类的方法，作为子类的方法来用
	void eat() {System.out.println("Dog : eat");}
	//当子类重写了父类的方法后，在类中子既可以调用父类的方法，也可以调用子类中重写后的该方法
	void eatTest() {
		//通过super来调用父类的eat方法
		super.eat();
		//通过this 来调用子类重写的eat方法
		this.eat();
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eat();
		d.eatTest();
	}
}


//
//Animal : eat
//Dog : eat
//Animal : eat
//Dog : eat