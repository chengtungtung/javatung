package tw.org.iii.tutor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.classes.Student;

public class Tung53 {

	public static void main(String[] args) {
		// 物件序列化(在序列化屬性)
		Student s1 =new Student(45, 32, 56 , "Tung");
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		System.out.println(s1.getName());
		
		try (FileOutputStream fout = new FileOutputStream("dir1/student.s1"); // 可自動關閉語法(可以不用寫close()，但try裡面要是可自動關閉的物件)
				ObjectOutputStream oout = new ObjectOutputStream(fout);) {
			oout.writeObject(s1);
			oout.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
