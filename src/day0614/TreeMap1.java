package day0614;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		// TreeMap과 HashMap의 차이점을 알아보자
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
//		Map map = new TreeMap(); -> 이렇게 사용가능 (다형성)
				
		map.put(5, "value");
		map.put(59, "value");
		map.put(3535, "value");
		map.put(7, "value");
		map.put(10, "value");
		map.put(26, "value");
		map.put(77, "value");
		map.put(75, "value");
		map.put(15238, "value");
		map.put(2, "value");
		map.put(157, "value");
		
		map1.put(5, "value");
		map1.put(59, "value");
		map1.put(3535, "value");
		map1.put(7, "value");
		map1.put(10, "value");
		map1.put(26, "value");
		map1.put(77, "value");
		map1.put(75, "value");
		map1.put(15238, "value");
		map1.put(2, "value");
		map1.put(157, "value");
		
		// 키에 대한 내용을 출력 -> keySet()
		// TreeMap은 자동정렬해서 출력. / HashMap은 자동정렬되지 않고 출력 (x)

		System.out.println(map.keySet());	// TreeMap
		System.out.println(map1.keySet());	// HashMap
		

	}

}
