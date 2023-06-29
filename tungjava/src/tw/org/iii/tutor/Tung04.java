package tw.org.iii.tutor;

public class Tung04 {

	public static void main(String[] args) {
		// float為單精確度
		// double為雙精確度
		// 精確度的比較
		// 問題：為什麼不都用double就好？因為精確一點可以節省記憶體
		
		float var1 = 10.123456789f; // 若沒有加f，會被視為double，會產生型別錯誤，java預設為double
		double var2 = 10.123456789;
		System.out.println(var1);
		System.out.println(var2);
		/*
		印出：
		10.123457
		10.123456789
		 */
		
		double a = 10;
		double b = 3;
		System.out.println(a / b);
		/*
		印出：
		3.3333333333333335
		 */

		double c = 10;
		double d = 0; // 不是真的0，是接近0的數
		System.out.println(c / d);
		/*
		印出：
		Infinity //無限
		 */
		
		double e = 0;
		double f = 0;
		System.out.println(e / f);
		/*
		印出：
		NaN //不是數字
		 */
		
		System.out.println(10 / 0); // int 10 除以 int 0
		/*
		執行錯誤：
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at tw.org.iii.tutor.Tung04.main(Tung04.java:35)
		 */
		
		
	}

}
