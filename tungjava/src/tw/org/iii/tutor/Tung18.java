package tw.org.iii.tutor;

import java.util.Scanner;

public class Tung18 {

	public static void main(String[] args) {
		// while迴圈
		// 跟if有點像，但if判斷完true、false後，就結束
		// 而while是只要是true，就會一直跑迴圈
//		int a = 1;
//		while (a<10) {
//			System.out.println(a++);
//		}
//
//		System.out.println("-------------");
//		
//		// 改成for
//		for(int b = 1; b<10 ;b++) {
//			System.out.println(b);
//		}
		
		// 1 + 2 + 3 + 4 + 5 +..... + n = ?
		
		// for方法
		int sum = 0; 
		for(int a=1 ; a<=10 ; a++) {
			sum += a;
			System.out.println(sum);
		}
		
		System.out.println("----------------");
		
		// while方法
		int i =1, sum1 = 0;
		while(i<=10) {
			sum1 += i++;
		}
		System.out.println(sum1);
		
		System.out.println("----------------");
		
		// 1 + 2 + 3 + 4 + 5 + ... + n
		System.out.println("n = ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int j =1, sum2 = 0;
		while(j<=n) {
			sum2 += j++;
		}
		System.out.printf("1 + 2 + 3 + ... + %d = %d", n , sum2);
	}

}
