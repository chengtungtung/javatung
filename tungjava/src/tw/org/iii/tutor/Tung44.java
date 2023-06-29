package tw.org.iii.tutor;

import java.io.File;

public class Tung44 {

	public static void main(String[] args) {
		// 
		File here = new File(".");  // 用.表示本目錄，這是相對路徑，因為前面沒有c:\之類的
		System.out.println(here.getAbsolutePath()); // getAbsolutePath()印出絕對路徑
		/*
		印出：
		C:\Users\User\eclipse-workspace\tungjava\.
		 */
		
		File dir1 = new File("./dir3");
		if (dir1.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
			dir1.mkdir(); // 新建路徑
		}
		
		File dir2 = new File("./dir3/dir4/dir5/dir6");
		if (dir2.exists()) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
			dir2.mkdirs(); // 創副目錄，這方法較常用
		}
		
		
		
		
		
		
	}

}
