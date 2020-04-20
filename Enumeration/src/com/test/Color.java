package com.test;

public enum Color {
	RED("��ɫ", 1), GREEN("��ɫ", 2), YELLOW("��ɫ", 3);

	private String name;
	private int index;

	Color(String name, int index) {
		this.index = index;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	// ����һ����ͨ����
	public static String getName(int index) {
		for (Color c : Color.values()) {
			if (c.getIndex() == index) {
				return c.getName();
			}
		}
		return null;
	}
}
