package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tung57 {

	public static void main(String[] args) {
		// 樂透(Set應用)
		Set<Integer> lottery = new TreeSet<>();  // TreeSet有排序
		System.out.println(lottery.size());
		while(lottery.size() <6) {
			lottery.add((int)(Math.random()*49+1));
		}
		System.out.println(lottery.size());
		System.out.println(lottery);
		
		// 尋訪(跌代方式)
//		Iterator<Integer> it = lottery.iterator();
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
		// 尋訪(foreach方式)  for(元素:可跌代的物件)
		for(Integer v : lottery) {
			System.out.println(v);
		}
	}

}
