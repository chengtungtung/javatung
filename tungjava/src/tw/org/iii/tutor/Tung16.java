package tw.org.iii.tutor;

public class Tung16 {

	public static void main(String[] args) {
		// 擲骰子100次並記數題目(用陣列修改)
		
//		int point;  // 宣告一個int變數point
//		int[] p = new int[7];  // 宣告一個陣列變數p，陣列裡可以放7筆資料，順序為[0]~[6]
//		
//		for(int i = 0 ; i <100 ; i++  ) {     // 跑100次迴圈
//			point = (int)(Math.random()*6)+1; // 從1~6亂數取去一個值，放進變數point
//			
//			if (point >=1 && point <=6) {     // 如果亂數出來介於1~6之間，p[point]就會加1，否則p[0]就會加1
//				p[point]++;                   // ex. 假設亂數取5，point = 5，p[5]就會加1
//			}else {
//				p[0]++;
//			}
//		}
		
//		if (p[0]==0) {
//			for(int i =1;i<=6;i++) {
//				System.out.printf("%d點出%d次\n", i , p[i]);
//			}
//		}else {
//			System.out.println("xx");
//			
//		}
		
		// 三元運算(目的是取值，if...else是取程式區塊)
		//(boolean)? 值1 : 值2 -> true跑值1，false跑值2
//		int point;
//		int[] p = new int[7];
//				
//		for(int i = 0 ; i <1000000 ; i++  ) {
//			point = (int)(Math.random()*9)+1;
//					
//			if (point >=1 && point <=9) {
//				p[point>=7 ? point-3 : point]++;
//			}else {
//				p[0]++;
//			}
//		}
//		if (p[0]==0) {
//			for(int i =1;i<=6;i++) {
//				System.out.printf("%d點出%d次\n", i , p[i]);
//			}
//		}else {
//			System.out.println("xx");
//					
//		}
		
		
		
		// 練習
		int point = 0; 
		int[] p = new int[7];
		
		for(int i = 1 ; i<=100 ; i++) {
			point = (int)(Math.random()*6) +1;
			
			if(point >= 1 && point<=6) {
				p[point]++;
			}else {
				p[0]++;
			}
		}
		
		if(p[0]==0) {
			for(int j=1 ; j<=6 ; j++) {
			System.out.printf("%d點有%d次\n", j , p[j]);
			}
		}else {
			System.out.println("出現錯誤");
		}	
			
		
		
		
		
		
		
		

	}

}
