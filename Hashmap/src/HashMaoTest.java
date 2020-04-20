import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaoTest {
//Hashmap概述：
	// hashMap是基于哈希表的对Map接口的非同步实现。
	// 此实现方式的特点就是：
	// 1.非同步性：
	// hashmap不同步，当多个线程同时访问hashmap时，至少一个线程从结构上做了修改（增家或者删除了一个或者多个映射）
	// ，此时其他的线程必须保持同步，以防止对映射进行意外的非同步访问。
	// 2.允许有null键和null值
	// 3.不保证映射的顺序：
	// 因为hashmap是容积可变的，每次扩容后，映射顺序都会重新排列
	// 补充点：
	// hashMap是有table数组和链表组成的，其中table 数组中的每个元素都是整数（做为索引），又叫桶。
	// 这种由数组和指针组成的结构叫做“链表散列”数据结构，即数组和链表的结合
	// 具体：
	// hashmap的底层是数据结构，数组的每一项又是一个链表。当初始化一个hashmap时就会新建一个数组，此时因为没有键值对，所以还没有链表。
	// Entry:包含了key-valuede 对象和一个next的Entry指针。
	// Entry[]
	// :每个Eentry除了包含键值对外，他持有一个指向下一个元素的引用，这就构成了链表。也就是说table数组上每个位置的链表本身就是一个Entry[]
//

	// HashMap的方法：

	// put(key,valvue):
	// 当我们put时：
	// 如果key为null,就会调用putForNullKey方法，将该键值对（Entry对象）放到table[0]的位置去
	// key不为null时：
	// 先根据key的hashcode重新计算hash值：
	// int hash = hash(key);
	// int i = indexFor(hash, table.length);
	// 根据hash值得到这个元素在table数组中的位置（索引），如果该位置上已经存在了其他的元素，那么就保存到其他元素的下一位，这个位置上的 元素
	// 形成了链式存放。新加入的放在链头，最先加入的放在链尾。如果table数组该位置上没有元素，则直接放到table数组上该位置。

	// get(key):
	// 当我们get时：
	// key的值为空：//调用getForNullKey();
	// key的值非空：首先计算key的hashCode值来找到table数组中对应位置的某一个元素（链表），再通过key的equals()方法，来获取该链表上对应的元素（Entry、key-value对象）

//	HashMap 的性能参数
	// HashMap 包含如下几个构造器：
	//
	// HashMap()：构建一个初始容量为 16，负载因子为 0.75 的 HashMap。
	// ashMap(int initialCapacity)：构建一个初始容量为 initialCapacity，负载因子为 0.75 的 HashMap。
	// HashMap(int initialCapacity, float loadFactor)：以指定初始容量、指定的负载因子创建一个 HashMap。
	// HashMap 的基础构造器 HashMap(int initialCapacity, float loadFactor) 带有两个参数，它们是初始容量
	// initialCapacity 和负载因子 loadFactor。

	// LoadFactor 衡量的是一个散列表的空间使用程度，负载因子越大表示散列表的装填程度越高，反之越小。
	// 对于一个散列表来说，如果负载因子越大，空间使用月充分，但是查询的效率也会降低。如果负载影子太小，那么散列表的数据将过于稀疏，对空间造成严重浪费。
	// HashMap 的实现中，通过 threshold 字段来判断 HashMap 的最大容量：
	// threshoul = (int)(capacity * loadFactor);

	// 结合负载因子的定义公式可知，threshold 就是在此 loadFactor 和 capacity 对应下允许的最大元素数目，超过这个数目就重新
	// resize，以降低实际的负载因子。默认的的负载因子 0.75
	// 是对空间和时间效率的一个平衡选择。当容量超出此最大容量时， resize 后的 HashMap 容量是容量的两倍
	// Fail-Fast 机制：
	// 我们知道 java.util.HashMap 不是线程安全的，因此如果在使用迭代器的过程中有其他线程修改了 map，那么将抛出
	// ConcurrentModificationException，这就是所谓 fail-fast 策略。
	// 没有好的方法：
	// 若多线程环境下使用fail-fast机制的集合，建议使用“java.util.concurrent”包取代java.util包下的类

	// hashMap 的两种遍历方式：

	public static void main(String[] args) {
		// 推荐的方法：
		Map map = new HashMap();
		Iterator itera = map.entrySet().iterator();
		while(itera.hasNext()) {
			Map.Entry entry=(Map.Entry)itera.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
		}
		
		//低效率的方法：
			Map map2 =new HashMap();
			Iterator iterator =map.keySet().iterator();
			while(iterator.hasNext()) {
				Object key = iterator.next();
				Object value = map.get(key);
			}
	}

}
