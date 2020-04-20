package com.实现接口;

public enum Color implements Behaviour {
	RED("红色", 1), GREEN("绿色", 2), YELLOW("黄色", 3);

	private String name;
	private int index;

	private Color(String name, int index) {

		this.name = name;
		this.index = index;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}


}
