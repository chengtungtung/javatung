package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class Tung26 {

	public static void main(String[] args) {
		// 物件記憶體位置
		Bike b1 = new Bike("Tung");
		System.out.println(b1);
		/*
		印出：
		Bike(String)
		tw.org.iii.classes.Bike@2f92e0f4  // 記憶體位置
		 */
		
		Bike b2 = new Bike("Tung");
		System.out.println(b2);
		/*
		印出：
		Bike(String)
		tw.org.iii.classes.Bike@28a418fc  // 記憶體位置與b1不會一樣
		 */
		
		System.out.println(b1 == b2);  //   ==是在比記憶體位置，當物件時，是否為相同物件實體
		/*
		印出：  
		false  // 肚子裡的東西不一樣，也就是記憶體位置不一樣
		 */
		
		Bike b3 = b1; // 把b1值放進b3
		System.out.println(b1 == b3);
		/*
		印出：  
		true  // 記憶體位置一樣
		 */
		
		int[] a1 = new int[3];
		System.out.println(a1);
		/*
		印出：
		[I@5305068a  // [代表陣列，I代表int
		 */
		
		double[] a2 = new double[3];
		System.out.println(a2);
		/*
		印出：
		[D@1f32e575  // D代表double
		 */
		
		boolean[] a3 = new boolean[3];
		System.out.println(a3);
		/*
		印出：
		[Z@279f2327
		 */
		
		byte[] a4 = new byte[3];
		System.out.println(a4);
		/*
		印出：
		[B@2ff4acd0
		 */
		
		
	}

}
