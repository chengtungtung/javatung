package tw.org.iii.classes; // package是在做分門別類

import java.io.Serializable;

// 一個類別中只會有一個主類別，被宣告為public的類別稱為主類別
// public class Bike代表對外宣稱是甚麼東西，{}裡的東西代表定義該類別
public class Bike implements Serializable { //public為存取修飾字 原始檔檔名要跟類別名稱一致
	// class A {  }
	// Bike為物件，會擁有(has-a)：1. 屬性 2.方法 (屬性和方法為member)
	// 在設計物件時，屬性比方法最重要，因為屬性是代表該物件的狀態
	
	// 設計屬性(但不太正確要修正)
	double speed1; // 代表這個類別Bike擁有這個屬性speed1(前面要加存取修飾字public，在Tung21中的b1.speed1才能呼叫)
	// public 代表全世界都可存取的到
	
	// 屬性型別換一下，會發現跟陣列一樣，當不給值，會給預設值
	public boolean test;
	public int test1;
	
	//------------------------------------------------------------------------
	
	// 修飾字的存取範圍 (大) public -> protected -> 沒寫 -> private (小)
	// public：全世界都能存取
	// protected：繼承能存取以及相同package才能存取
	// 沒寫：相同package才能存取
	// private：本類別才能存取
	
	// 設計屬性，且有給存取修飾字public
//	public double speed;
//	public String owner;
	
	//------------------------------------------------------------------------
	
	// 設計方法(功能：加速upSpeed()、煞車downSpeed())
	// 設計一個加速度的功能，設為public才能公開使用，void代表不用回傳值(因為純粹做加速度的動作，不用回傳值)，upspeed()是方法名稱(不用傳參數)
	public void upSpeed(){  
		speed = speed < 1 ? 1 : speed*1.2;  // speed一開始預設為0.0，如果小於1，就讓speed變成1，否則就讓speed*1.2
		// 所以當呼叫一次upSpeed()，speed會變成1，再呼叫一次upSpeed()，會以之前的speed去乘以1.2，加速度增加
	} 
	
	public void downSpeed(){
		speed = speed < 1 ? 0 : speed*0.5; // 當呼叫煞車downSpeed()，如果speed小於1，就讓speed變成0，否則就讓speed*0.5，減速慢下來
	}
	
	//----------------------------------------------------------------------------------------------------
	
	// speed屬性，照常理來講速度是看不到的，所以速度不應該隨意存取
	// 所以將屬性speed的存取修飾字改為private
	// private代表該屬性只能在所屬的該物件做存取，代表speed只能在Bike物件裡做使用
	//private double speed;  // speed為物件變數
	// 一旦設定為private，Tung21中對屬性speed的呼叫，都會出錯
	
	// 由於子類別Scooter想覆寫方法，需要用到屬性speed，但上方修飾字為private要改為protected
	// protected介於public與private之間，protected不能給全世界都存取，但可以給繼承的子類別存取以及可以給相同package存取
	protected double speed;
	
	//------------------------------------------------------------------------
	
	// 由於速度是看不到的，但又想知道速度，所以多加一個功能(方法)為碼表
	public double getSpeed() {  // 會return double值回來
		return speed;
	}
	// 所以加上此方法，就沒辦法任意改變屬性speed的值
	
	//--------------------------------------------------------------------------
	
	// 建構式/子/方法
	// 建構式是指在做物件初始化要做的事，簡單說就是物件做出來時，一開始希望物件的樣子或狀態
	// 在做一台新的腳踏車時，會自動完成初始化且會依照型別產生預設值，但當我們希望不要照預設值，而能自訂數值時，就會設計建構式來設定
	// 對於一個物件而言，一生只會被執行一次，稱為建構式
	// 通常會放在屬性跟方法之間，但不是慣例
	/*
	存取修飾字 class 類別名稱{
		屬性...
		
		建構式...
		
		方法...
	}
	 */
	
	// 繼承裡面沒有包含建構式
	// 編譯器會幫忙找父類別的建構式
	// 建構式的樣子跟方法的樣子很像，但建構式沒有傳回值
	private int color;
	
	public Bike() {  // Bike()為方法名稱，需要跟類別名稱一模一樣
//		System.out.println("Bike()");
		color = 1;
	}
	
	public Bike(int newColor) {  // 可以再設一個建構式，此建構式代表可以指定顏色
		System.out.println("Bike()");
		color = newColor;
	}
	
	public int getColor() {
		return color;
	}
	
	
	public Bike(String name) {
		System.out.println("Bike(String)");
		//owner = "default";	
	}
	
	@Override // 在識別此動作，在覆寫
		public String toString() {
			return "My speed is" + speed;
		}

	
}
