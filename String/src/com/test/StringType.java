package com.test;


public class StringType {

	public static void main(String[] args) {
		// 字符串创建的方法
		// 1.将字符数组转换为字符串:new String(字符数组)
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', ' ', '!' };
		String helloString = new String(helloArray);
		System.out.println("helloString  :"+helloString);
		// String 是不可变的,一旦创建成功不可再更改
		String ss = helloString + "33333";
		System.out.println(ss);
		System.out.println(helloString);
		// 2.使用copyValueOff() 将数组的全部或部分进行转换为字符串
		char[] str1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!' };

		String str2 = String.copyValueOf(str1, 1, 3);
		String str3 = String.copyValueOf(str1);
		System.out.println(str2 + "  从索引1拷贝到索引3");// ell
		System.out.println(str3 + " 全部拷贝");
		// 字符串的长度
		System.out.println(ss.length());
		// 字符串的拼接
		// 常用: +
		String w = "我的名字叫 :";
		String name = "崔涛";
		System.out.println(w + name);
		// 方法二: concat()
		System.out.println(w.concat(name));
		// 创建格式化字符串
		System.out.println(String.format("字符串:+ %s" + "整数: +%d" + "浮点数: %f", "我是字符串", 1, 1.0));
		String formatString = String.format("我是字符串 : %s   \n" + "我是整型数字 :%d  \n" + "我是浮点型数字 :%f  ", "string", 1, 1.0);
		System.out.println(formatString);
		// String支持的方法
		String str = "string Sqmp";
		String comp = "string Somp";
		// 1.char charAt(int index)
		System.out.println(str.charAt(0));
		// 2.两个字符串作比较(从左往右,一次比较,输出第一个不同字符的ASCII顺序差值)
		System.out.println(str.compareTo(comp));
		// 3.不区分大小写比较字符,还是从左往右比,比到第一个不同的字符停止,输出ASCII顺序差值
		System.out.println(str.compareToIgnoreCase(comp));
		// 4.更高级别的比较,比较两个字符串的StringBuffer差值
		String s1 = "heheda";
		String s2 = "hehedada";
		StringBuffer s3 = new StringBuffer(s1);

		boolean result = s1.contentEquals(s3);
		System.out.println(result);
		boolean res = s1.contentEquals(s2);
		System.out.println(res);
		// 5.判断字符串是否以某个字符结束
		String runoob = new String("菜鸟教程:http://www.runoob.com");
		boolean runres = runoob.endsWith(".com");
		System.out.println(runres);
		// 6. equals()将字符串与另一个对象作比较,返回boolean值
		String eq1 = new String("runoob");
		String eq2 = eq1;
		String eq3 = new String("runoob");
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1.equals(eq3));
		// 7.equalsIgnoreCase() 与另一个字符串,忽略字符大小比较,返回boolean值
		String igeq1 = "hehe";
		String igeq2 = "HEHE";
		System.out.println(igeq1.equalsIgnoreCase(igeq2));
		try {
			// 8.将字符串的部分或全部按照索引拷贝给数组
			String sss = new String("targetchar[]");
			char[] ch = new char[10];
			sss.getChars(1, 6, ch, 0);//0:的位置是目标数组的起始偏移量,默认为0 就好
			System.out.println(ch); //arget:  索引顾前不顾后
		} catch (Exception e) {
			System.out.println("触发异常!");
		}
		// 8.返回字串的hash码
		String hash = new String("www.runoob.com");
		System.out.println(hash.hashCode());
		// 9.indexOf() 在字符串中查找指定字符串第一次出现的位置索引
		String strin ="fasfsasfafas";
		System.out.println("字符串a的第一个索引是 " +strin.indexOf("a"));
		//由于比较的实质是ASCII在匹配,所以也可以用字符串对应的字符编码序数来查找
		System.out.println("字符串a的第一个索引是 " +strin.indexOf(97));//已知字符a 的ASCII码序列位 97
		//另外,可以指定检索的起始位置
		System.out.println(strin.indexOf("a", 3)); //5
		// 10.lastIndexOf() 反向检索,指定字符反向出现的位置索引
		String lastStr = new String ("www.runoon.com");
		//11.字符串的长度
		String lengs= "www.baidu.com";
		System.out.println("lengs的长度为: "+lengs.length());
		//12.matches()告知此字符串是否满足匹配的正则表达式是
		String strMatch = new String("www.runoob.com");
		System.out.println(strMatch.matches("(.*)runoob(.*)"));
		System.out.println(strMatch.matches("www(.*)"));
		//13.regionMatches()判断两个字符串在指定区域内是否匹配
		String strReg1 = new String("www.runoob.com");
		String strReg2 = new String("WWW.runoob.cn");
//		System.out.println(strReg1.regionMatches(ignoreCase,toffset, strReg2, ooffset, len));
		//ignoreCase:为true: 表示比较时忽略大小写,false:比较时不了忽略大小写		
		//toffset:字符串strReg1 中的起始偏移量
		//ooffset:字符串strReg2 中的其实偏移量
		//len:要比较的字符长度
		System.out.println(strReg1.regionMatches(true ,0, strReg2, 0,5));
		//14.replace() 通过新字符串来取代旧的字符串
		String srep = new String("hello");
		System.out.println(srep.replace("he", "ww"));
		System.out.println(srep);
		//14.replaceAll():在旧的字符串的中做检索,找到符合指定正则表达式的字符串片段,用新的字符串替换整个字符串
		String strREG = new String ("www.google.com  haha ");
		System.out.println(strREG.replaceAll("(.*)google(.*)", "run"));//将字符串strREG中符合正则匹配:  (.*)google(.*) 的片段替换为:  run
		// 15.replaceFirst():在旧的字符串中做检索,找到是定的匹配则表达式的字符串片段,用新的字符串替换这些片段中的第一个字符串片段,而不是整个字符串
		String strREPF = new String ("hello runoob，I am from runoob。");
		System.out.println(strREPF.replaceFirst("runoob","新的内容"));
		//16.split()字符串的切割
		String sp= new String("Welcom-to-Runoob");
		System.out.println("使用 - 进行切割");
		String [] spArray = sp.split("-");
		//数组直接打印,返回的是内存指针,需要对其进行循环才能打印出每个字符的内容
		for (String string : spArray) {
			System.out.println(string);
		}
		System.out.println("---------------");
		//设置切割次数为2-1 :切割后形成的数组size 为:2
		String [] spArray2 = sp.split("-",2);
		for (String string : spArray2) {
			System.out.println(string);
		}
		System.out.println("---------------");
		//多个分隔符切割用  |  链接
		String strMuch = new String ("acount=? and uu =? and hehe=? or n = ?");
		String [] ssss= strMuch.split("and|or",3);//切割3-1 次
		for(String st:ssss) {
			System.out.println(st);
		}
		//17.subSequence()返回原字符串中的一个新的序列,该序列是原序列的子序列(按索引进行切割)
		String subs =new String("www.baidu.com");
		System.out.println(subs.subSequence(4,9));//古前不顾后
		String  subs2 = new String("www.baidu.com");
		System.out.println(subs2.substring(4,9));
		//18.toLowerCase() 将字符串中所有的字符转换为小写
		String  tolow = new String ("WWW.runoob.com");
		System.out.println(tolow.toLowerCase());
		//19.toUpperCase(): 将字符串中小写字符转换为大写
		String toupper = new String("www.baidu.com");
		System.out.println(toupper.toUpperCase());
		//19.trim()删除头尾处的空白字符串
		String trim__ = new String("    www.baidu.com     ");
		System.out.println(trim__.trim());
		//20.valueOf()返回值为该对象的原始值
		//Array:返回数组本身
		String [] array  = {"abc","true","12","a"};
		for (String string : array) {
			System.out.println(string);
		}
		float f = 12.00f;
		System.out.println(String.valueOf(f));
		
		// 创建可以改变长度的字符串 StringBuilder StringBuffer
	}
}
