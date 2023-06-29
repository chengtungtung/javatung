package tw.org.iii.tutor;

public class Tung10 {

	public static void main(String[] args) {
		// 邏輯運算
		int a= 10 , b = 3;
		
		if ( a++ <= 10 && b-- >= 3) {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}
		
		/*
		印出：
		OK：a = 11, b = 2
		 */
		
		if ( ++a <= 10 && --b >= 3) {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}
		
		/*
		印出：
		OK：a = 12, b = 2
		 */
		
		if ( ++a <= 10 || --b >= 3) {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}
		
		/*
		印出：
		OK：a = 13, b = 1
		 */
		
		if ( ++a <= 10 & --b >= 3) {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("OK：a = %d, b = %d\n", a, b);
		}
		
		/*
		印出：
		OK：a = 14, b = 0
		 */
		
		// 位元運算
		System.out.println(3 & 2);
		System.out.println(3 | 2);
		System.out.println(3 ^ 2);  // XOR (1和1，0和0都是false；1和0，0和1都是true)
		

	}

}
