package tw.org.iii.tutor;

import tw.org.iii.classes.Bike;
import tw.org.iii.classes.Scooter;

public class Tung27 {

	public static void main(String[] args) {
		// 值的比較
		Object obj = new Object();  // 物件的肚子裡是裝記憶體位置，而基本型別的肚子裡是裝值
		String s1 = new String("Tung"); // 會產生兩個物件，一個是s1，一個是"Tung"
		String s2 = new String("Tung");
		System.out.println(s1);  // 如果是要印基本型別就會直接印出值，但現在是要印出變數s1所以要印出物件型別，就會印出此物件的tostring
		System.out.println(obj);
		/*
		印出：
		Tung
		java.lang.Object@372f7a8d
		 */
		
		Scooter s3 = new Scooter();
		System.out.println(s3);  // 繼承Bike的覆寫，所以tostring也改寫
		/*
		印出：
		Bike()
		My speed is0.0
		 */
		
		System.out.println("--------------------------");
		System.out.println(s1 == s2); // 因為是兩個新物件，所以會是不一樣
		/*
		印出：
		false
		 */
		
		// 但如果想知道s1和s2裡的字串內容有沒有一樣
		// object的equals也是在看兩物件(記憶體位置)有沒有一樣，string的equals改寫成在看兩字串內容有沒有一樣
		System.out.println(s1.equals(s2));
		/*
		印出：
		true
		 */
		
		//--------------------------------------------------------------------------------
		
		System.out.println("---------------------------------");
		Tung271 obj1 = new Tung271(); // 由於Tung271沒有建構式，所以跟父類別object拿無傳參數的建構式
		Tung271 obj2 = new Tung271();
		if (obj1.equals(obj2)) { 
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		System.out.println("obj1記憶體位置； " + obj1);
		System.out.println("obj2記憶體位置； " + obj2);
		/*
		印出：
		false   // obj1是new出一個新物件，obj2也是new出一個新物件，所以不會一樣，記憶體位置不一樣
		obj1記憶體位置； tw.org.iii.tutor.Tung271@7cc355be
		obj2記憶體位置； tw.org.iii.tutor.Tung271@6e8cf4c6
		 */
		
		Tung271 obj3 = obj1; // 由obj1指派給obj3
		if (obj1.equals(obj3)) { 
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		System.out.println("obj1記憶體位置； " + obj1);
		System.out.println("obj3記憶體位置； " + obj3);
		/*
		印出：
		true   //  由obj1指派給obj3，所以記憶體位置一樣，同一個物件實體的意思
		obj1記憶體位置； tw.org.iii.tutor.Tung271@7cc355be
		obj3記憶體位置； tw.org.iii.tutor.Tung271@7cc355be
		 */
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		/*
		印出：
		false
		true
		 */
		
		/*
		object裡的equals跟==是一樣意思，都是去比肚子裡的東西有沒有一樣 
		 */
		
		System.out.println("---------------------------");
		// 字串的==和.equals的比較
		String a1 = "Tung";  // ""出來後，會在記憶體自動創一個"Tung"的位置
		String a2 = "Tung";  // 由於a1和a2的"Tung"是一樣的，所以記憶體不會再創一個新的位置(有點像自動)
		String a3 = new String("Tung");  // 而有new代表是另外new的物件(有點像手動)
		String a4 = new String("Tung");
		int n1 = 3;
		int n2 = 4;
		
		// == (比記憶體位置是否相同)
		System.out.println(a1 == a2); 
		System.out.println(n1 == n2);
		System.out.println("aaa" == "aaa");
		System.out.println(a1 == a3);
		/*
		印出：
		true    // 當==時，左右兩邊如果是物件(a1、a2)，那就是在比記憶體位置
		false   // 那如果左右邊是int之類的，那就是比值
		true
		false   // 由於a3是另外new出來的物件，所以記憶體位置會不同
		 */
		
		// 任何物件肚子裡裝的，都是物件在記憶體的位置
		// 而a1、a2、a3、a4當中，有幾個物件實體？
		// ans： 3個 (因為a1和a2是同一個)
		
		// .equals (比字串內容是否相同)
		System.out.println("------------");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a3.equals(a4));
		/*
		印出：
		true
		true
		true
		 */
		
		// StringBuffer的==和.equals的比較
		System.out.println("-------------");
		StringBuffer sb1 = new StringBuffer("Tung");
		StringBuffer sb2 = new StringBuffer("Tung");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		/*
		印出：
		false  // ==一樣是在比記憶體位置，而兩個都另外new出新物件，當然記憶體位置會不同
		false  // 而StringBuffer的equals沒有像String的equals一樣有覆寫方法，所以就維持object的equals，一樣是在比記憶體位置
		 */
		
		// 但是萬一！！想StringBuffer的內容是否相同，那就要用toString方法轉成字串，再用equals去比較，去看字串內容是否相同
		
		// 
		System.out.println("---------------");
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1);
		System.out.println(b1.toString());
		System.out.println(sb1.toString());
		/*
		在還沒覆寫bike的tostring，會印出：
		tw.org.iii.classes.Bike@54bedef2
		tw.org.iii.classes.Bike@54bedef2
		Tung
		 */
		/*
		覆寫bike的tostring，會印出：
		My speed is0.0
		My speed is0.0
		Tung
		 */
		
		
	}

}

class Tung271{
	
}