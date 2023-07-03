package tw.org.iii.tutor;

public class Tung35 {
	// 設計一個形狀的抽象類別，等著各個形狀子類別去繼承形狀父類別
	// Shape父類別----RecShap(子類別)
	//      └-------CircleShap(子類別)
    // RecShap和CircleShap是旁系，沒有任何關係
	public static void main(String[] args) {
		// 
		Shape s1 = new RecShap(10, 4);
		Shape s2 = new CircleShap(3);
		System.out.println(s1.calArea());
		System.out.println(s2.calArea());
		System.out.println(s2.calLength());
		sumArea(s1, s2);
		
	}
	
	// static方法，不用物件實體，就可以呼叫
	static void sumArea(Shape s1,Shape s2) {
		System.out.println(s1.calArea() + s2.calArea());
	}

}

// 抽象類別(設計一個形狀的類別)
abstract class Shape {
	// 抽象方法
	abstract double calArea();  // 計算面積，由於有多種形狀，各個形狀面積的計算方法都不同，所以設計抽象方法，期待子類別去實作
	abstract double calLength(); // 計算周長
}

// 設計一個矩形的類別，去繼承形狀類別，想要繼承抽象類別，就要把抽象類別中的抽象方法都實做出來
class RecShap extends Shape{
	// 屬性
	double w, h;
	
	// 建構式
	RecShap(double w ,double h){this.w=w ; this.h=h;}
	
	// 方法
	double calArea() {
		return w*h;
	}
	double calLength() {
		return (w+h)*2;
	}
}

// 設計一個圓形類別去繼承形狀類別
class CircleShap extends Shape{
	double r;
	
	CircleShap(double r){this.r = r;}
	
	double calArea() {
		return Math.PI * r * r ;
	}
	double calLength() {
		return Math.PI * r * 2 ;
	}
}


