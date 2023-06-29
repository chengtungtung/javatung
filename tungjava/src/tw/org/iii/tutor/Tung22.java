package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;
import tw.org.iii.classes.Scooter;

public class Tung22 {

	public static void main(String[] args) {
		// override 覆寫
		Bike b1 = new Bike();  // 若在Bike類別中設計好建構式，則在建立新物件時，會被呼叫，印出Bike()
		Scooter s1 = new Scooter();  // 由於繼承Bike，所以建構式也會繼承，印出Bike()
		b1.upSpeed();b1.upSpeed();b1.upSpeed();
		s1.upSpeed();s1.upSpeed();s1.upSpeed(); // 由於繼承，子類別Scooter繼承父類別Bike，所以Scooter可以呼叫Bike的方法
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		/*
		印出：
		1.44
		1.44
		 */
		
		System.out.println(b1.getColor());  
		
		Bike b2 = new Bike(2);
	
		
//		
//		//System.out.println(s1.getSpeed());
//		
////		s1.upSpeed();s1.upSpeed();s1.upSpeed();
////		b1.upSpeed();b1.upSpeed();b1.upSpeed();
////		System.out.println(s1.getSpeed());
////		System.out.println(b1.getSpeed());
//		
//		
//		s1.upGear();s1.upGear();s1.upGear();
//		s1.upSpeed();
//		s1.upSpeed();
//		s1.upSpeed();
//		System.out.println(s1.getSpeed());

	}

}
