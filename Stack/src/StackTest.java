import java.util.EmptyStackException;
import java.util.Stack;
//����԰�ջ���Ϊ����Ĵ�ֱ�ֲ���ջ���������һ����Ԫ��ʱ��
//�ͽ���Ԫ�ط�������Ԫ�صĶ�����

//�����ջ��ȡԪ�ص�ʱ�򣬾ʹ�ջ��ȡһ��Ԫ�ء����仰˵��
//����ջ��Ԫ�����ȱ�ȡ����//
public class StackTest {
//ջ������Vector��һ�����࣬��ʵ���˱�׼��
//����ȳ���ջ��

//��ջֻ������Ĭ�ϵĹ��캯������������һ����ջ��
	//��ջ���˰���Vector�����з���֮�⣬Ҳ������
	//�Լ���һЩ����
	
	static void showPush(Stack<Integer>st,int a) {
		st.push(a);
		System.out.println("push( "+ a +" )");
		System.out.println("stack: "+st);
	}
	static boolean ifCelear(Stack st) {
		//ջΪ��
		if (! st.empty()) {
			
			return false;
		}else {
			return true;
		}
	}
	static void showPeek(Stack st) {
		if (ifCelear(st)) {
			System.out.println("��ջΪ��ջ");
		}else {
			System.out.println("ջ��������Ϊ�� "+st.peek());
		}
		
		
	}
	static void showPop(Stack st) {
		boolean b = ifCelear(st);
		if (b) {
			System.out.println("��ջΪ��ջ");
		}else {
			System.out.println("�Ƴ�ջ�������ݣ� "+st.pop());

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
//��ջΪ��ջ
//push( 20 )
//stack: [20]
//push( 20 )
//stack: [20, 20]
//push( 20 )
//stack: [20, 20, 20]