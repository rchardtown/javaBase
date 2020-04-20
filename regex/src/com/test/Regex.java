package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	//Pattern.matches():判断字符串是否有正则匹配的内容
	public static String context = "how are you ? I  am fine,thanks ?";
	public static String regexPattern = "(.*)you(.*)";
	public static void main(String[] args) {
		boolean isMatches = Pattern.matches(regexPattern, context);
		System.out.println(isMatches+" :字符串变量context中包含了regexPattern匹配的内容:  (.*)you(.*)");
//	1. 常见的匹配字符
	//  .  :匹配所有单个字符
	//  ^  :以什么开始
	//  $  :以什么结尾
	//  [abc]	:a或b或c
	//	[abc][vz]	:a或b或c 后面根v或z
	//	[^abc]	:除了a或b或c
	//  [a-d1-7]	:匹配a~d和1~7 ,但不匹配d和1
	//	xz	:匹配x后直接跟z
	//	x|z	:匹配 x或者z
	//	\d	:匹配一个数字[0-9]
	//	\D	:匹配一个非数字[^0-9]
	//	\s	:匹配一个空格
	//	\S	:匹配一个非空格
	//	\w	:匹配一个数字或字母或下划线
	//	\W	:匹配一个非数字字母下划线的字符
	//	*	:0个或多个  =={0,}
	//	+	:1个或多个  =={1,}
	//	?	:0个或1个    =={0,1}
	//	{x}		:只匹配x个字符,例如:\d{3}表示只匹配3个数字
	//	{X,Y}	:匹配>=X且<=Y个字符,例如:\d{1,4}表示匹配至少1个,之多4个字符

		
//		2. 分组和反向引用
		//小括号()可以达到对正则表达式进行分组的效果
		//模式分组后会在正则表达式中创建反向引用。反向引用会保存匹配模式分组的字符串片断，这使得我们可以获取并使用这个字符串片断。
		//在以正则表达式替换字符串的语法中，是通过 $ 来引用分组的反向引用，$0 是匹配完整模式的字符串（注意在 JavaScript 中是用 $& 表示）；$1 是第一个分组的反向引用；$2 是第二个分组的反向引用，以此类推。
		//示例：
		// 2.1  去除单词与 , 和 . 之间的空格
        String Str = "Hello , World .";
        String pattern = "(\\w)(\\s+)([.,])";//正则中[.]会自动处理成[\.]，即普通字符
        // $0 匹配 `(\w)(\s+)([.,])` 结果为 `o空格,` 和 `d空格.`
        // $1 匹配 `(\w)` 结果为 `o` 和 `d`
        // $2 匹配 `(\s+)` 结果为 `空格` 和 `空格`
        // $3 匹配 `([.,])` 结果为 `,` 和 `.`
        System.out.println(Str.replaceAll(pattern, "$0")); //Hello , World .
        System.out.println(Str.replaceAll(pattern,"$1"));//Hello World
        System.out.println(Str.replaceAll(pattern, "$2"));//Hell  Worl
        System.out.println(Str.replaceAll(pattern, "$3"));//Hell, Worl.
        System.out.println(Str.replaceAll(pattern, "$1$3"));//Hello, World.
//        System.out.println(Str.replaceAll(pattern, "$5"));//java.lang.IndexOutOfBoundsException: No group 5
        //2.2 仅分组但无反向引用
        String string = "img.jpg";
        Pattern pattern1 = Pattern.compile("(jpg|png)");
        Matcher mat = pattern1.matcher(string);
        System.out.println(mat.groupCount());//查看分组数目
        while(mat.find()) {
        	System.out.println(mat.group());
        	System.out.println(mat.group(1));
        }
	}
}
