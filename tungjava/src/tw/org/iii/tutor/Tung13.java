package tw.org.iii.tutor;

public class Tung13 {

	public static void main(String[] args) {
		// for迴圈
		/*
		for(第一個敘述句:一定要做，只會做一次(初始化) ; ;第三個敘述句:程式區塊完一定要做的事){
			程式區塊
		}
		*/
		
//		for(int i=0; i<10 ; i++ ) {  // 第一個敘述句:一定要做，只會做一次(初始化) 第三個敘述句:程式區塊完一定要做的事
//			System.out.println(i);
//		}
//		System.out.println("game over");
		
		// 先宣告，for的第一個敘述句不用填
//		int i = 0;
//		for(; i<10 ; i++ ) {  
//			System.out.println(i);
//		}
//		System.out.println("game over : " + i);
		
		int i = 0;
		for(printBrad(); i<10 ; printline() ) {  
			System.out.println(i++);
		}
		System.out.println("game over : " + i);
		
	}
	
	// 做出一個方法，可以拿來使用
	static void printBrad() {
		System.out.println("Brad");
	}
	
	static void printline() {
		System.out.println("---------------");
	}
}
