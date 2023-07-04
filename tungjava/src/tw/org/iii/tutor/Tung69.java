package tw.org.iii.tutor;

import tw.org.iii.classes.BCrypt;

public class Tung69 {

	public static void main(String[] args) {
		// 加密
		String passwd = "123456";
		String hashPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hashPasswd);
		
		String passwd2 = "123456";
		if (BCrypt.checkpw(passwd2, hashPasswd)) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}
		
		System.out.println(hashPasswd.length());
	}

}
