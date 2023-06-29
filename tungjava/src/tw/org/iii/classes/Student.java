package tw.org.iii.classes;

import java.io.Serializable;

public class Student implements Serializable{
	private int math , eng , ch;  // 偷偷把基本型別變成物件，基本型別做了自動封箱(Auto-boxing)變成物件
	private String name;
	private Bike bike;
	
	public Student(int math , int eng , int ch , String name) {
		this.math = math; this.eng = eng; this.ch = ch;
		this.name = name;
		bike = new Bike(name);
	}
	
	public int sum() {
		return math+eng+ch; 
	}
	
	public double avg() {
		return sum() / 3.0;
	}
	
	public String getName() {
		return name;
	}
	
}
