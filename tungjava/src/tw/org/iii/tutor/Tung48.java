package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Tung48 {

	public static void main(String[] args) {
		// 寫檔案
		String mesg = "\n123";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file3", true);
			for(int i=0 ; i<=4 ; i++) {
				fout.write(mesg.getBytes());
			}
			fout.flush();
			fout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		// 用rename()可以做剪下貼上
	}

}
