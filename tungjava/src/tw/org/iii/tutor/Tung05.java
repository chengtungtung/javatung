package tw.org.iii.tutor;

public class Tung05 {

	public static void main(String[] args) {
		// 字元(用單引號)是基本型別，但字串(雙引號)是物件
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;  // 0~65535  // ASCII拉定字母電腦編號 // ALT + 數字(可以從數字去找到對字元) 
		//都是正數，不會有負數
		System.out.println(c2);
		char c3 = '資';
		System.out.println(c3);
		/*
		印出：
		a
		a
		資
		 */

		// 可以用運算(但沒甚麼作用)
		int c4 = c1 + c2;
		System.out.println(c4);
		
		/*
		印出：
		194
		 */
		
			

	}

}
 