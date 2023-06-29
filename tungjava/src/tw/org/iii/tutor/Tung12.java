package tw.org.iii.tutor;

import java.util.Scanner;

public class Tung12 {

	public static void main(String[] args) {
		// switch 應用
		// 輸入月份，告訴你有幾天
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("輸入月份： ");
//		int a = scanner.nextInt();
//		
//		switch(a) {
//		case 1:
//			System.out.printf("%d月有31天",a);
//			break;
//		case 2:
//			System.out.printf("%d月有28天",a);
//			break;
//		case 3:
//			System.out.printf("%d月有31天",a);
//			break;
//		case 4:
//			System.out.printf("%d月有30天",a);
//			break;
//		case 5:
//			System.out.printf("%d月有31天",a);
//			break;
//		case 6:
//			System.out.printf("%d月有30天",a);
//			break;
//		case 7:
//			System.out.printf("%d月有31天",a);
//			break;
//		case 8:
//			System.out.printf("%d月有31天",a);
//			break;
//		case 9:
//			System.out.printf("%d月有30天",a);
//			break;
//		case 10:
//			System.out.printf("%d月有31天",a);
//			break;
//		case 11:
//			System.out.printf("%d月有30天",a);
//			break;
//		case 12:
//			System.out.printf("%d月有31天",a);
//			break;
//		default:
//			System.out.printf("沒有%d月",a);
//			break;
//		} 
		
		// 從1~12亂數取一個數，取得月份天數
		int month = (int)(Math.random()*12) +1 ; // 從0~11亂數取一個數，但目的是要1~12亂數取一個值，所以+1
		int days = 0;
		switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				days = 31;
				break;
			case 4:case 6:case 9:case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			default:
				System.out.println("xx");
		}
		System.out.printf("%d月有%d天\n", month , days);
		
		
		// 再精簡
		int month1 = (int)(Math.random()*12) +1 ; // 從0~11亂數取一個數，但目的是要1~12亂數取一個值，所以+1
		int days1 = 0;
		switch(month1) {
			case 1 , 3 , 5 , 7 , 8 , 10 , 12:
				days1 = 31;
				break;
			case 4 , 6 , 9 , 11:
				days1 = 30;
				break;
			case 2:
				days1 = 28;
				break;
			default:
				System.out.println("xx");
		}
		System.out.printf("%d月有%d天", month1 , days1);
	}

}
