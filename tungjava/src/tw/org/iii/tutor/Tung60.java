package tw.org.iii.tutor;

public class Tung60 {

	public static void main(String[] args) {
		// 多重執行緒Thread => 有生命的物件
		MyThread mt1 = new MyThread("mt1");
		MyThread mt2 = new MyThread("mt2");
		//mt1.run();  // 呼叫該物件的普通方法
		mt1.start();  // 生命的起源，會自己去跑run方法
		//mt2.run();
		mt2.start();  // 會有新分支
		System.out.println("ok");
//		System.out.println("xx");
//		System.out.println("ss");
		//mt1.start(); // 生命只有一個，沒辦法重來，物件只有一個生命
		
		MyRunnable mr1 = new MyRunnable("C"); // 此物件不是執行緒
		Thread t1 = new Thread(mr1); // 把物件轉成執行緒
		t1.start();
	}

}

class MyThread extends Thread {                 // 只能有一個爸爸
	private String name;
	MyThread(String name){this.name = name;}
	
	@Override  // 覆寫Thread的run方法
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

//class Tung601{
//	Object m1() {return null;}
//}
//
//class Tung602 extends Tung601{
//	String m1(){return null;}
//}

class MyRunnable implements Runnable {        // 可以找多個爸爸
	private String name;
	MyRunnable(String name){this.name = name;}
	
	@Override  // 覆寫Runnable的run方法
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}