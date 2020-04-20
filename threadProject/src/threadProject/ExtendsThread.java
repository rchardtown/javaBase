package threadProject;

public class ExtendsThread extends Thread {

	private Thread t;
	private String threadName;

	ExtendsThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("new Thread 时自动调用run 方法");
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread : " + threadName + "  " + i);
				Thread.sleep(50);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + threadName + "   " + "exiting");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public static void main(String[] args) {
		ExtendsThread thread1 = new ExtendsThread("线程一");
		thread1.start();
		ExtendsThread thread2 = new ExtendsThread("线程二");
		thread2.start();
	}
}
