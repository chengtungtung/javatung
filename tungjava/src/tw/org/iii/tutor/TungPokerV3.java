package tw.org.iii.tutor;

import java.util.Arrays;

public class TungPokerV3 {

	public static void main(String[] args) {
		// 洗牌
		int num = 52;
		int[] poker = new int[num];
		for(int i = 0 ; i<poker.length ; i++) poker[i]=i;
		
		for(int i = num - 1 ; i > 0 ; i--) { // 原本num=6，所以跑 54321
			int rand = (int)(Math.random()*(i+1)); // 跑亂數
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;	
		}
		
//		for(int v : poker) System.out.println(v); // 交換後，驗證一下有沒有真的洗牌
//		System.out.println("------------------------------");
		
		// 發牌
		int[][] players = new int[4][13];
		for(int i=0; i < poker.length;i++) {
			// players[?][?] = poker[i]
			players[i%4][i/4] = poker[i];
		}
//		for(int card :players[0]) {
//			System.out.println(card);
//		}
		
		// 攤牌 
				
//		for(int[] player:players) {
//			for(int card:player) {
//				
//				System.out.print(card + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("------------------------------");
		
		// 加入花色數字(事先定義)
//		String[] colors = {"黑桃","紅心","方塊","梅花"};
//		String[] values= {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","J ","Q ","K "};
//		
//		for(int[] player:players) {
//			for(int card:player) {
//				System.out.printf("%s%s ",colors[card/13],values[card%13]);
//			}
//			System.out.println();
//		}
		
		
		// 理牌 (api -> java.util -> arrays -> sort)
		String[] colors = {"黑桃","紅心","方塊","梅花"};
		String[] values= {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","J ","Q ","K "};
		
		for(int[] player:players) {
			Arrays.sort(player);   // 進行排序
			for(int card:player) {
				System.out.printf("%s%s ",colors[card/13],values[card%13]);
			}
			System.out.println();
		}
		
		// 相同數字放在一起
		
		
	}

}
