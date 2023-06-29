package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import tw.org.iii.classes.Bike;

public class Tung56 {

	public static void main(String[] args) {
		// Collection<E> (E代表元素，就是物件)
		// Collection的子介面有List和Set
		// List： 1. 物件可重複  2. 有順序性
		// Set：1. 物件不可重複 2. 沒有順序性
		
		// Set
		Set set = new HashSet();
		Bike b1 = new Bike();
		set.add(123);
		set.add(12.3);
		set.add(true);
		set.add("Tung");
		set.add("Tung");
		set.add(123);
		set.add(b1);
		System.out.println(set.add(123));
		System.out.println(set.size());
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
