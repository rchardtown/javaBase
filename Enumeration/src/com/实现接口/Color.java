package com.ʵ�ֽӿ�;

public enum Color implements Behaviour {
	RED("��ɫ", 1), GREEN("��ɫ", 2), YELLOW("��ɫ", 3);

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
