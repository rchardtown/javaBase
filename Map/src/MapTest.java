import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
//Map��һ���ӿڣ������洢��ֵ�ԣ�ͨ��������ȡֵ
	// �����ʵ�ֵ������ʱ���ͻ��׳�NoSucnElementException
	// ����������ͺ�Map���Ԫ�����Ͳ�����ʱ�ͻ��׳�classCastException
	// ���ڲ�����ʹ��Null �����Map��ʹ��Null���󣬾ͻ��׳�NullPointException
	// ��������һ��ֻ��Map ʱ�����׳�UnsupportedOperationException
	public static void main(String[] args) {
		Map m = new HashMap();
		// �������
		m.put("key1", "value1");
		m.put("key2", "value2");
		System.out.println(m);// {key1=value1, key2=value2}
		// �ж��Ƿ����ָ������key1 ��ӳ���ϵ
		boolean b = m.containsKey("key1");
		System.out.println(b);// true
		boolean v = m.containsValue("value1");
		System.out.println(v);// true
		// ����Mapӳ���а���ӳ���ϵ��Set��ͼ
		Set s = m.entrySet();
		System.out.println(s);// [key1=value1, key2=value2]
		//�Ƚ�ָ�������Ƿ����ӳ�����
		Map m2 = m;
		boolean b2 =m.equals(m2);
		System.out.println(b2);//true
		//ͨ��������ȡֵ
		System.out.println(m.get("key1"));//value1
		//���ش�ӳ���hashֵ
		int i = m.hashCode();
		System.out.println(i);//-1649450332
		//�жϴ�ӳ���Ƿ�Ϊ��
		boolean b3 = m.isEmpty();
		System.out.println(b3);//false
		//���ش�ӳ���м���Set��ͼ
		Set key_set = m.keySet();
		System.out.println(key_set);//[key1, key2]
		//���ش�ӳ����Value��Collection��ͼ
		Collection  c = m.values();
		System.out.println(c);//[value1, value2]
		//��Mapӳ�����������
		m.put("key3", "value3");//���һ����ֵ��
		
		Map mm= new HashMap();
		mm.put("hehe", "dada");
		
		m.putAll(mm);//���һ��Mapӳ��
		System.out.println(m);//{key1=value1, key2=value2, key3=value3, hehe=dada}
		//��ȡMapӳ���м�ֵ�Ե�����
		int num = m.size();
		System.out.println(num);//4
		//�Ƴ�Mapӳ���еļ�Ϊkey1 �ļ�ֵ��
		m.remove("key1");
		System.out.println(m);
	}

}
