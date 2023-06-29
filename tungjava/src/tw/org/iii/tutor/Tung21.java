package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class Tung21 {

	public static void main(String[] args) {
		// 物件導向：設計(屬性、特徵) -> (方法、功能)
		
//		// 做出一台腳踏車
//		Bike b1 = new Bike("Tung"); // b1寫在方法中，為區域變數，new完後已自動完成初始化，所以不用給值，預設為0.0
//		// brad b2 = new Brad(); // 沒有brad物件，所以沒辦法宣告
//		
//		// 呼叫Bike中的speed1屬性
//		// System.out.println(b1.speed1); // . 代表呼叫
//		/*
//		錯誤：The field Bike.speed1 is not visible (代表看不到speed1，因為在Bike類別中的屬性speed1沒有設為public)
//		加上public後，會印出0.0，因為speed1宣告為double，預設值為0.0
//		 */
//		
//		// 測試其他型別不給值的話，預設為多少
//		System.out.println(b1.test);  // 會印出 false
//		System.out.println(b1.test1); // 會印出 0
//		// 會發現跟陣列一樣，不給值，就會印出預設值
		
		//--------------------------------------------------------------------
		
		// 做出兩台腳踏車，並個別將屬性給值，可以發現不同腳踏車的屬性值可以不一樣
		Bike b2= new Bike();
		Bike b3= new Bike();
//		
//		// 各自屬性給值
//		System.out.println(b2.speed); // 原先沒給值皆為double預設值0.0
//		System.out.println(b3.speed); // 原先沒給值皆為double預設值0.0
//		b2.speed = 100;
//		b3.speed = 150;
//		System.out.println(b2.speed);
//		System.out.println(b3.speed);
//		/*
//		印出：
//		0.0
//		0.0
//		100.0
//		150.0
//		 */
		
		//------------------------------------------------------------------
		
		// 呼叫方法(使用功能)，使用上面b2腳踏車和b3腳踏車
//		b2.upSpeed();
//		System.out.println(b2.speed); // 因為只有呼叫一次，從預設值0.0變成1
//		b2.upSpeed();b2.upSpeed();b2.upSpeed();
//		System.out.println(b2.speed); // 因為再呼叫三次，所以1會乘以三次的1.2變成1.728
//		
//		b3.upSpeed();b3.upSpeed();b3.upSpeed();b3.upSpeed();b3.downSpeed();
//		System.out.println(b3.speed); // 一樣呼叫了四次，變成1.728，但又呼叫了一次downSpeed()，所以1.728乘以0.5，變成0.864
//		/*
//		印出：
//		1.0
//		1.728
//		0.864
//		 */
//		
//		// 呼叫進階，要讓b2的speed達到10以上
//		// while迴圈方式
//		while(b2.speed<10) {
//			b2.upSpeed();
//		}
//		System.out.println(b2.speed);
//		
//		// for迴圈方式
//		for(int i=0 ; b2.speed<10 ; i++) {
//			b2.upSpeed();
//		}
//		System.out.println(b2.speed);
		
		//--------------------------------------------------------------------------------
		
		// 由於速度speed是看不見且不能任意更改的，所以將屬性speed的存取修飾子改為private，另外增加一個方法getSpeed()可以得知速度
		// 因此上方程式碼需要做修改
		b2.upSpeed();
		System.out.println(b2.getSpeed()); // 因為只有呼叫一次，從預設值0.0變成1
		b2.upSpeed();b2.upSpeed();b2.upSpeed();
		System.out.println(b2.getSpeed()); // 因為再呼叫三次，所以1會乘以三次的1.2變成1.728
		
		b3.upSpeed();b3.upSpeed();b3.upSpeed();b3.upSpeed();b3.downSpeed();
		System.out.println(b3.getSpeed()); // 一樣呼叫了四次，變成1.728，但又呼叫了一次downSpeed()，所以1.728乘以0.5，變成0.864
		
		// 呼叫進階，要讓b2的speed達到10以上
		// while迴圈方式
		while(b2.getSpeed()<10) {
			b2.upSpeed();
		}
		System.out.println(b2.getSpeed());
		
		// for迴圈方式
		for(int i=0 ; b2.getSpeed()<10 ; i++) {
			b2.upSpeed();
		}
		System.out.println(b2.getSpeed());
		
		//------------------------------------------------------------------------------
		
		
		
		
//		System.out.println(b1.getSpeed()); // .代表呼叫
//		System.out.println(b1.owner);
		

	
	}

}
