package cn.ekgc.com;

public  class Synchronized {
	//被synchronized 修饰的方法在同一个时间点上只能被一个线程访问
	//由此，可以用synchronized 来进行单线程访问设置
	public synchronized void showDetails() {
		System.out.println("同一时间点之呢个");
	}
	public static void main(String[] args) {
		Synchronized s= new Synchronized();
		s.showDetails();	
	}
}
