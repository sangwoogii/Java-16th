package day0614;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("김자바", 90);
		map.put("박그린", 85);
		map.put("박그린", 100);
		map.put("이자바", 70);
		map.put("이땡땡", 100);
		// 출력하면 총 학생 수는 4명, 박그린의 점수는 100점으로 출력 (덮어쓰기)
		
		Set set = map.entrySet();
		Iterator it = set.iterator(); // 출력하기 위해 Iterator 사용
		
		while (it.hasNext()) {
			// 키와 값의 쌍을 불러오기 위한 코드 : Map.Entry<K, V>
			// -> 제네릭 자리에는 객체 생성에 제네릭이 있으면 사용가능 없으면 없이 사용 (제네릭 생략 가능)
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		System.out.println();
		
		// 키의 값만 가지고 올때의 코드
		set = map.keySet();
		System.out.println("학생 명단 : " + set);
		
		// 값만 가지고 올때의 코드 -> Collection 사용, 타입 자체가 Collection 이기 때문
		Collection values = map.values();
		it = values.iterator();
		// 위에서 iterator를 한번 사용했기 때문에 새로운 iterator 객체 생성
		
		// 합계를 나타내는 변수 선언
		int total = 0; 
		
		while (it.hasNext()) {
			int score = (int)it.next(); // 왜 형변환 ?
			total += score;
		}
		
		System.out.println("총점 : " + total);
		
		// 평균구하기
//		float avg = total / map.size(); -> 변수에 담아서 사용 가능
		System.out.println("평균 : " + (float)total / map.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최저 점수 : " + Collections.min(values));
	}

}
