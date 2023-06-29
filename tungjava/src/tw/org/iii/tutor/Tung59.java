package tw.org.iii.tutor;

import java.util.HashMap;
import java.util.Set;

public class Tung59 {

	public static void main(String[] args) {
		// Map<K,V> (K和V是泛型，所以都是物件；K代表key，key值不能重複，V代表value，value值能重複)
		// 類似python的字典概念
		HashMap<String, Object> person = new HashMap<>();
		person.put("name", "Tung");
		person.put("gender", true);
		person.put("age", 18);
		person.put("weight", 80.123);
		System.out.println(person.get("age"));
		System.out.println(person.keySet());
		System.out.println(person.size());
		
		Set<String> keys = person.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + person.get(key));
		}
	}

}
