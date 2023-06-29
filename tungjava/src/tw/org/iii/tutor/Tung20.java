package tw.org.iii.tutor;

public class Tung20 {

	public static void main(String[] args) {
		// 資料交換
		int a = 10, b = 3;
		int c = 0;
		c = a;
		a = b;
		b = c;
		
		/*
		此寫法比上面的漂亮
		int c = a;
		a = b;
		b = c; 
		*/
		
		/*
		不用第三個變數的方法(在數學上，值的交換才能辦到)
		a = a + b; // a = 13
		b = a - b; // b = 10
		a = a - b; // a = 3
		 */
		
		System.out.printf("a = %d, b = %d", a , b);

	}

}
