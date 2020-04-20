import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
//Map是一个接口，用来存储键值对，通过键来获取值
	// 当访问的值不存在时，就会抛出NoSucnElementException
	// 当对象的类型和Map里的元素类型不兼容时就会抛出classCastException
	// 当在不允许使用Null 对象的Map中使用Null对象，就会抛出NullPointException
	// 当尝试修一个只读Map 时，会抛出UnsupportedOperationException
	public static void main(String[] args) {
		Map m = new HashMap();
		// 添加数据
		m.put("key1", "value1");
		m.put("key2", "value2");
		System.out.println(m);// {key1=value1, key2=value2}
		// 判断是否包含指定键：key1 的映射关系
		boolean b = m.containsKey("key1");
		System.out.println(b);// true
		boolean v = m.containsValue("value1");
		System.out.println(v);// true
		// 返回Map映射中包含映射关系的Set视图
		Set s = m.entrySet();
		System.out.println(s);// [key1=value1, key2=value2]
		//比较指定对象是否与感映射相等
		Map m2 = m;
		boolean b2 =m.equals(m2);
		System.out.println(b2);//true
		//通过键来获取值
		System.out.println(m.get("key1"));//value1
		//返回此映射的hash值
		int i = m.hashCode();
		System.out.println(i);//-1649450332
		//判断此映射是否为空
		boolean b3 = m.isEmpty();
		System.out.println(b3);//false
		//返回此映射中键的Set视图
		Set key_set = m.keySet();
		System.out.println(key_set);//[key1, key2]
		//返回此映射中Value的Collection视图
		Collection  c = m.values();
		System.out.println(c);//[value1, value2]
		//向Map映射中添加数据
		m.put("key3", "value3");//添加一个键值对
		
		Map mm= new HashMap();
		mm.put("hehe", "dada");
		
		m.putAll(mm);//添加一个Map映射
		System.out.println(m);//{key1=value1, key2=value2, key3=value3, hehe=dada}
		//获取Map映射中键值对的数量
		int num = m.size();
		System.out.println(num);//4
		//移除Map映射中的键为key1 的键值对
		m.remove("key1");
		System.out.println(m);
	}

}
