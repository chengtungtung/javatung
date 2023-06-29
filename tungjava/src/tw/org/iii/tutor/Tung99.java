package tw.org.iii.tutor;

import java.util.Scanner;

public class Tung99 {

	public static void main(String[] args) {
		// 99乘法表
		// \t 跳脫字元
//		for(int k=0 ; k<2 ; k++) {
//			for(int j=1 ; j<=9 ;j++) {
//				for(int i=2 ; i<=5 ; i++) {
//					int newi = i + k * 4;
//					int r= newi * j;
//					System.out.printf("%d x %d = %d\t",newi ,j ,r);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//			
		// 再修正
//			final int START = 2;
//			final int ROWS = 3;
//			final int COLS = 6;
//			
//			
//			for(int k=0 ; k<ROWS ; k++) {
//				for(int j=1 ; j<=9 ;j++) {
//					for(int i=START ; i<=(START+COLS-1) ; i++) {
//						int newi = i + k * COLS;
//						int r= newi * j;
//						System.out.printf("%d x %d = %d\t",newi ,j ,r);
//					}
//					System.out.println();
//				}
//				System.out.println();
//			}

//			for(int j = 0; j < 10 ; j++) {
//				for (int i = 1; i <= 10 ; i++) {
//					int num = i + j*10;
//					for () {
//					if(num % r == 0)
//					System.out.print(num +" ");
//					}
//				}
//				System.out.println();
//			}



		// 1~100 求質數
//		for (int i = 1; i <= 10; i++) {
//			// System.out.print(i);
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					break;
//				}else {
//					if(i-1==j) {
//						System.out.println(i);
//					}
//				}	
//			}			
//		}
		
		// 1~100 找質數，質數列出來
//		for (int i = 1; i <= 10; i++) {
//			boolean k = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {  // i 除以 j 整除的話，還是false ; 有餘數的話，還是true
//					k = false;
//					break;
//				}
//			}
//			if(k) {
//				System.out.println(i);
//			}	
//		}
		
		// 使用者可以自行填入值，可找出1到值之間的質數
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("請輸入數字：");
//		int num = scanner.nextInt();
//		System.out.printf("1~%d之間的質數有\n",num);
//		
//		int num1;
//		if(num % 10 != 0){
//			num1 = num / 10 + 1;
//		}else {
//			num1 = num / 10;
//		}
//		
//		for(int n=0 ; n<num1 ; n++ ){		
//		for (int i = 1; i <= 10; i++) {
//			boolean k = true;
//			int a = i + n*10;
//			if (a > num) {
//				break;
//			}else {
//				for (int j = 2; j < a; j++) {
//					if (a % j == 0) { // i 除以 j 整除的話，還是false ; 有餘數的話，還是true
//						k = false;
//						break;
//					}
//				}
//				if (k) {
//					System.out.printf("%d(o)\t", a);
//				} else {
//					System.out.printf("%d(x)\t", a);
//				}
//			}
//		}
//		System.out.println();
//	}
		
		
		// 使用者可以自行輸入想要找質數的範圍
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入開始的數字：");
		int start = scanner.nextInt();
		System.out.println("請輸入結束的數字：");
		int over = scanner.nextInt();
		System.out.printf("從%d到%d的質數有\n", start , over);
		
		int num1;
		if(over % 10 != 0){
			num1 = over / 10 + 1;
		}else {
			num1 = over / 10;
		}
		
		for(int n=0 ; n<num1 ; n++ ){		
			for (int i = start; i <= start+9; i++) {
				boolean k = true;
				int a = i + n*10;
				if (a > over) {
					break;
				}else {
					for (int j = 2; j < a; j++) {
						if (a % j == 0) { // i 除以 j 整除的話，還是false ; 有餘數的話，還是true
							k = false;
							break;
						}
					}
					if (k) {
						System.out.printf("%d(o)\t", a);
					} else {
						System.out.printf("%d(x)\t", a);
					}
				}
			}
			System.out.println();
		}
		
		
		// 99乘法練習
//		final int start = 2;
//		final int column = 3;
//		final int row = 3;
//		
//		
//		for(int n=0 ; n<row ; n++) {
//			for (int j = 1; j <=9; j++) {
//				for (int i = start; i <= start+column-1 ; i++) {
//					int newi= i + column*n;
//					int mul = newi*j;
//					System.out.printf("%d X %d = %d\t", newi , j , mul);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
