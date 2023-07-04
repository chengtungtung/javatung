package tw.org.iii.tutor;

public class Tung39 {

	public static void main(String[] args) {
		// 例外異常Exception - RuntimeException
		/*
		 Throwable
		  └> Exception(可以處理) -> RuntimeException (執行時錯誤)  -> ArithmeticException
	      └> Error(沒辦法處理)    └> 非 RuntimeException         └> IndexOutOfBoundsException -> ArrayIndexOutOfBoundsException
		                          (Checked Exception(編譯時錯誤))
		
		Checked Exception(編譯時錯誤)的存在是讓開發者在遇到錯誤可以有更彈性的解決方法
		*/
		
		
		// 底下的錯誤是RuntimeException的錯誤
//		int a = 10, b = 0;
//		System.out.println("Hello World");
//		try {
//			System.out.println(a / b);
//			System.out.println("ok");
//		}catch(ArithmeticException e) {
//			System.out.println("Ooop!");
//		}
		/*
		在還沒拋出例外之前
		印出：
		Hello World
		Exception in thread "main" java.lang.ArithmeticException: / by zero
			at tw.org.iii.tutor.Tung39.main(Tung39.java:16)
		 */
		/*
		在拋出例外之後
		印出：
		Hello World   // 因為拋出例外，會直接跳過"ok"那行
		Ooop!
		 */
		
		
//		int[] c = new int[4];
//		System.out.println(c[2]);
//		try {
//			System.out.println(c[123]);
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("錯誤");
//		}
//		/*
//		印出：
//		0
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 123 out of bounds for length 4
//			at tw.org.iii.tutor.Tung39.main(Tung39.java:23)
//		 */
		
		
		// 多重捕捉
//		int a = 10, b = 10;
//		int[] c = new int[4];
//		System.out.println("Hello World");
//		try {
//			System.out.println(a / b);
//			System.out.println("ok");
//			System.out.println(c[2]);
//			System.out.println(c[123]);
//		}catch(ArithmeticException e) {
//			System.out.println("Ooop!");
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("xxxxx");
//		}
		
//		int a = 10, b = 0;
//		int[] c = new int[4];
//		System.out.println("Hello World");
//		try {
//			System.out.println(a / b);
//			System.out.println("ok");
//			System.out.println(c[2]);
//			System.out.println(c[123]);
////		}catch(ArithmeticException e) {
////			System.out.println("Ooop!");
//		}catch(RuntimeException e){
//			System.out.println("xxxxx");
//		}
		
	}

}
