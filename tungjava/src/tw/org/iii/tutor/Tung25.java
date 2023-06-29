package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;

public class Tung25 {

	public static void main(String[] args) {
		// String字串應用
		// 由於String在java.lang，所以不用import
		/*
		String在api上可以發現，當時宣告為public final class String，
		final在變數宣告的時候，就是所謂常數，代表只能被給值一次，就不能再給值，
		但這邊的fianl在類別的時候，代表從此之後不會再有子類別，也沒辦法把它當父類別
		 */
		
		/*
		在api中，出現Deprecated，代表現在此方法有支援，
		但未來的版本不一定有支援，所以在使用上要小心
		 */
		
		String s1 = "Tung"; // ""只要一出現，java會判斷""裡，會偷偷在記憶體自動產生物件(也就是new出一個物件)，""寫出來就是物件
		// 記憶體會產生一個新物件"Tung"，再將"Tung"指派給s1
		System.out.println(s1);
		System.out.println("Tung");  // "Tung"就是物件，所以s1跟"Tung"一樣都是物件
		System.out.println(s1.charAt(0));        // s1物件的第0個位置
		System.out.println("Tung".charAt(0));    // "Tung"物件的第0個位置
		// 所以字串的內容不能修改，一旦修改字串在記憶體上就會是新物件
		
		/*
		印出：
		Tung
		Tung
		T
		T
		 */
		
		System.out.println("--------------------");
		String s2 = new String(); 
		System.out.println(s2); // 印出來會是空的
		System.out.println("--------------------");
		Bike b3 = new Bike();   // 印出 Bike()
		System.out.println(b3); // 印出 My speed is0.0
		System.out.println("--------------------");
		
		byte[] b1 = {97, 98, 99, 100}; // 宣告的同時進行初始化
		byte[] b2 = new byte[] {97, 98, 99, 100}; // 此方法b1效果一樣，差別如下
		
		/*
		
		byte[] b1;
		b1 = {97, 98, 99, 100}; 
		// 錯誤：Array constants can only be used in initializers
		
		byte[] b2;
		b2 = new byte[] {97, 98, 99, 100}; 
		// 不會有錯誤
		
		 */
		
		// 在api若有寫Deprecated，代表未來的版本可能會拿掉此功能
		
		// String(byte[] bytes)
		String s3 = new String(b1);
		// String(byte[] bytes, int offset, int length)
		String s4 = new String(b1 , 1 , 2); // 從b1陣列，1代表取第一個字，2代表取兩個
		
		System.out.println(s3);
		System.out.println(s4);
		/*
		印出：
		abcd   (由於ASCII拉定字母電腦編號的關係，97對應到a，98對應到b，以此類推...)
		bc
		 */
		
		// 呼叫方法(concat)，可以看出字串內容不會變
		s4.concat("ghijk");
		System.out.println(s4); // 字串內容不會變更，所以還是一樣印出 bc
		
		String s5 = s4.concat("efghijk");
		System.out.println(s5); // 放入變數s5，結果印出 bcefghijk
	}

}
