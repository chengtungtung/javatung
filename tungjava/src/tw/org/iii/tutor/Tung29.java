package tw.org.iii.tutor;

public class Tung29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tung291 obj = new Tung291();
	}

}

// 設計類別
class Tung291{
	// 設計建構式
	Tung291(){
		// super();
		this(2);
		System.out.println("Tung291()");
	}
	Tung291(int a){
		this(false);
		System.out.println("Tung291(int)");
	}
	Tung291(boolean b){
		System.out.println("Tung291(boolean)");
	}
} 