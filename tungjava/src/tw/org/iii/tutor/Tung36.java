package tw.org.iii.tutor;

public class Tung36 {

	public static void main(String[] args) {
		// 介面interface
		Tung362 obj1 = new Tung362();
		Tung361 obj2 = new Tung362();
		Tung363 obj3 = new Tung362();
		obj2.m1();obj2.m2(null);
		obj3.m3();obj3.m4(null);

	}

}

// 在java裡，介面的存取修飾字永遠是public，因為規格是要給大家用的，不是用來產生物件實體，所以沒有建構式
// 因為沒有建構式，所以屬性都是常數
// 介面裡的方法都是抽象
// 規格就是在講傳回值、方法名稱(參數)是什麼，不用訂存取修飾字，因為都是public

/*
 介面 v.s 抽象類別
 相同處：都是在做多型
 相異處：1.介面裡面沒有在做實作的，抽象類別有別的方法實作
 	   2.介面可以繼承多個，抽象類別只能繼承一個
 */

// 定義第一個介面
interface Tung361{
	void m1();
	int m2(String a);
} 

// 定義一個類別來實作第一個介面
class Tung362 implements Tung361 , Tung363{  // Tung362要來實作Tung361和Tung363，有發揚光大的觀念
	public void m1() {}          // 存取修飾字叫visibility
	public int m2(String a) {return 1;}
	public void m3() {}
	public int m4(String a) {return 1;}
}


// 方法中的邏輯有順序性
// 方法的定義沒有順序性

// 定義第二個介面
interface Tung363{
	void m3();
	int m4(String a);
} 

// 定義第三個介面
interface Tung364 extends Tung361 , Tung363{  // 介面可以發揚光大多個介面，但類別只能發揚光大一個，介面不能實作介面(因為不合理)
	void m5();
} 
// Tung364是Tung361 , Tung363的子介面
