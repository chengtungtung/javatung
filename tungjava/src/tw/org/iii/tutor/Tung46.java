package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Tung46 {

	public static void main(String[] args) {
		// 串流Stream (讀檔)
		try {
			FileInputStream fin = new FileInputStream("dir1/file1");  // 創建串流的管子
			
			// 讀檔、讀資料內容(此方法先了解概念)
//			int c1 = fin.read();
//			System.out.println((char)c1);
//			int c2 = fin.read();
//			System.out.println((char)c2);
			
			// 讀檔、讀資料內容
			int c;
			while( (c = fin.read()) != -1) {
				System.out.print((char)c);
			} 
			
			fin.close();
			// System.out.println("ok");  // 如果印出ok代表前面都沒出現例外
		} catch (Exception e) {
			System.out.println(e.toString());
		} 

	}

}
