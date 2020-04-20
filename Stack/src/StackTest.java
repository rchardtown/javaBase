import java.util.EmptyStackException;
import java.util.Stack;
//你可以把栈理解为对象的垂直分布的栈，当你添加一个新元素时，
//就将新元素放在其他元素的顶部。

//当你从栈中取元素的时候，就从栈顶取一个元素。换句话说，
//最后进栈的元素最先被取出。//
public class StackTest {
//栈是向量Vector的一个子类，它实现了标准的
//后进先出的栈。

//堆栈只定义了默认的构造函数，用来创建一个空栈。
	//堆栈除了包括Vector的所有方法之外，也定义了
	//自己的一些方法
	
	static void showPush(Stack<Integer>st,int a) {
		st.push(a);
		System.out.println("push( "+ a +" )");
		System.out.println("stack: "+st);
	}
	static boolean ifCelear(Stack st) {
		//栈为空
		if (! st.empty()) {
			
			return false;
		}else {
			return true;
		}
	}
	static void showPeek(Stack st) {
		if (ifCelear(st)) {
			System.out.println("该栈为空栈");
		}else {
			System.out.println("栈顶的数据为： "+st.peek());
		}
		
		
	}
	static void showPop(Stack st) {
		boolean b = ifCelear(st);
		if (b) {
			System.out.println("该栈为空栈");
		}else {
			System.out.println("移出栈顶的数据： "+st.pop());

		}
	}
	public static void main(String[] args) {
		Stack st= new Stack();
		showPush(st, 10);
		showPeek(st);
		showPop(st);
		showPeek(st);
		showPush(st, 20);
		showPush(st, 20);
		showPush(st, 20);
	}
}

//
//该栈为空栈
//push( 20 )
//stack: [20]
//push( 20 )
//stack: [20, 20]
//push( 20 )
//stack: [20, 20, 20]