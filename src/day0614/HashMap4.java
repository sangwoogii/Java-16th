package day0614;

import java.util.HashMap;
import java.util.Map;

// HashMap을 클래스를 만들어서 사용해보기

class Student {
	public int no;
	public String name;
	
	public Student() {}
	
	public Student (int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	// 오버라이딩을 사용하는 이유는 ?
	// hashCode와 equals는 꼭 같이 오버라이딩 해야함
	// 클래스에 오버라이딩하기

	@Override
	public int hashCode() {
		// equals에서 두개의 값을 같이 비교를 했기 때문에
		// hashCode에서도 두 개의 값을 비교
		return no + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// 타입을 비교할 땐 instanceof를 먼저 반환가능한지 확인하고 형변환해주기
		// Object 타입의 매개변수 obj가 Student 타입으로 형변환이 가능하다면
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			return (no == stu.no) && (name.equals(stu.name));
			// 숫자는 바로 비교 && 문자는 equals 사용
			// if문안에는 형변환이 가능할 때 이렇게 반환을 하겠다 라는 의미
		} else { // else문 안에는 형변환이 안되었을 때 false로 반환하겠다는 의미
			return false;
		}
	}
	
	// 이렇게 오버라이딩을 해주면 같은 값을 가진 객체를 하나로 통합해준다 ?
}

public class HashMap4 {

	public static void main(String[] args) {
		
		// Link, ArrayList 등과 같이 부모타입으로 다형성을 사용하면
		// 값을 추가, 수정하기에 용이하다.
		// 키는 Student 타입으로, 학생의 점수는 Integer 타입으로 제네릭
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		// Student는 클래스이기 때문에 map의 값을 추가하고 싶을 땐 객체를 생성해야함
		// new라는 키워드를 통해 생성하고 Student의 클래스는 2개의 매개변수를 가지고 있기 때문에
		// 매개변수에 맞는 값 2개를 같이 작성해야함.
		map.put(new Student(1, "김그린"), 90);
		map.put(new Student(1, "김그린"), 90);
		
		System.out.println("총 인원 수 : " + map.size());
		// Map은 중복을 허용하지 않는 것이 원칙. 하지만 위의 값은
		// new라는 키워드를 가지고 각각의 주소값이 다른 객체를 2개 만들었기 때문에 2개의 값이 생성

		
	}

}
