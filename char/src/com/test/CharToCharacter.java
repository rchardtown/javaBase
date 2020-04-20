package com.test;

public class CharToCharacter {
	char ch ='a';
	//unicode 的字符表示形式
	char uniChar ='\u0394';
	char [] charArray = {'a','b','c','d','e'};
	public static void main(String[] args) {
		//char 作为内置数据类型,其功能比较有限,为了适应于
		//对象使用的需求,产生了一个基于char进行封装后的包装
		//类型 Character.Character 封装了一系列对字符进行操作的方法
		
		//忽略对对过期方法的检测
		@SuppressWarnings("deprecation")
		Character ch = new Character('A');
	
		//char  和  Character 之间的相互转换,即拆\装箱行为.
		Character  c = 'a';//原始的char 类型字符 c,被装载到Character中:装箱
		//char d = test(c);  通过test()方法将Character 类型的c字符装在到字符d中:拆箱
		
		//Character 类型封装的几个字符处理的方法
		
		//判断是否是字符
		System.out.println(Character.isLetter(c));
		//数字字符isLetter 无法识别
		System.out.println(Character.isLetter('1'));
		//判断是否是数字字符
		System.out.println(Character.isDigit('1'));
		//判断是否是空白字符
		System.out.println(Character.isWhitespace(' '));
		//判断是否是大写字母
		System.out.println(Character.isUpperCase('a'));
		//判断是否是小写字母
		System.out.println(Character.isLowerCase('a'));
		//转化字符位字符串(该字符串的长度位1)
		System.out.println(Character.toString('c'));
	}
}
