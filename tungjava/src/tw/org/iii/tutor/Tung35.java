package tw.org.iii.tutor;

//import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Tung35 {

	public static void main(String[] args) {
		// 
		Shape s1 = new RecShap(10, 4);
		Shape s2 = new CircleShap(3);
		System.out.println(s1.calArea());
		System.out.println(s2.calArea());
		System.out.println(s2.calLength());
		sumArea(s1, s2);
		
	}
	
	static void sumArea(Shape s1,Shape s2) {
		System.out.println(s1.calArea() + s2.calArea());
	}

}
abstract class Shape {
	// 抽象方法
	abstract double calArea();
	abstract double calLength();
}

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


