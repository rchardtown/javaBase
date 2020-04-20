package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	//Pattern.matches():�ж��ַ����Ƿ�������ƥ�������
	public static String context = "how are you ? I  am fine,thanks ?";
	public static String regexPattern = "(.*)you(.*)";
	public static void main(String[] args) {
		boolean isMatches = Pattern.matches(regexPattern, context);
		System.out.println(isMatches+" :�ַ�������context�а�����regexPatternƥ�������:  (.*)you(.*)");
//	1. ������ƥ���ַ�
	//  .  :ƥ�����е����ַ�
	//  ^  :��ʲô��ʼ
	//  $  :��ʲô��β
	//  [abc]	:a��b��c
	//	[abc][vz]	:a��b��c �����v��z
	//	[^abc]	:����a��b��c
	//  [a-d1-7]	:ƥ��a~d��1~7 ,����ƥ��d��1
	//	xz	:ƥ��x��ֱ�Ӹ�z
	//	x|z	:ƥ�� x����z
	//	\d	:ƥ��һ������[0-9]
	//	\D	:ƥ��һ��������[^0-9]
	//	\s	:ƥ��һ���ո�
	//	\S	:ƥ��һ���ǿո�
	//	\w	:ƥ��һ�����ֻ���ĸ���»���
	//	\W	:ƥ��һ����������ĸ�»��ߵ��ַ�
	//	*	:0������  =={0,}
	//	+	:1������  =={1,}
	//	?	:0����1��    =={0,1}
	//	{x}		:ֻƥ��x���ַ�,����:\d{3}��ʾֻƥ��3������
	//	{X,Y}	:ƥ��>=X��<=Y���ַ�,����:\d{1,4}��ʾƥ������1��,֮��4���ַ�

		
//		2. ����ͷ�������
		//С����()���Դﵽ��������ʽ���з����Ч��
		//ģʽ��������������ʽ�д����������á��������ûᱣ��ƥ��ģʽ������ַ���Ƭ�ϣ���ʹ�����ǿ��Ի�ȡ��ʹ������ַ���Ƭ�ϡ�
		//����������ʽ�滻�ַ������﷨�У���ͨ�� $ �����÷���ķ������ã�$0 ��ƥ������ģʽ���ַ�����ע���� JavaScript ������ $& ��ʾ����$1 �ǵ�һ������ķ������ã�$2 �ǵڶ�������ķ������ã��Դ����ơ�
		//ʾ����
		// 2.1  ȥ�������� , �� . ֮��Ŀո�
        String Str = "Hello , World .";
        String pattern = "(\\w)(\\s+)([.,])";//������[.]���Զ������[\.]������ͨ�ַ�
        // $0 ƥ�� `(\w)(\s+)([.,])` ���Ϊ `o�ո�,` �� `d�ո�.`
        // $1 ƥ�� `(\w)` ���Ϊ `o` �� `d`
        // $2 ƥ�� `(\s+)` ���Ϊ `�ո�` �� `�ո�`
        // $3 ƥ�� `([.,])` ���Ϊ `,` �� `.`
        System.out.println(Str.replaceAll(pattern, "$0")); //Hello , World .
        System.out.println(Str.replaceAll(pattern,"$1"));//Hello World
        System.out.println(Str.replaceAll(pattern, "$2"));//Hell  Worl
        System.out.println(Str.replaceAll(pattern, "$3"));//Hell, Worl.
        System.out.println(Str.replaceAll(pattern, "$1$3"));//Hello, World.
//        System.out.println(Str.replaceAll(pattern, "$5"));//java.lang.IndexOutOfBoundsException: No group 5
        //2.2 �����鵫�޷�������
        String string = "img.jpg";
        Pattern pattern1 = Pattern.compile("(jpg|png)");
        Matcher mat = pattern1.matcher(string);
        System.out.println(mat.groupCount());//�鿴������Ŀ
        while(mat.find()) {
        	System.out.println(mat.group());
        	System.out.println(mat.group(1));
        }
	}
}
