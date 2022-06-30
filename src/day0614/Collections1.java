package day0614;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {
		
		// Collections 복습
		
		// Collections를 다룰 땐 보통 List를 사용
		List list = new ArrayList();
		System.out.println(list);
		
		// list에 값을 알아서 넣어줌
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		// 오른쪽으로 숫자만큼 이동함
		// rotate() : list의 값을 오른쪽으로 2칸씩 이동함
		// 크기만큼 이동했으면 뒤의 숫자들은 앞으로 위치함
		Collections.rotate(list, 2);
		System.out.println(list);
		
		// i번째와 j번째의 값을 교환
		// 0번째 인덱스와 2번째 인덱스를 교환
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		// 임의의 순서로 섞기
		// list의 내용을 섞음 -> 실행이 될 때마다 순서가 섞임
		Collections.shuffle(list);
		System.out.println(list);
		
		// 순서 정렬 (기본적으로 '오름차순' 정렬)
		Collections.sort(list);
		System.out.println(list);
		
		// 정렬기준의 반대로 작성하는 방법 1 (sort의 반대로 정렬)
		// 오른차순 정렬을 '내림차순'으로 출력
		Collections.reverse(list);
		System.out.println(list);
		
		// 정렬 기준의 반대로 작성하는 방법 2
		// 정렬과 동시에 '내림차순'으로 출력
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		// 내가 찾고자하는 값의 위치 찾기
		// list의 값들 중 숫자 3이 어느 위치에 있는지 찾는 코드
		// binarySearch : 지정된 값이 저장된 위치(index) 반환
		// -> binarySearch를 사용하려면 '반드시 정렬'이 되어 있어야함.
		// 그렇지 않으면 값이 이상하게 나옴
		int idx = Collections.binarySearch(list, 3);
		System.out.println(idx + "번째 인덱스에 위치"); // -> 2번째 인덱스에 위치
		
		// 최댓값과 최소값 (Collections.max, Collections.min)
		System.out.println("max : " + Collections.max(list));
		System.out.println("min : " + Collections.min(list));
		
		// 먼저 최댓값을 출력하고 , 뒤에 Collections.reverseOrder()를 사용하면
		// 결과값을 뒤집어줌 (결과값이 반대로 출력됨)
		System.out.println("min : " + Collections.max(list, Collections.reverseOrder()));
		
		// list를 해당 값으로 모두 채우기
		// list의 크기에 모두 9로 채우기
		Collections.fill(list, 9);
		System.out.println(list);
		
		// list와 같은 크기의 새로운 list를 생성하고 해당 값으로 채우기
		// 새로운 객체 = newList의 값을 기존의 list의 크기 (=size)와 같은 객체를 만들어
		// 그 객체의 값을 8로 집어넣기
		List newList = Collections.nCopies(list.size(), 8);
		System.out.println("newList : " + newList);
		
		// Collections.nCopies를 이용하여 생성된 결과는 변경 불가능
		// -> 따라서 밑의 코드를 실행하면 에러발생
		// Collections.fill(newList, 2);
		// System.out.println("newList : " + newList);
		
		// 두 list의 공통 요소가 없으면 true로 출력되고 공통 요소가 있으면 false로 출력됨
		System.out.println(Collections.disjoint(list, newList));
		
		// newList의 내용을 list에 복사 (newList의 값 8이 list에 복사하는 코드)
		Collections.copy(list, newList);
		System.out.println("list : " + list);
		System.out.println("newList : " + newList);
		
		// list 기존의 값 8을 전부 1로 변경하는 코드
		Collections.replaceAll(list, 8, 1);
		System.out.println(list);
		
		// 객체에 접근하기 위해 Enumeration 생성 
		// Enumeration는 Iterator와 같다고 생각
		Enumeration e = Collections.enumeration(list);
		ArrayList list2 = Collections.list(e);
		System.out.println("list2 : " + list2);
	}
}