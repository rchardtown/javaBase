package com.test;


public class StringType {

	public static void main(String[] args) {
		// �ַ��������ķ���
		// 1.���ַ�����ת��Ϊ�ַ���:new String(�ַ�����)
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', ' ', '!' };
		String helloString = new String(helloArray);
		System.out.println("helloString  :"+helloString);
		// String �ǲ��ɱ��,һ�������ɹ������ٸ���
		String ss = helloString + "33333";
		System.out.println(ss);
		System.out.println(helloString);
		// 2.ʹ��copyValueOff() �������ȫ���򲿷ֽ���ת��Ϊ�ַ���
		char[] str1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!' };

		String str2 = String.copyValueOf(str1, 1, 3);
		String str3 = String.copyValueOf(str1);
		System.out.println(str2 + "  ������1����������3");// ell
		System.out.println(str3 + " ȫ������");
		// �ַ����ĳ���
		System.out.println(ss.length());
		// �ַ�����ƴ��
		// ����: +
		String w = "�ҵ����ֽ� :";
		String name = "����";
		System.out.println(w + name);
		// ������: concat()
		System.out.println(w.concat(name));
		// ������ʽ���ַ���
		System.out.println(String.format("�ַ���:+ %s" + "����: +%d" + "������: %f", "�����ַ���", 1, 1.0));
		String formatString = String.format("�����ַ��� : %s   \n" + "������������ :%d  \n" + "���Ǹ��������� :%f  ", "string", 1, 1.0);
		System.out.println(formatString);
		// String֧�ֵķ���
		String str = "string Sqmp";
		String comp = "string Somp";
		// 1.char charAt(int index)
		System.out.println(str.charAt(0));
		// 2.�����ַ������Ƚ�(��������,һ�αȽ�,�����һ����ͬ�ַ���ASCII˳���ֵ)
		System.out.println(str.compareTo(comp));
		// 3.�����ִ�Сд�Ƚ��ַ�,���Ǵ������ұ�,�ȵ���һ����ͬ���ַ�ֹͣ,���ASCII˳���ֵ
		System.out.println(str.compareToIgnoreCase(comp));
		// 4.���߼���ıȽ�,�Ƚ������ַ�����StringBuffer��ֵ
		String s1 = "heheda";
		String s2 = "hehedada";
		StringBuffer s3 = new StringBuffer(s1);

		boolean result = s1.contentEquals(s3);
		System.out.println(result);
		boolean res = s1.contentEquals(s2);
		System.out.println(res);
		// 5.�ж��ַ����Ƿ���ĳ���ַ�����
		String runoob = new String("����̳�:http://www.runoob.com");
		boolean runres = runoob.endsWith(".com");
		System.out.println(runres);
		// 6. equals()���ַ�������һ���������Ƚ�,����booleanֵ
		String eq1 = new String("runoob");
		String eq2 = eq1;
		String eq3 = new String("runoob");
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1.equals(eq3));
		// 7.equalsIgnoreCase() ����һ���ַ���,�����ַ���С�Ƚ�,����booleanֵ
		String igeq1 = "hehe";
		String igeq2 = "HEHE";
		System.out.println(igeq1.equalsIgnoreCase(igeq2));
		try {
			// 8.���ַ����Ĳ��ֻ�ȫ��������������������
			String sss = new String("targetchar[]");
			char[] ch = new char[10];
			sss.getChars(1, 6, ch, 0);//0:��λ����Ŀ���������ʼƫ����,Ĭ��Ϊ0 �ͺ�
			System.out.println(ch); //arget:  ������ǰ���˺�
		} catch (Exception e) {
			System.out.println("�����쳣!");
		}
		// 8.�����ִ���hash��
		String hash = new String("www.runoob.com");
		System.out.println(hash.hashCode());
		// 9.indexOf() ���ַ����в���ָ���ַ�����һ�γ��ֵ�λ������
		String strin ="fasfsasfafas";
		System.out.println("�ַ���a�ĵ�һ�������� " +strin.indexOf("a"));
		//���ڱȽϵ�ʵ����ASCII��ƥ��,����Ҳ�������ַ�����Ӧ���ַ���������������
		System.out.println("�ַ���a�ĵ�һ�������� " +strin.indexOf(97));//��֪�ַ�a ��ASCII������λ 97
		//����,����ָ����������ʼλ��
		System.out.println(strin.indexOf("a", 3)); //5
		// 10.lastIndexOf() �������,ָ���ַ�������ֵ�λ������
		String lastStr = new String ("www.runoon.com");
		//11.�ַ����ĳ���
		String lengs= "www.baidu.com";
		System.out.println("lengs�ĳ���Ϊ: "+lengs.length());
		//12.matches()��֪���ַ����Ƿ�����ƥ���������ʽ��
		String strMatch = new String("www.runoob.com");
		System.out.println(strMatch.matches("(.*)runoob(.*)"));
		System.out.println(strMatch.matches("www(.*)"));
		//13.regionMatches()�ж������ַ�����ָ���������Ƿ�ƥ��
		String strReg1 = new String("www.runoob.com");
		String strReg2 = new String("WWW.runoob.cn");
//		System.out.println(strReg1.regionMatches(ignoreCase,toffset, strReg2, ooffset, len));
		//ignoreCase:Ϊtrue: ��ʾ�Ƚ�ʱ���Դ�Сд,false:�Ƚ�ʱ���˺��Դ�Сд		
		//toffset:�ַ���strReg1 �е���ʼƫ����
		//ooffset:�ַ���strReg2 �е���ʵƫ����
		//len:Ҫ�Ƚϵ��ַ�����
		System.out.println(strReg1.regionMatches(true ,0, strReg2, 0,5));
		//14.replace() ͨ�����ַ�����ȡ���ɵ��ַ���
		String srep = new String("hello");
		System.out.println(srep.replace("he", "ww"));
		System.out.println(srep);
		//14.replaceAll():�ھɵ��ַ�������������,�ҵ�����ָ��������ʽ���ַ���Ƭ��,���µ��ַ����滻�����ַ���
		String strREG = new String ("www.google.com  haha ");
		System.out.println(strREG.replaceAll("(.*)google(.*)", "run"));//���ַ���strREG�з�������ƥ��:  (.*)google(.*) ��Ƭ���滻Ϊ:  run
		// 15.replaceFirst():�ھɵ��ַ�����������,�ҵ��Ƕ���ƥ������ʽ���ַ���Ƭ��,���µ��ַ����滻��ЩƬ���еĵ�һ���ַ���Ƭ��,�����������ַ���
		String strREPF = new String ("hello runoob��I am from runoob��");
		System.out.println(strREPF.replaceFirst("runoob","�µ�����"));
		//16.split()�ַ������и�
		String sp= new String("Welcom-to-Runoob");
		System.out.println("ʹ�� - �����и�");
		String [] spArray = sp.split("-");
		//����ֱ�Ӵ�ӡ,���ص����ڴ�ָ��,��Ҫ�������ѭ�����ܴ�ӡ��ÿ���ַ�������
		for (String string : spArray) {
			System.out.println(string);
		}
		System.out.println("---------------");
		//�����и����Ϊ2-1 :�и���γɵ�����size Ϊ:2
		String [] spArray2 = sp.split("-",2);
		for (String string : spArray2) {
			System.out.println(string);
		}
		System.out.println("---------------");
		//����ָ����и���  |  ����
		String strMuch = new String ("acount=? and uu =? and hehe=? or n = ?");
		String [] ssss= strMuch.split("and|or",3);//�и�3-1 ��
		for(String st:ssss) {
			System.out.println(st);
		}
		//17.subSequence()����ԭ�ַ����е�һ���µ�����,��������ԭ���е�������(�����������и�)
		String subs =new String("www.baidu.com");
		System.out.println(subs.subSequence(4,9));//��ǰ���˺�
		String  subs2 = new String("www.baidu.com");
		System.out.println(subs2.substring(4,9));
		//18.toLowerCase() ���ַ��������е��ַ�ת��ΪСд
		String  tolow = new String ("WWW.runoob.com");
		System.out.println(tolow.toLowerCase());
		//19.toUpperCase(): ���ַ�����Сд�ַ�ת��Ϊ��д
		String toupper = new String("www.baidu.com");
		System.out.println(toupper.toUpperCase());
		//19.trim()ɾ��ͷβ���Ŀհ��ַ���
		String trim__ = new String("    www.baidu.com     ");
		System.out.println(trim__.trim());
		//20.valueOf()����ֵΪ�ö����ԭʼֵ
		//Array:�������鱾��
		String [] array  = {"abc","true","12","a"};
		for (String string : array) {
			System.out.println(string);
		}
		float f = 12.00f;
		System.out.println(String.valueOf(f));
		
		// �������Ըı䳤�ȵ��ַ��� StringBuilder StringBuffer
	}
}
