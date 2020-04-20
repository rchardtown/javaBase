package cn.test;

public class StringBufferAndStringBuilder {
	// StringBuilder:用来创建,速度快,但是非线性安全,不适用于多线程和对线程安全有要求的情景
	// StringBuffer:主要适用于多线程和对线程安全有要求的情况
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("菜鸟教程官网 ");
		sb.append("  欢迎您  !");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		//reverse():将字符串以反转的方式取代
		sb = sb.reverse();
		System.out.println("反转后的字符串: "+sb);
		System.out.println(sb.reverse());
		//删除字符串的部分字符片段
		sb.deleteCharAt(5);//删除索引位置为5的字符
		System.out.println(sb);
		sb.delete(5,8);
		System.out.println(sb);
		//插入字符串
		sb.insert( 5, "网");
		System.out.println("插入'网'后的新字符串   :  "+sb);
		//replace():使用新的字符串取代指定序列的字符
		sb.replace(0, 4, "百度网页");//顾谦不顾后
		System.out.println(sb);
		//capcity():返回当前的容量
		int count  = sb.capacity();
		System.out.println("当前StringBuffer()的容量为:"+ count);
		//charAt():返回指定索引处的字符值
		char ch = sb.charAt(0);
		System.out.println(ch);
		
	}
}
