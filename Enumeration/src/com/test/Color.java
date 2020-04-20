package com.test;

public enum Color {
	RED("红色", 1), GREEN("绿色", 2), YELLOW("黄色", 3);

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

	// 重载一个普通方法
	public static String getName(int index) {
		for (Color c : Color.values()) {
			if (c.getIndex() == index) {
				return c.getName();
			}
		}
		return null;
	}
}
