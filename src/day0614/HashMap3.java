package day0614;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {

	public static void main(String[] args) {
		
//		1. HashMap 생성
//
//		2. 반복문을 이용하여 data에 저장되어 있는 내용을 하나씩 비교함
//		   HashMap에 이미 있는 내용이면 value값을 1씩 증가시키고
//		   없는 값이면 새로 생성한다.
//
//		3. 생성한 HashMap의 내용을 확인하고 출력하기 위해
//		   HashMap에 저장된 내용을 하나씩 분리하고
//		   내용이 있는 만큼 반복하도록 한다.(entrySet(), iterator() 사용)
//
//		4. iterator()를 이용하여 값이 있는 동안에
//		   2에서 계산한 횟수만큼 '#' 기회가 반복하도록 설정하고
//		   반복이 끝나면마지막에 결과값 숫자를 표시한다.
//		   ('#'기호가 출력되는 메서드 생성)
		
		// String타입에 있는 길이만큼 반복
		
		
		// Map.Entry : 'key - value' 쌍으로 된 데이터를 꺼낼 때 사용
		String [] data = {"A", "B", "A", "C", "D", "E", "C", "C", "E", "A", "C", "E"};
		
		HashMap map = new HashMap();	// HashMap 생성
		
		// String (문자열) 배열이기 때문에 for문 사용
		for (int i=0; i<data.length; i++) {
			// containsKey : 지정된 key가 포함되어 있는지 확인하여
			// 있으면 true라는 결과값을 반환
			if (map.containsKey(data[i])) {
				int count = (int) map.get(data[i]);
				// map은 객체타입이기 때문에 int는 기본형 -> 형변환을 해주어야함
				map.put(data[i], count+1);
				// map의 자료에 data의 i번쨰 값과 그 i번째의 값을 1씩 더하는 것을 추가한다는 의미
			} else {
				// containsKey의 값이 없으면
				map.put(data[i], 1);
			}
			// HashMap은 키와 값의 쌍으로 이루어져 있기 때문에
			// put으로 값을 추가하려고 할 때도 키와 값 두개 같이 추가해주어야한다.
		}
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		// Map.Entry : Map의 인터페이스의 내부 인터페이스 (Map 안에 존재하는 인터페이스)
		// Map에 저장된 key - value를 다루기 위해 사용
		
		// Map.Entry 인터페이스이기 때문에 메서드를 가지고 있음
		// < Map.Entry의 메서드() >
		// Object getKey() : Entry의 key 객체를 반환 (가지고옴)
		// Object getValue() : Entry의 value 객체를 반환 (가지고옴)
		// Object setValue(Object value) : Entry의 value 지정된 객체로 변경 (설정)
		// boolean equals(Object o) : 동일한 Entry인지 비교
		// int hashCode() : Entry의 해시코드를 반환
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " = " + print('*', value)  + "  " + entry.getValue());
			
		}
		
		// Map에서는 Iterator와 Map.Entry를 같이 사용한다고 생각하면됨

	} // main
	
	
	// "#"을 추가하기 위한 메서드 생성
	// value의 값만큼 "#"을 표시
	public static String print(char ch, int value) {
		char [] bar = new char[value]; 
		// value의 값만큼 char 형태의 배열 생성
		
		for (int i=0; i<bar.length; i++) {
			bar[i] = ch;
		}
		
		// String 타입의 메서드를 생성하면 반드시 return값이 있어야함 -> 기억하기 !
		// char는 기본형 / String은 객체이기 때문에 String으로 객체를 생성한 다음에 사용
		return new String(bar);
		
		
	}

}

