package tw.org.iii.tutor;

public class Tung01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 單行註解
		/*
		 * 多行註解
		 */
		/**
		 * 不是註解，是java doc
		 */
		// java是強型別語言(規定很嚴格)，型別一開始要定義好
		// 型別分為 1.基本 2. 物件
		/*基本：1.整數 byte,short,int,long
		       2.浮點 
		       3.布林
		       4.字元
		*/
		//紅色字為關鍵字，都會是小寫
		
		byte var1;
		var1 = 123;
		System.out.println(var1);
		
		/*
		byte var2; // var2為區域變數
		System.out.println(var2);
		錯誤訊息：The local variable var2 may not have been initialized
		區域變數var並未初始化(初始化的意思是沒有給值)
		*/
		
		/*
		byte var2 = 128;
		System.out.println(var2);
		錯誤訊息：Type mismatch: cannot convert from int to byte
		型別不匹配，無法從 int 轉換為 byte(因為128超過byte)	
		 */
		
		/*
		變數命名規則：
	 	[a-zA-Z$_][a-zA-Z0-9$_]*
	 	盡量不要用$或_
	 	可以用中文，因為JAVA支持UNICODE
		
		short $$$ = 100;
		System.out.println($$$);
		short 變數1 = 10000;
		System.out.println(變數1);
		 */
		
		
	
	
	}

}
