package tw.org.iii.tutor;

public class Tung34 {

	public static void main(String[] args) {
		// 多型(抽象)
		//Tung341 obj1 = new Tung341(); // 只能宣告(Tung341 obj1;)，不能實作(=new Tung341();)
		Tung341 obj1 = new Tung342();
		Tung341 obj2 = new Tung341() {
			void m3() {System.out.println("Tung341:m3()");}  // 直接實作
		};
		obj2.m3();
	}

}

// 抽象類別
abstract class Tung341{
	// 設計方法
	void m1() {System.out.println("Tung341:m1()");}
	void m2() {System.out.println("Tung341:m2()");}
	// 抽象方法(只有實作，沒有定義)
	abstract void m3(); // 沒辦法直接做出來
}

class Tung342 extends Tung341{
	void m3() {System.out.println("Tung341:m3()");}
}

class Tung343 extends Tung341{
	void m3() {System.out.println("Tung341:m3()");}
}

