package tw.org.iii.tutor;

import java.util.Scanner;

public class Tung09 {

	public static void main(String[] args) {
		
		// 閏年的判斷(年份除以4整除的話為閏年)
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入年分： ");
		int year = scanner.nextInt();
		
		// 方法一
		if (year % 4 == 0) {
			if(year % 100 == 0 ) {
				if(year % 400 == 0) {
					System.out.println(year + "年為閏年");
				}else {
					System.out.println(year + "年為平年");
				}		
			}else {
				System.out.println(year + "年為閏年");
			}
		}else {
			System.out.println(year + "年為平年");
		}
		
		// 方法二(但效率沒那麼好)
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			// 366
		}else {
			// 365
		}

	}

}
