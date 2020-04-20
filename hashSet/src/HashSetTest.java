import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet has = new HashSet();
		// 判断是否为空
		boolean b = has.isEmpty();
		System.out.println(b);
		// 添加元素
		has.add("第一个元素");
		has.add("第二个元素");
		// 判断是否包含第一个元素
		boolean b2 = has.contains("第一个元素");
		System.out.println(b2);
		// 判断是否相等
		HashSet has2 = new HashSet();
		boolean b3 = has.equals(has2);
		System.out.println(b3);
		// 返回set集合中元素得个数
		int i = has.size();
		System.out.println(i);
		// 移除一个元素
		boolean b4 = has.remove("第一个元素");
		System.out.println(b4);
		
		
		//迭代hasset中的元素
		Iterator itera= has.iterator();
		while (itera.hasNext()) {
			String info =(String)itera.next();
			System.out.println(info);
		}
		//清除所有的元素
		has.clear();
		System.out.println(has.size());//0
		
	}
}
