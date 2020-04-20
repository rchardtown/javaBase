import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaoTest {
//Hashmap������
	// hashMap�ǻ��ڹ�ϣ��Ķ�Map�ӿڵķ�ͬ��ʵ�֡�
	// ��ʵ�ַ�ʽ���ص���ǣ�
	// 1.��ͬ���ԣ�
	// hashmap��ͬ����������߳�ͬʱ����hashmapʱ������һ���̴߳ӽṹ�������޸ģ����һ���ɾ����һ�����߶��ӳ�䣩
	// ����ʱ�������̱߳��뱣��ͬ�����Է�ֹ��ӳ���������ķ�ͬ�����ʡ�
	// 2.������null����nullֵ
	// 3.����֤ӳ���˳��
	// ��Ϊhashmap���ݻ��ɱ�ģ�ÿ�����ݺ�ӳ��˳�򶼻���������
	// ����㣺
	// hashMap����table�����������ɵģ�����table �����е�ÿ��Ԫ�ض�����������Ϊ���������ֽ�Ͱ��
	// �����������ָ����ɵĽṹ����������ɢ�С����ݽṹ�������������Ľ��
	// ���壺
	// hashmap�ĵײ������ݽṹ�������ÿһ������һ����������ʼ��һ��hashmapʱ�ͻ��½�һ�����飬��ʱ��Ϊû�м�ֵ�ԣ����Ի�û������
	// Entry:������key-valuede �����һ��next��Entryָ�롣
	// Entry[]
	// :ÿ��Eentry���˰�����ֵ���⣬������һ��ָ����һ��Ԫ�ص����ã���͹���������Ҳ����˵table������ÿ��λ�õ����������һ��Entry[]
//

	// HashMap�ķ�����

	// put(key,valvue):
	// ������putʱ��
	// ���keyΪnull,�ͻ����putForNullKey���������ü�ֵ�ԣ�Entry���󣩷ŵ�table[0]��λ��ȥ
	// key��Ϊnullʱ��
	// �ȸ���key��hashcode���¼���hashֵ��
	// int hash = hash(key);
	// int i = indexFor(hash, table.length);
	// ����hashֵ�õ����Ԫ����table�����е�λ�ã��������������λ�����Ѿ�������������Ԫ�أ���ô�ͱ��浽����Ԫ�ص���һλ�����λ���ϵ� Ԫ��
	// �γ�����ʽ��š��¼���ķ�����ͷ�����ȼ���ķ�����β�����table�����λ����û��Ԫ�أ���ֱ�ӷŵ�table�����ϸ�λ�á�

	// get(key):
	// ������getʱ��
	// key��ֵΪ�գ�//����getForNullKey();
	// key��ֵ�ǿգ����ȼ���key��hashCodeֵ���ҵ�table�����ж�Ӧλ�õ�ĳһ��Ԫ�أ���������ͨ��key��equals()����������ȡ�������϶�Ӧ��Ԫ�أ�Entry��key-value����

//	HashMap �����ܲ���
	// HashMap �������¼�����������
	//
	// HashMap()������һ����ʼ����Ϊ 16����������Ϊ 0.75 �� HashMap��
	// ashMap(int initialCapacity)������һ����ʼ����Ϊ initialCapacity����������Ϊ 0.75 �� HashMap��
	// HashMap(int initialCapacity, float loadFactor)����ָ����ʼ������ָ���ĸ������Ӵ���һ�� HashMap��
	// HashMap �Ļ��������� HashMap(int initialCapacity, float loadFactor) �������������������ǳ�ʼ����
	// initialCapacity �͸������� loadFactor��

	// LoadFactor ��������һ��ɢ�б�Ŀռ�ʹ�ó̶ȣ���������Խ���ʾɢ�б��װ��̶�Խ�ߣ���֮ԽС��
	// ����һ��ɢ�б���˵�������������Խ�󣬿ռ�ʹ���³�֣����ǲ�ѯ��Ч��Ҳ�ή�͡��������Ӱ��̫С����ôɢ�б�����ݽ�����ϡ�裬�Կռ���������˷ѡ�
	// HashMap ��ʵ���У�ͨ�� threshold �ֶ����ж� HashMap �����������
	// threshoul = (int)(capacity * loadFactor);

	// ��ϸ������ӵĶ��幫ʽ��֪��threshold �����ڴ� loadFactor �� capacity ��Ӧ����������Ԫ����Ŀ�����������Ŀ������
	// resize���Խ���ʵ�ʵĸ������ӡ�Ĭ�ϵĵĸ������� 0.75
	// �ǶԿռ��ʱ��Ч�ʵ�һ��ƽ��ѡ�񡣵������������������ʱ�� resize ��� HashMap ����������������
	// Fail-Fast ���ƣ�
	// ����֪�� java.util.HashMap �����̰߳�ȫ�ģ���������ʹ�õ������Ĺ������������߳��޸��� map����ô���׳�
	// ConcurrentModificationException���������ν fail-fast ���ԡ�
	// û�кõķ�����
	// �����̻߳�����ʹ��fail-fast���Ƶļ��ϣ�����ʹ�á�java.util.concurrent����ȡ��java.util���µ���

	// hashMap �����ֱ�����ʽ��

	public static void main(String[] args) {
		// �Ƽ��ķ�����
		Map map = new HashMap();
		Iterator itera = map.entrySet().iterator();
		while(itera.hasNext()) {
			Map.Entry entry=(Map.Entry)itera.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
		}
		
		//��Ч�ʵķ�����
			Map map2 =new HashMap();
			Iterator iterator =map.keySet().iterator();
			while(iterator.hasNext()) {
				Object key = iterator.next();
				Object value = map.get(key);
			}
	}

}
