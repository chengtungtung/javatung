package tw.org.iii.tutor;

import java.util.LinkedList;

public class Tung58 {

	public static void main(String[] args) {
		// List
		// 元素異動性不大的狀況用arraylist，元素異動性大的時候用linkedlist
		
		LinkedList<String> names = new LinkedList<>();
		names.add(0,"Tung1");
		names.add(0,"Eric2");
		names.add(0,"Peter3");
		names.add(0,"Amy4");
		names.add(0,"Brad5");
		names.add(0,"Tung6");
		System.out.println(names.size());
		System.out.println(names.get(2));
		System.out.println("-----------------");
		for(String name : names ) {
			System.out.println(name);
		}
		
	}

}
