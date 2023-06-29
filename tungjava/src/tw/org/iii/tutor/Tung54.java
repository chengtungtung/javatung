package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import tw.org.iii.classes.Student;

public class Tung54 {

	public static void main(String[] args) {
		// 解序列化 = > 還原物件
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/student.s1"));
			Object obj = oin.readObject();  // 傳回object 
			if (obj instanceof Student) {   // 判斷obj是否是Student
				System.out.println("ok");
			}

			Student s1 = (Student) obj;  // 強制轉型
			System.out.println(s1.getName());
			System.out.println(s1.sum());
			System.out.println(s1.avg());
			

			oin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
