package tw.org.iii.tutor;

import tw.org.iii.classes.TWID;
import tw.org.iii.classes.TWId1;

public class TWId1Test {

	public static void main(String[] args) {
		// 在做TWId1的執行驗證測試
		
		// 測試Character.isLetter()能否使用
		// 方法一
//		System.out.println(TWId1.isValidTWId("+123456789"));
		
		// 方法二
//		String idtest = "E100000005";
//		if (TWId1.isValidTWId(idtest)) {
//			System.out.println("ok");
//		}else {
//			System.out.println("xx");
//		}
//		System.out.println("---------------------");
		
		// 測試 .substring(, )
//		String c2nds = "1289";
//		String c2nd = id.substring(1, 2);
//		if(c2nds.indexOf(c2nd)>=0) {
//			System.out.println("ok");
//		}else {
//			System.out.println("xx");
//		}
		
		// 測試
//		boolean ret = false;
//		String numbers = "0123456789";
//		for(int i=2 ; i<=9 ; i++) {
//			if(numbers.indexOf(id.charAt(i))>=0) {
//				ret = true;
//			}else {
//				ret = false;
//				break;
//			}
//			System.out.println(i + "," + ret);
//		}
//		System.out.println("-----------------");
//		System.out.println(ret);
		
		// 最終測試(可以亂數得到身分證字號)
		
		TWId1 id1 = new TWId1();
		System.out.printf("ID1：%s\n", id1.getId());
		TWId1 id2 = new TWId1(false);
		System.out.printf("ID2：%s\n", id2.getId());
		TWId1 id3 = new TWId1(4);
		System.out.printf("ID3：%s\n", id3.getId());
		TWId1 id4 = new TWId1(true, 7);
		System.out.printf("ID4：%s\n", id4.getId());
	
		
	}

}
