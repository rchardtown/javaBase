package threadProject;
//通过实现runnable 的方法实现多线程
public class ImplementsRunnable implements Runnable{


	   private Thread t;
	   private String threadName;
	   
	   ImplementsRunnable( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   // run 方法在创建一个线程时自动调用
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // 让线程睡眠一会
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
			ImplementsRunnable thread1 =	new ImplementsRunnable("线程一");
			thread1.start();
			
			ImplementsRunnable thread2 = new ImplementsRunnable("线程二");
			thread2.start();
			
	}
	 
}
	