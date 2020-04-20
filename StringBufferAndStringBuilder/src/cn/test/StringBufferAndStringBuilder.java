package cn.test;

public class StringBufferAndStringBuilder {
	// StringBuilder:��������,�ٶȿ�,���Ƿ����԰�ȫ,�������ڶ��̺߳Ͷ��̰߳�ȫ��Ҫ����龰
	// StringBuffer:��Ҫ�����ڶ��̺߳Ͷ��̰߳�ȫ��Ҫ������
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("����̳̹��� ");
		sb.append("  ��ӭ��  !");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		//reverse():���ַ����Է�ת�ķ�ʽȡ��
		sb = sb.reverse();
		System.out.println("��ת����ַ���: "+sb);
		System.out.println(sb.reverse());
		//ɾ���ַ����Ĳ����ַ�Ƭ��
		sb.deleteCharAt(5);//ɾ������λ��Ϊ5���ַ�
		System.out.println(sb);
		sb.delete(5,8);
		System.out.println(sb);
		//�����ַ���
		sb.insert( 5, "��");
		System.out.println("����'��'������ַ���   :  "+sb);
		//replace():ʹ���µ��ַ���ȡ��ָ�����е��ַ�
		sb.replace(0, 4, "�ٶ���ҳ");//��ǫ���˺�
		System.out.println(sb);
		//capcity():���ص�ǰ������
		int count  = sb.capacity();
		System.out.println("��ǰStringBuffer()������Ϊ:"+ count);
		//charAt():����ָ�����������ַ�ֵ
		char ch = sb.charAt(0);
		System.out.println(ch);
		
	}
}
