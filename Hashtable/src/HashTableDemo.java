import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
//

// Hashtable �� HashMap ������
	//1. hashMap�ļ�ֵ��������null ,��hashtable�ü�ֵ������Ϊnull��hashmap����null ʱ�����
	  //putForNullKey�������д�����hashtable ֱ����NullPointException
	//2. hashtable ����ʱͬ���ģ�hashmap���ǡ�Hashtable �������е�public �ķ���������synchronized ���ε�
		//����Щ�����ڲ�ͨ��synchronized�������ʵ�֡�
	//3. ����漰���߳̾���hashTable  �����߳��� hastMap



public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Object, String> hastable = new Hashtable<Object, String>();
		hastable.put("key1", "value1");
		hastable.put("key2", "value2");
		hastable.put("key3", "value3");
		System.out.println(hastable.size());
		String val = hastable.get("key1");
		System.out.println(val);
		// ����
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
