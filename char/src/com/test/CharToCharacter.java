package com.test;

public class CharToCharacter {
	char ch ='a';
	//unicode ���ַ���ʾ��ʽ
	char uniChar ='\u0394';
	char [] charArray = {'a','b','c','d','e'};
	public static void main(String[] args) {
		//char ��Ϊ������������,�书�ܱȽ�����,Ϊ����Ӧ��
		//����ʹ�õ�����,������һ������char���з�װ��İ�װ
		//���� Character.Character ��װ��һϵ�ж��ַ����в����ķ���
		
		//���ԶԶԹ��ڷ����ļ��
		@SuppressWarnings("deprecation")
		Character ch = new Character('A');
	
		//char  ��  Character ֮����໥ת��,����\װ����Ϊ.
		Character  c = 'a';//ԭʼ��char �����ַ� c,��װ�ص�Character��:װ��
		//char d = test(c);  ͨ��test()������Character ���͵�c�ַ�װ�ڵ��ַ�d��:����
		
		//Character ���ͷ�װ�ļ����ַ�����ķ���
		
		//�ж��Ƿ����ַ�
		System.out.println(Character.isLetter(c));
		//�����ַ�isLetter �޷�ʶ��
		System.out.println(Character.isLetter('1'));
		//�ж��Ƿ��������ַ�
		System.out.println(Character.isDigit('1'));
		//�ж��Ƿ��ǿհ��ַ�
		System.out.println(Character.isWhitespace(' '));
		//�ж��Ƿ��Ǵ�д��ĸ
		System.out.println(Character.isUpperCase('a'));
		//�ж��Ƿ���Сд��ĸ
		System.out.println(Character.isLowerCase('a'));
		//ת���ַ�λ�ַ���(���ַ����ĳ���λ1)
		System.out.println(Character.toString('c'));
	}
}
