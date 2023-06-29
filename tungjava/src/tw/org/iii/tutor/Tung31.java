package tw.org.iii.tutor;

public class Tung31 {

	public static void main(String[] args) {
		// String字串的方法應用
		// 字串物件一產生，字串內容不會變
		String s1 = "Tung";
		String s4 = s1;
		System.out.println(s1 == s4);
		String s2 = s1.concat("iii");  // 此時此刻有兩個字串物件，一個是s1，一個是s2 // concat方法是在物件後面增加東西
		System.out.println(s1);
		System.out.println(s2);
		/*
		印出：
		true        // 兩物件為相同物件實體，代表記憶體位置相同
		Tung        // 可看出s1沒有變，因為字串一產生，字串內容不會變
        Tungiii     
		 */
		
		s1.replace('u', 'k');  // replace代表是置換，參數要填入字元，會將原字串"Tung"的字元'u'換成字元'k'
		System.out.println(s1);
		String s3 = s1.replace('u', 'k');
		System.out.println(s3);
		/*
		印出：
		Tung      // 字串內容不會變，所以s1印出來還是維持"Tung"，但已經換完做return的動作了
		Tkng      // 所以已經return字串回來，放進變數s3，再將s3印出來，就會置換了
		 */
		
		s1 = "kkk";
		System.out.println(s1);
		/*
		印出：
		kkk   // s1的原字串"Tung"變成"kkk"，是因為重新指向，記憶體有個新位置"kkk"，然後重新指向s1，所以"Tung"裡的內容還是沒變，還是留在記憶體
		 */
		
		s1 += "ok";  // 字串相加，已經不是原記憶體"kkk"的位置，而是重新產生一個新記憶體位置"kkkok"，然後再重新指向s1
		System.out.println(s1);
		/*
		印出：
		kkkok
		 */
		
		System.out.println(s1 == s4);
		/*
		印出；
		false   // s4還是一樣指向"Tung"的記憶體位置，但s1已經指向"kkkok"的記憶體位置，所以會不一樣
		 */
	}

}
