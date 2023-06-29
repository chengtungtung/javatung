package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Tung47 {

	public static void main(String[] args) {
		// 串流Stream (讀檔)(有中文字)
		File source = new File("dir1/file1");
		try {
			FileInputStream fin = new FileInputStream(source);  // 創建串流的管子
			
			// 讀檔、讀資料內容(此方法先了解概念)
//			int c1 = fin.read();
//			System.out.println((char)c1);
//			int c2 = fin.read();
//			System.out.println((char)c2);
			
			// 讀檔、讀資料內容(有中文字)
			int len; byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			System.out.println(new String(buf));
//			while( (len = fin.read(buf)) != -1) {
//				System.out.print(new String(buf, 0 ,len));
//			} 
			
			fin.close();
			// System.out.println("ok");  // 如果印出ok代表前面都沒出現例外
		} catch (Exception e) {
			System.out.println(e.toString());
		} 

	}

}
