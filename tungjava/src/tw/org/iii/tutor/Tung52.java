package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tung52 {

	public static void main(String[] args) {
		// 串接
		try {
			FileReader reader = new FileReader("dir1/rx.csv");
			BufferedReader breader = new BufferedReader(reader);
			String line,key;
			while((line = breader.readLine()) != null) {
				
				
				try {
					String[] row = line.split(",");
					String[] key1 = row[10].split("、");
//					key = row[10].substring(8, 15);
//					System.out.println(key1[1]);
				if(key1[1].equals("星期二上午看診") ) {
					System.out.printf("%s,%s\n", row[1] , row[3]);
				}
				}catch(ArrayIndexOutOfBoundsException e){
					//System.out.println("xx");
				}
				//System.out.println(row[1]);
				
				//System.out.println(line);
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		
		}
	}

}
