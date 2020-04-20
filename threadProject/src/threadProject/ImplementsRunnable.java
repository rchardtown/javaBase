package threadProject;
//ͨ��ʵ��runnable �ķ���ʵ�ֶ��߳�
public class ImplementsRunnable implements Runnable{


	   private Thread t;
	   private String threadName;
	   
	   ImplementsRunnable( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   // run �����ڴ���һ���߳�ʱ�Զ�����
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // ���߳�˯��һ��
	            Thread.sleep(50);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	   
		public static void main(String[] args) {
			ImplementsRunnable thread1 =	new ImplementsRunnable("�߳�һ");
			thread1.start();
			
			ImplementsRunnable thread2 = new ImplementsRunnable("�̶߳�");
			thread2.start();
			
	}
	 
}
	