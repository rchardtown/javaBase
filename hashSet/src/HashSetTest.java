import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet has = new HashSet();
		// �ж��Ƿ�Ϊ��
		boolean b = has.isEmpty();
		System.out.println(b);
		// ���Ԫ��
		has.add("��һ��Ԫ��");
		has.add("�ڶ���Ԫ��");
		// �ж��Ƿ������һ��Ԫ��
		boolean b2 = has.contains("��һ��Ԫ��");
		System.out.println(b2);
		// �ж��Ƿ����
		HashSet has2 = new HashSet();
		boolean b3 = has.equals(has2);
		System.out.println(b3);
		// ����set������Ԫ�صø���
		int i = has.size();
		System.out.println(i);
		// �Ƴ�һ��Ԫ��
		boolean b4 = has.remove("��һ��Ԫ��");
		System.out.println(b4);
		
		
		//����hasset�е�Ԫ��
		Iterator itera= has.iterator();
		while (itera.hasNext()) {
			String info =(String)itera.next();
			System.out.println(info);
		}
		//������е�Ԫ��
		has.clear();
		System.out.println(has.size());//0
		
	}
}
