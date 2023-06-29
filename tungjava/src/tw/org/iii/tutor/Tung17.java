package tw.org.iii.tutor;

public class Tung17 {

	public static void main(String[] args) {
		// 二維
		int[][] a = new int[3][]; // 宣告一個int二維，一維只能放3個值，二維還沒有定義可以放幾個值
		a[0] = new int[4];        // 一維a[0]可以放4個值
		a[1] = new int[2];
		a[2] = new int[3];
		
		// 放值進去
		a[0][0]=123;
		a[0][1]=45;
		a[0][2]=76;
		a[0][3]=53;
		
		a[1][0]=21;
		a[1][1]=112;
		
		a[2][0]=75;
		a[2][1]=87;
		a[2][2]=64;
		
		// foreach方法 做尋訪
//		for(int[] b : a) {
//			for(int c : b) {
//				System.out.print(c + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("---------------");
//		
//		// 純for方法
		for(int i=0 ; i<a.length ; i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
//		int sum=0
//		for(int i=0 ; i<a.length ; i++) {
//			for(int j =0;j<a[i].length;j++) {
//				int b = a[i][j];
//				sum = sum + b;		
//				System.out.println(sum + " ");
//			}
//			System.out.println();
//		}
		
		
		// 尋訪練習
		for(int[] b:a) {
			for(int c:b)
			System.out.print(c + " ");
		}
		
		

	}

}
