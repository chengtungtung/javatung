package tw.org.iii.tutor;

import tw.org.iii.classes.TWID;

public class Tung32 {

	public static void main(String[] args) {
		// StringBuffer特性運用
		StringBuffer sb = new StringBuffer();  // new出新物件StringBuffer，記憶體已預留了16個字元的位置
		sb.append("abcdefg");    // append方法會將字串填入，從api可以看到會回傳StringBuffer回來
		System.out.println(sb);
		/*
		印出：
		abcdefg
		 */
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("abcdefg").append("ok").append("xx");   // 由於使用append方法會回傳StringBuffer，而StringBuffer是物件，所以sb1.append("abcdefg")就是個物件，所以後面可以接.append，繼續呼叫方法
		System.out.println(sb1);
		/*
		印出：
		abcdefgokxx
		 */
		
		
	}

}
