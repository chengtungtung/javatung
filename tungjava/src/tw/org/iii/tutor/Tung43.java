package tw.org.iii.tutor;

import java.io.File;

public class Tung43 {

	public static void main(String[] args) {
		// 
		File dir1 = new File("d:\\tung\\dir");
		/*
		一開始打d:\tung\dir會出現底下錯誤
		語法錯誤：Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		
		 */
		
		if (dir1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
		
		File dir2 = new File("d:/tung/test");  // 打成/也會視同為一樣樣
		if (dir2.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
		// c:\...\  => 從根講起，是絕對位置
		
		
		
		
	}

}
