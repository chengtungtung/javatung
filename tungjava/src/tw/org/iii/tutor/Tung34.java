package tw.org.iii.tutor;

public class Tung34 {

	public static void main(String[] args) {
		// 多型(抽象)
		// 父類別想要創造多型的子類別，但自己不實作，交給子類別來實作，來發揚光大
		// 在設計抽象類別時的設計觀點，就是希望想要設計出不同各式各樣的子類別來實作抽象類別，就是想設計子類別的多型
		
		// 抽象類別中的抽象方法，沒辦法隨意呼叫，有兩個方式能解決
		// 方法一：就由子類別去繼承，然後將方法實作
		//Tung341 obj1 = new Tung341(); // 只能宣告(Tung341 obj1;)，不能實作(=new Tung341();)
		Tung341 obj1 = new Tung342();
		
		obj1.m1();obj1.m2();obj1.m3(); // m1和m2都是繼承Tung341的方法，而m3是抽象方法，藉由Tung342實作後才能呼叫，但沒辦法呼叫m4，因為以Tung341看法擁有Tung342的實體
		Tung342 obj3 =(Tung342)obj1; // 藉由強制轉型，才有辦法呼叫m4
		obj3.m4();
		
		// 方法二：在做物件實體時，就直接實作
		Tung341 obj2 = new Tung341() {
			void m3() {System.out.println("Tung341:m3()");}  // 直接實作
		};
		obj2.m3();
		
		/*
		方法一和方法二的差別在於設計觀點：
		1. 方法一在於子類別日後還可以給類別繼承
		2. 方法二在於單純只想使用抽象類別的那個抽象方法(Tung341中的m3)，所以直接實作
		 */
		
		/*
		特別注意：當類別裡面有抽象方法就一定要宣告為抽象類別，所以通常抽象類別裡面都會有抽象方法，但！如果肚子裡沒有抽象方法還是可以宣告為抽象類別
		而抽象類別內沒有抽象方法的用意在於繼承後針對抽象類別內的一般方法去做使用，不用像介面要全部方法實作(範例Tung38的MouseAdapter)
		 */
	}

}

// 抽象類別
abstract class Tung341{  // 因為肚子裡的方法中，有抽象方法，所以要宣告為抽象類別，因為是抽象類別無法直接被建構出來 
	// 設計方法
	void m1() {System.out.println("Tung341:m1()");}
	void m2() {System.out.println("Tung341:m2()");}
	// 抽象方法(沒有實作，只有定義)
	abstract void m3(); // 沒辦法直接做出來，需要透過子類別實作
}

class Tung342 extends Tung341{
	void m3() {System.out.println("Tung341:m3()");}
	void m4() {System.out.println("Tung342:m4()");}  // Tung342做了自己的方法m4
}

class Tung343 extends Tung341{
	void m3() {System.out.println("Tung341:m3()");}
}

