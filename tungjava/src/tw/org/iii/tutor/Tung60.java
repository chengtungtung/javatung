package tw.org.iii.tutor;

public class Tung60 {

	public static void main(String[] args) {
		// 多重執行緒Thread => 有生命的物件
		// 多重執行緒就是一個程式裡有多個任務要執行
		MyThread mt1 = new MyThread("mt1");
		MyThread mt2 = new MyThread("mt2");
		//mt1.run();  // 呼叫該物件的普通方法，會照著順序，先跑這行，然後再跑下一行程式
		mt1.start();  // 生命的起源，會自己去跑run方法，會先跳到旁邊，先執行下面程式，晚點再執行這行
		//mt2.run();
		mt2.start();  // 會有新分支
		System.out.println("ok");
//		System.out.println("xx");
//		System.out.println("ss");
		//mt1.start(); // 生命只有一個，沒辦法重來，物件只有一個生命
		
//		MyRunnable mr1 = new MyRunnable("C"); // 此物件不是執行緒
//		Thread t1 = new Thread(mr1); // 把物件轉成執行緒
//		t1.start();
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
				Thread.sleep(200); // 先睡個0.2秒，但時間間格會大於0.2秒，因為可能有時間執行緒同時要執行，所以要排隊，程式會隨意選一個排隊的執行緒去執行，這不是開發者能控制的
				// 在排隊的執行緒狀態為runable，在等待執行
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

//class MyRunnable implements Runnable {        // 可以找多個爸爸
//	private String name;
//	MyRunnable(String name){this.name = name;}
//	
//	@Override  // 覆寫Runnable的run方法
//	public void run() {
//		for (int i = 0; i < 20; i++) {
//			System.out.println(name + ":" + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				
//			}
//		}
//	}
//}