package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Tung55 {

	public static void main(String[] args) {
		// 
		Tung553 obj = new Tung553();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/test"));
			oout.writeObject(obj);
			oout.flush();oout.close();
			System.out.println("---------------");
			ObjectInputStream ooin = new ObjectInputStream(new FileInputStream("dir1/test"));
			Object obj1 = ooin.readObject();
			ooin.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class Tung551{
	Tung551(){
		System.out.println("Tung551()");
	}
}

class Tung552 extends Tung551 {
	Tung552(){
		System.out.println("Tung552()");
	}
}

class Tung553 extends Tung552 implements Serializable{
	Tung553(){
		System.out.println("Tung553()");
	}
}