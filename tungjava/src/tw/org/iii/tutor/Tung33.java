package tw.org.iii.tutor;

public class Tung33 {

	public static void main(String[] args) {
		// 型別轉換(多型)
		// Car(父類別)----Fcar(子類別)
		//	     └-------Mcar(子類別)
		// Fcar跟Mcar沒有任何關係，因為是旁系
		
		Car car1 = new Car();
		car1.m1();car1.m2();
		
		Car car2 = new Fcar(); // 以Car看法擁有一台實體Fcar，用Car的功能看待骨子裡是Fcar的車
		car2.m1();car2.m2();   // 不會有m3方法可以呼叫
		
		Fcar car3 = new Fcar();
		car3.m1();car3.m2();car3.m3();
		
		Fcar car4 =(Fcar)car2; // 要強制轉型
		car4.m3();
		
		System.out.println(car2 == car3);  // 會印出false，因為new出兩個物件
		System.out.println(car2 == car4);  // 會印出true
		
		Mcar car5 = new Mcar();
		Car car6 = car5; // 不用強制轉型，會自動轉型
		car6.m1();car6.m2(); // 沒有m3方法
		car5.m1();car5.m2();car5.m3();
		//Fcar car7 = (Fcar)car6; // 編譯成功，但執行失敗
		/*
		執行失敗：Mcar cannot be cast to class tw.org.iii.tutor.Fcar
		 */
		System.out.println("--------");
		doJob(car1);
		doJob(car2);
		doJob(car5);
		
		System.out.println("--------");
		// 直系血親上的辨別
		if (car1 instanceof Car) { // car1的骨子裡是Car嗎
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
		if (car1 instanceof Fcar) { // car1的骨子裡是Fcar嗎
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
		
		
	}
	
	static void doJob(Car car) {
		car.m1();
	}
	
	
}

// 設計一台類別Car
class Car{
	// 設計方法
	void m1() {
		System.out.println("car:m1()");
	}
	void m2() {
		System.out.println("car:m2()");
	}
}

// 設計一台類別Fcar
class Fcar extends Car{
	// 設計方法
	void m1(){  // override
		System.out.println("Fcar:m1()");
	}
	void m3(){
		System.out.println("Fcar:m3()");
	}	
}

//設計一台類別Mcar
class Mcar extends Car{
	void m1(){
		System.out.println("Mcar:m1()");
	}
	void m3(){
		System.out.println("Mcar:m3()");
	}	
}

//Car(父類別)----Fcar(子類別)
//└---------Mcar(子類別)
//Fcar跟Mcar沒有任何關係，因為是旁系


