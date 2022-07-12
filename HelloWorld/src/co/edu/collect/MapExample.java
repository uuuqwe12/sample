package co.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 이름, 점수 => map저장.
 * 김민수, 80/ 황현익, 75/ 이현승, 88
 * Scanner 클래스 입력 -> 학생이름 입력 -> 점수 반환.
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<String, Integer>();

		students.put("김민수", 80);
		students.put("황현익", 75);
		students.put("이현승", 88);

		// 출력결과:
		// 평균점수: 81
		// 최고점수: 88, 최고 점수 학생의 이름: 이현승

		int avg = 0;
		int sum = 0;
		int max = 0;
		int arraysize = students.size();

		sum = students.get("김민수") + students.get("황현익") + students.get("이현승");
		avg = sum / students.size();
		System.out.println("평균점수: " + avg);

		Set<Map.Entry<String, Integer>> ent = students.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = ent.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();

			for (int i = 0; i < students.size(); i++) {
				if (max < entry.getValue()) {
					max = entry.getValue();
				}
			}

		}
		System.out.println("최고점수: " + max);


	}
}
