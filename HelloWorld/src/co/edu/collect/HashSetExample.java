package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set (인터페이스) => HashSet, TreeSet
 */
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("딸기");
		set.add("수박");
		set.add("딸기"); // 중복값 허용 X
		System.out.println("크기: " + set.size());

		set.remove("딸기");
		System.out.println(set.contains("딸기"));

		if (set.isEmpty()) {
			System.out.println("컬렉션이 비어있음.");
		}

		// 반복요소처리
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		System.out.println("==============");
		// 반복처리.
		iter = set.iterator(); // 반복자를 다시 써줘야 반복 가능.
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		System.out.println("==============");
		// 확장 for.
		for (String val : set) {
			System.out.println(val);
		}
		
	}
}
