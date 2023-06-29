package tw.org.iii.tutor;

public class Tung02 {

	public static void main(String[] args) {
		/*
		byte var1 = 127;
		byte var21 = var1 + 1;
		錯誤：Type mismatch: cannot convert from int to byte
		(var1為byte,1為int,預設都為int,所以型別錯誤)
		*/
		
		/*
		byte var1 = 12;
		byte var2 = 13;
		byte var21 = var1 + var2;
		錯誤：Type mismatch: cannot convert from int to byte
		(var1 + var2byte要改成int)
		(在Java中，當你使用+運算符來執行兩個byte類型的變數相加時，結果會自動被提升為int類型。
		這是由於在Java中，byte、short和char類型的算術操作會被隱式地提升為int類型。)
		*/
		
		// 強制轉換型別(會有資料溢出的問題，要特別注意)
		byte var1 = 12;
		byte var2 = 13;
		byte var21 =(byte)(var1 + var2);
		System.out.println(var21);
		
		// 資料溢位
		byte var3 = 127;
		byte var4 = 3;
		byte var22 =(byte)(var3 + var4); 
		System.out.println(var22);
		/*
		印出：
		-126  // 127 + 3 - 256 = -126 
		 */
		
		/*
		byte a = 127;
		a = a + 1;
		錯誤：Type mismatch: cannot convert from int to byte
		*/
		
		byte a = 127;
		a += 1;
		System.out.println(a);
		/*
		印出：
		-128
		 */
		
		byte b = 127;
		b++;
		System.out.println(b);
		/*
		印出：
		-128
		 */
		
		String s1 = "tung";
		int s2 = 2;
		System.out.println(s1 + s2);
		
	}

}
