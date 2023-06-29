package tw.org.iii.classes;

import javax.print.DocFlavor.STRING;

public class TWId1 {
	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO"; // 加上static是為了要讓static方法也能使用
	
	public TWId1() {
		this((int)Math.random()*2 == 0);
	}
	
	public TWId1(boolean isMale) {
		this(isMale, (int)Math.random()*26);
	}
	
	public TWId1(int area) {
		this((int)Math.random()*2 == 0, area);
	}
	
	public TWId1(boolean isMale, int area) {
		StringBuffer sb = new StringBuffer();
		// 創出一個物件StringBuffer()，由於無傳參數，可以會在記憶體預設16個字的位置，方便之後做填入修改
		/*
		 String areaCode = letters.substring(area, area+1); sb.append(areaCode);
		 再宣告一個字串變數，先從0~25亂數取一個數，再從letters裡面取出對應的英文字母，
		 再使用StringBuffer裡的方法append，填入sb裡面，由於append回傳回來還是一個物件object，所以可以繼續呼叫append方法
		 而這兩行可以用下方寫法簡化
		 */
		sb.append(letters.substring(area, area + 1)) // 字首英文字母
				.append(isMale ? "1" : "2")          // 第二碼
				.append((int)(Math.random() * 10))   // 第三碼
				.append((int)(Math.random() * 10))   // 第四碼
				.append((int)(Math.random() * 10))   // 第五碼
				.append((int)(Math.random() * 10))   // 第六碼
				.append((int)(Math.random() * 10))   // 第七碼
				.append((int)(Math.random() * 10))   // 第八碼
				.append((int)(Math.random() * 10));  // 第九碼
	

		String temp = sb.toString();
		for (int i = 0; i < 10; i++) {
			if (isValidTWId(temp + i)) {
				id = temp + i;
			}
		}
	}
	
	public String getId() {
		return id;
	}
	
	
	
	private TWId1(String id) {
		this.id = id;
	}
	
	public static TWId1 createTWId(String id) {
		TWId1 temp = null;
		if(isValidTWId(id)) {
			temp = new TWId1(id);
		}
		return temp;
	}
	
	
	// 設計方法：是否有效的身分證字號，用布林判斷，因為有static，所以跟物件無關，不用import
	public static boolean isValidTWId(String id) {  // String id代表要丟字串參數，才能驗證是否為有效的身分證字號
		// 開始去想身分證的規則
		/*
		 身份證字號規則：
		 1. 共10碼 
		 2. 字首為大寫英文 
		 3. 第二碼為1、2、8、9 
		 4. 第三碼到第十碼皆為0~9
		*/
		boolean ret = false;  // 宣告布林ret為false，代表預設為false，要經過底下層層關卡，通過變成true，再傳回
		
		// 使用字串方法應用
//		if (id.length() == 10) {   // if判斷是否共10碼
//			char c1 = id.charAt(0);  // 先取id裡的第0個數，放入字元變數c1
//			/*
//			<方法一>
//			String letters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 再宣告一個字串變數letters，將26個字母放進去
//			if (letters.indexOf(c1) >= 0) ret = true;   // if判斷字首是否為英文字母； <方法一> 用letters.indexOf()
//			.indexOf()的參數要int且會傳回int，而c1是字元，但因為字元會自動轉成int，所以可以使用
//			letters.indexOf(c1)是判斷c1在letters的哪個索引值，並回傳索引值，但若c1的字元沒有在letters，則會回傳-1，
//			因此回傳值要>=0，才會是true，然後開始跑if判斷
//			*/
//			if (Character.isLetter(c1)) {   // if判斷字首是否為英文字母； <方法二> 用Character.isLetter()
//				String c2nds = "1289";
//				String c2nd = id.substring(1, 2);  // .substring(1, 2)擷取當中字串，1和2代表剪刀下刀點，所以可以取得第1個字
//				if(c2nds.contains(c2nd)) {     //.contains()代表包含，c2nd有沒有包含在c2nds裡面
//					String numbers = "0123456789";
//					for(int i=2 ; i<=9 ; i++) {  // 用for迴圈去判斷第三碼到第九碼是否為0~9的數字
//						if(numbers.indexOf(id.charAt(i))>=0) {
//							ret = true;
//						}else {
//							ret = false;
//							break;
//						}
//					}
//				} 
//			} 	
//		}
		
		// 利用正規表示法(regex)將上方改寫
		if(id.matches("[A-Z][1289][0-9]{8}")) {
			// 處理字首
			// String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int pos = letters.indexOf(id.charAt(0));
			int n12 = pos + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			
			// 處理第2碼之後
			String s3 = id.substring(1, 2);
			int n3 = Integer.parseInt(s3);
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			
			// 算總和
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 
					+ n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			ret = sum % 10 == 0;
			
		}
			
		return ret;
	}

}
