package tw.org.iii.tutor;

public class TungPokerV1 {

	public static void main(String[] args) {
//		long start =System.currentTimeMillis();
//		System.out.println(start);
		
		// 1.洗牌
		int[] poker = new int[52]; // 宣告int陣列，可以放入52個值(index為1~51，預設值皆為0)
		for (int i=0; i<poker.length; i++) { // 迴圈會跑52次
			int temp = (int)(Math.random()*52);  // 從0~51亂數取一個值
			
			
			//檢查機制
			boolean isRepeat = false;
			for (int j=0 ; j<i ; j++) {
				if(poker[j] == temp) {
					//重複了
					isRepeat = true;
					break;
				}
			}
			
			if(!isRepeat) {
				poker[i] = temp;
				System.out.print(poker[i]+" ");
			}else {
				i--;
			}
			
		}
		System.out.println();
		System.out.println(poker[0]);
		System.out.println(poker[51]);
//		long end =System.currentTimeMillis();
//		System.out.println(end);
//		System.out.println(end - start);
		
		// 2.發牌
		
		// 3.攤牌 + 理牌

	}

}
