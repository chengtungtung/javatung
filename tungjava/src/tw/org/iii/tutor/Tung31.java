package tw.org.iii.tutor;

public class Tung31 {

	public static void main(String[] args) {
		// 字串物件一產生，字串內容不會變
		String s1 = "Tung";
		String s4 =s1;
		System.out.println(s1 == s4);
		String s2 = s1.concat("iii");
		System.out.println(s1);
		System.out.println(s2);
		s1.replace('u', 'k');
		System.out.println(s1);
		String s3 =s1.replace('u', 'k');
		System.out.println(s3);
		s1 = "kkk";
		System.out.println(s1);
		s1 += "ok";
		System.out.println(s1);
		System.out.println(s1 == s4);
	}

}
