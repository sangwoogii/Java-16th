package day0614;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable1 {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");	// id와 pw 값 추가
		map.put("summer", "123");
//		System.out.println(map);
		
		map.put("summer", "1234");
//		System.out.println(map);
		// summer의 pw가 덮어쓰게된다. String 객체는 알아서 오버라이딩 됨
		
		map.put("winter", "12345");
//		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) { // 로그인하기 위한 while문
			// 아이디와 비밀번호를 입력받아
			// 아이디와 비밀번호가 일치하면 "로그인 완료" 출력
			// 아이디가 존재하지 않으면 "아이디 오류" 출력
			// 비밀번호가 일치하지 않으면 "비밀번호 오류" 출력
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 입력 > ");
			String id = scan.nextLine();
			System.out.print("비밀번호 입력 > ");
			String pw = scan.nextLine();
			
			if (map.containsKey(id)) { // 아이디가 맞을 때
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호 오류");
				}
				
			} else { // 아이디가 맞지 않을 때
				System.out.println("아이디 오류");
			}
			
			
		}
	}

}
