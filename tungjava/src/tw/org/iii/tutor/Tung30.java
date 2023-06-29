package tw.org.iii.tutor;

import tw.org.iii.classes.TWID;

public class Tung30 {

	public static void main(String[] args) {
		// TWID 最終測試
		TWID id1 = new TWID();
		TWID id2 = new TWID(false);
		TWID id3 = new TWID(5); // F
		TWID id4 = new TWID(true,1);  // B
		System.out.println(id1.getid());
		System.out.println(id2.getid());
		System.out.println(id3.getid());
		System.out.println(id4.getid());
		
		System.out.println("-------------------------");
		TWID id = TWID.newTWID("A123456785");  // 可以自行填入身分證字號
		if(id == null) {
			System.out.println("xx");
		}else {
			System.out.println("ok");
		}
		
		System.out.println(id);
	}

}
