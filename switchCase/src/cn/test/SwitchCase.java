package cn.test;

public class SwitchCase {
	// switch case:
	// switch case 是用来做判断的，判断一个变量与一系列值中的某一个值是否匹配
	// ，我们把这每一个值称之为分支。
	public static void main(String[] args) {
//		switch(expression) {
//		//value ：byte、short、int、char、String(常量、字面量)
//		case value:
//			break;
//		case value:
//			break;
//		case value:
//			break;
//		case value:
//			break;
//		default:
		// default语句可以放到任何位置,建议放到最后,其后不需要再根break
//		}
//
//		char grade = 'G';
//		switch (grade) {
//		case 'A':
//			System.out.println("优秀");
//			break;
//		case 'B':
//			System.out.println("良好");
//			break;
//		case 'C':
//			System.out.println("及格");
////			break;//switch case  只匹配一次,往后再不匹配完成后直接往下走,遇到break时
//			//退出 switch case ,如果没有遇到break,会走匹配分支后面所有的分支
//		case 'D':
//			System.out.println("你需要在努力努力!");
//			break;
//		default:
//			System.out.println("未知等级");
//		}
//		System.out.println("你的等级是  :"+grade);

		int i = 2;
		switch (i) {
		case 1:
			System.out.println("我是1");
			break;
		case 2:
			System.out.println("我是2");
//			break;
		case 3:
			System.out.println("我是3");
//			break;
		default:
			System.out.println("我是默认值   0");
		}
//		我是2
//		我是3
//		我是默认值   0
	}
}
