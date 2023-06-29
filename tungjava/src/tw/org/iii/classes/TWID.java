package tw.org.iii.classes;

public class TWID {
	// 設計屬性
	private String id; // 不能任意存取，一個string的屬性叫id，此id是指屬性
	private final static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	public TWID() {
		this((int)Math.random()*2==0?true:false);
	}
	
	public TWID(boolean isMale) {
		this(isMale,(int)(Math.random()*26));
	}
	
	public TWID(int area) {
		this((int)(Math.random()*2)==0?true:false , area);
	}
	
	public TWID(boolean isMale, int area) {
		// area => 0 ~ 25
		// 第一碼
		String c1=letters.substring(area, area+1);
		StringBuffer sb = new StringBuffer(c1);
		// 第二碼
		sb.append(isMale?"1":"2");
		// 第三碼到第九碼
		for(int i=0; i<7 ; i++) {
			sb.append((int)(Math.random()*10));
			//System.out.println(sb);
		}
		// 第十碼
		for(int i=0; i<10;i++) {
			if (isRightID(sb.toString()+i)) {
				id = sb.toString()+i;
				break;
			}
		}
	}
	
	public String getid() {
		return id ;
	}
	
	
	// 建構式
	private TWID(String id){  // 此id是指變數 
		this.id = id;  // this是指那個物件
	}
	
	public static TWID newTWID(String id) {     // static方法，不需要物件，類別名稱.newTWID(String id)參數打進去，就可以呼叫 
		if(isRightID(id)) {
			return new TWID(id);
			
		}else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return id;
	}
	
	/*
	 身份證字號規則：
	 1. 共10碼 
	 2. 字首為大寫英文 
	 3. 第二碼為1或2 
	 4.第三碼到第十碼皆為0~9
	*/
		
	
	// 設計方法(身分證是否合理)
	public static boolean isRightID(String id) {  // 此id為區域變數，是參數傳遞  // static代表與物件無關
		//System.out.println("isRightID(String id)");
		boolean isRight = false;
		//String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO"; // 照驗證規則的轉換數值來排序 10,11,...,35
		String numbers ="0123456789";
		
		// 先看格式有無正確
		// 一條一條判斷
		if(id.length() == 10) {   // 判斷是否有10碼                                                                                                                        
			if(letters.indexOf(id.charAt(0)) >=0) {  // 判斷字首是否為大寫英文
				if(id.charAt(1) == '1' || id.charAt(1) == '2') {  // 判斷第二碼是否為1或2
					// 第三碼到第十碼皆為數字，怎麼判斷
					for(int i=2 ; i<=9 ; i++){
						if(numbers.indexOf(id.charAt(i)) >=0) {						
							isRight = true;
							
						}else {
							isRight = false;
							break;
						}					
					}		            					
				}
			}
		}
		if(isRight) {
			// 先處理字首，轉換成數值
			char c1 = id.charAt(0);
			int a12 = letters.indexOf(c1) + 10;
			int a1 = a12 / 10;
			int a2 = a12 % 10;
			
			// 處理第二碼到第十碼
			String s1 = id.substring(1,2);
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(id.substring(2,3));
			int n3 = Integer.parseInt(id.substring(3,4));
			int n4 = Integer.parseInt(id.substring(4,5));
			int n5 = Integer.parseInt(id.substring(5,6));
			int n6 = Integer.parseInt(id.substring(6,7));
			int n7 = Integer.parseInt(id.substring(7,8));
			int n8 = Integer.parseInt(id.substring(8,9));
			int n9 = Integer.parseInt(id.substring(9,10));
			
			int sum = a1*1 + a2*9 + n1*8 + n2*7 + n3*6 + n4*5 
					+ n5*4 + n6*3 + n7*2 + n8*1 + n9*1;
			isRight = sum % 10 == 0;  //  isRight = (sum % 10 == 0);	
		}			
	
		
		// 用正規表示法判斷
//		if (id.matches("[A-Z][12][0-9]{8}")) {  // 先判斷格式有無正確
//			// 先處理字首，轉換成數值
//			char c1 = id.charAt(0);
//			int a12 = letters.indexOf(c1) + 10;
//			int a1 = a12 / 10;
//			int a2 = a12 % 10;
//			
//			// 處理第二碼到第十碼
//			String s1 = id.substring(1,2);
//			int n1 = Integer.parseInt(s1);
//			int n2 = Integer.parseInt(id.substring(2,3));
//			int n3 = Integer.parseInt(id.substring(3,4));
//			int n4 = Integer.parseInt(id.substring(4,5));
//			int n5 = Integer.parseInt(id.substring(5,6));
//			int n6 = Integer.parseInt(id.substring(6,7));
//			int n7 = Integer.parseInt(id.substring(7,8));
//			int n8 = Integer.parseInt(id.substring(8,9));
//			int n9 = Integer.parseInt(id.substring(9,10));
//			
//			int sum = a1*1 + a2*9 + n1*8 + n2*7 + n3*6 + n4*5 
//					+ n5*4 + n6*3 + n7*2 + n8*1 + n9*1;
//			isRight = sum % 10 == 0;  //  isRight = (sum % 10 == 0); 
//		}
		
		
		return isRight;			
	}
}
