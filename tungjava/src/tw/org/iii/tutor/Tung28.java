package tw.org.iii.tutor;

import tw.org.iii.classes.TWID;

public class Tung28 {

	public static void main(String[] args) {
		// 正規表示法 regex
		System.out.println(Math.random());
		System.out.println(TWID.isRightID("abc"));
		
		
		// 正規表示法結合java.lang.string.matches
		String id = "A123456789"; 
		if (id.matches("[A-Z][12][0-9]{8}")) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
		System.out.println("---------------------------");
		
		// 身分證驗證執行
		if (TWID.isRightID("B123456780")) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
		
		
	}

}
