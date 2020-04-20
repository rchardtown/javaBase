import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
//

// Hashtable 与 HashMap 的区别：
	//1. hashMap的键值都可以是null ,而hashtable得键值都不能为null。hashmap遇到null 时会调用
	  //putForNullKey方法进行处理。而hashtable 直接跑NullPointException
	//2. hashtable 方法时同步的，hashmap不是。Hashtable 几乎所有的public 的方法都是用synchronized 修饰的
		//，这些方法内部通过synchronized代码块来实现。
	//3. 如果涉及多线程就用hashTable  ，单线程用 hastMap



public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Object, String> hastable = new Hashtable<Object, String>();
		hastable.put("key1", "value1");
		hastable.put("key2", "value2");
		hastable.put("key3", "value3");
		System.out.println(hastable.size());
		String val = hastable.get("key1");
		System.out.println(val);
		// 迭代
		System.out.println("-------------");
//		Enumeration <Object> en =hastable.keys();
//		while (en.hasMoreElements()) {
//			Object object = (Object) en.nextElement();
//			System.out.println(object);
//			System.out.println(hastable.get(object));
//		}
//		Enumeration<String>en2 =hastable.elements();
//		while (en2.hasMoreElements()) {
//			String string = (String) en2.nextElement();
//			System.out.println(string);
//		}
		
		Iterator<Object> it1 = hastable.keySet().iterator();
		while (it1.hasNext()) {
			Object key =it1.next();
			System.out.println(key);
			System.out.println(hastable.get(key));
			
		}
		
	}
}
