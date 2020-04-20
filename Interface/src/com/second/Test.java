package com.second;

public class Test implements Football {
	@Override
	public void setHomeTeam(String name) {
		System.out.println("setHomeTeam"); // TODO Auto-generated method stub

	}

	@Override
	public void setVistingTeam(String name) {
		System.out.println("setVistingTeam");
	}

	@Override
	public void homeTeam(int points) {
		System.out.println("homeTeam");
	}
public static void main(String[] args) {
	Test t  = new Test();
	t.homeTeam(10);
	t.setHomeTeam("ydld");
	t.setVistingTeam("cxd");
}
}
