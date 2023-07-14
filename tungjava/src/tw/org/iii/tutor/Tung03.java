package tw.org.iii.tutor;

import java.util.Scanner; //  先打Scanner 後 alt + / 會自動跳這行

public class Tung03 {

	public static void main(String[] args) {
		// 從鍵盤輸入東西
		// java.util(工具包)->scanner (需要import)
		// java.lang(不需import)
		
		/*
		scanner 不須import的方法： 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		 */
		
//		Scanner scanner = new Scanner(System.in); 
//		System.out.print("X = "); // 不用println才不會換行
//		int x = scanner.nextInt();
//		System.out.print("Y = ");
//		int y = scanner.nextInt();
//		int r1 = x + y;
//		int r2 = x - y;
//		int r3 = x * y;
//		int r4 = x / y;
//		int r5 = x % y;
//	
//		// System.out.println(x + "+" + y + "=" + r) 此方式也可以，格式化更好;
//		// 底下為格式化方式
//		System.out.printf("相加結果：" + "%d + %d = %d\n", x , y , r1);
//		System.out.printf("相減結果：" + "%d - %d = %d\n", x , y , r2);
//		System.out.printf("相乘結果：" + "%d * %d = %d\n", x , y , r3);
//		System.out.printf("相除結果(沒有餘數)：" + "%d / %d = %d\n", x , y , r4);
//		System.out.printf("相除結果(有餘數)：" + "%d / %d = %d ... %d\n", x , y , r4 , r5);
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.printf("hello,%s",input);
		
	}

}
