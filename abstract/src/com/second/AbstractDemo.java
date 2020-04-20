package com.second;

public class AbstractDemo {
	public static void main(String[] args) {
		Salary s = new Salary("mohd", "ËÄ´¨³É¶¼", 3, 33600.0d);
		Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
		System.out.println("--------------------------");
		s.mailCheck();
		System.out.println("--------------------------");
		e.mailCheck();
	} 
}
