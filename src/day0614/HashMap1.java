package day0614;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// HashMap은 String형이 자동적으로 오버라이딩 되어 있음
		// 제네릭을 사용할때 String을 사용하는데 HashMap은 키와 값의 쌍으로 이루어져 있기 때문에
		// 값의 자료형도 입력해주어야 함. (여기 예제에선 Integer형으로 사용)
		// HashMap은 순서를 지켜주지 않음.
		
		map.put("김그린", 85);
		map.put("이자바", 90);
		map.put("박제이", 68);
		map.put("김그린", 70);
		
		System.out.println("총 학생 수 : " + map.size());
		// 중복되는 값은 포함하지 않음 -> 총 학생 수 3
		
		System.out.println();
		
		// 박제이의 데이터를 출력 ( 값을 가져올 땐 get )
		// 이름(key)으로 점수(value:값) 찾기가 가능
		System.out.println("박제이 : " + map.get("박제이"));
		
		System.out.println();
		
		// HashMap에 저장된 모든 키가 저장된 Set을 반환
		// Map은 키와 값의 쌍이기 때문에 HashMap이 오면 안됨 -> 키의 값만 찾는 것이기 때문에
		// String 타입으로 keySet을 받아서 사용하겠다 라는 의미
		// key를 반환
		Set<String> keySet = map.keySet();
		
		// 키를 이용하여 값 찾아오기 -> Iterator 사용
		Iterator<String> keyIterator = keySet.iterator();
		
		// Iterator를 출력할 땐 보통 while문 사용
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("___________________\n");
		
		// 삭제 -> 삭제할 땐 remove에 key의 값을 넣어야함 
		map.remove("이자바");
		System.out.println("총 학생 수 : " + map.size());
		
		// 객체를 키와 값의 쌍으로 함께 처리하기 -> Set.entrySet 사용
		// Set에 Map.Entry의 제네릭은 키의 값이 String, 값이 Integer 형으로
		// 같이 처리하기 위해 사용
		// Iterator에 저장
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryItrator = entrySet.iterator();
		
		while (entryItrator.hasNext()) {
			Map.Entry<String, Integer> entry = entryItrator.next();
			// 키와 값을 같이 가지고 옴
			String key = entry.getKey();		// 키를 가지고 오는 코드
			Integer value = entry.getValue();	// 값을 가지고 오는 코드
			System.out.println(key + " : " + value );
		}
		
		System.out.println("___________________\n");
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 학생 수 : " + map.size());
		
	}

}
