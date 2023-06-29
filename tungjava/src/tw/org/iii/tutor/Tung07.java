package tw.org.iii.tutor;

import java.util.Scanner;

public class Tung07 {

	public static void main(String[] args) {
		// if 判斷式
//		int score = 70;
//		if (score >= 60) {
//			System.out.println("pass");
//		}else {
//			System.out.println("down");
//		}
//		System.out.println("Gameover");
		
		// 亂數(java.lang.math)
//		double temp = Math.random(); // random 從0.0~1.0 亂數取一個為double的數
//		System.out.println(temp);
		
		// 想從0~100亂數取一個數
//		double temp1 = Math.random();
//		int score = (int)(temp1*101); // (0.0~1.0)*101=(0.0~101.0)強制轉換為int，所以只會取0~100，會有101個數
//		System.out.println(score);
		
		// 想從0~100亂數取一個數，並看有沒有及格
//		double temp2 = Math.random();
//		int score1 = (int)(temp2*101);
//		System.out.println(score1);
//		
//		if (score1 >= 60) {
//			System.out.println("pass");
//		}else {
//			System.out.println("down");
//		}
//		System.out.println("Gameover");
		
		// 擲骰子1~6亂數取1
//		double temp3 = Math.random();
//		int score2 = (int)(temp3*6) +1; // +1 代表往右位移，不是運算+1
//		temp3*6 是從0~5取亂數，但目的是希望1~6，所以要位移1
//		System.out.println(score2);
		
		
		// 90分以上印出A，80分以上印出B，70分以上印出C，60分以上印出D，其餘印出E
//		double temp1 = Math.random();
//		int score = (int)(temp1*101);
//		System.out.println(score);
//		
//		if (score >= 90) {
//			System.out.println("你的成績為 "+ score + " ，級別：A");
//		}else {
//			if(score >= 80) {
//				System.out.println("你的成績為 "+ score + " ，級別：B");
//			}else {
//				if(score >= 70){
//					System.out.println("你的成績為 "+ score + " ，級別：C");
//				}else{
//					if(score >= 60){
//						System.out.println("你的成績為 "+ score + " ，級別：D");
//					}else {
//						System.out.println("你的成績為 "+ score + " ，級別：E");
//					}
//				}
//			}
//		}
		
		// 精簡程式 (延伸出 else if)
//		if (score >= 90) {
//			System.out.println("你的成績為 "+ score + " ，級別：A");
//		}else if(score >= 80) {
//			System.out.println("你的成績為 "+ score + " ，級別：B");
//		}else if(score >= 70){
//			System.out.println("你的成績為 "+ score + " ，級別：C");
//		}else if(score >= 60){
//			System.out.println("你的成績為 "+ score + " ，級別：D");
//		}else {
//			System.out.println("你的成績為 "+ score + " ，級別：E");
//		}
		
		// format應用
		int score = 45;
		if (score >= 90) {
			System.out.printf("你的成績為 %d，級別：A", score);
		}else if(score >= 80) {
			System.out.printf("你的成績為 %d，級別：B", score);
		}else if(score >= 70){
			System.out.printf("你的成績為 %d，級別：C", score);
		}else if(score >= 60){
			System.out.printf("你的成績為 %d，級別：D", score);
		}else {
			System.out.printf("你的成績為 %d，級別：E", score);
		}
		
		// ctrl + shift + F -> 縮排快捷鍵
		
		

	}

}
