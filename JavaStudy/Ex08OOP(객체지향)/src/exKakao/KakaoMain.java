package exKakao;

import java.util.Scanner;

public class KakaoMain {

	public static void main(String[] args) {
		
		// 회원이라고 하는 User 클래스를 설계하고 난 후
		
		// 1. 회원 user1 객체 생성하기
		
		// 2. user1 아이디, 이름, 나이 데이터를 저장
		
		// 3. user1의 모든 field 출력하기
		
		// 4. 000님이 로그인 하셨습니다.
		// ->user1객체에 넣은 아이디 값이 출력
		
		User user1 = new User("김형진","형진",30);
		
		// User(); -> 기본 생성자 / 매개변수가 없다
		// User(String, String, int); -> 필드를 사용한 생성자 
									// 객체를 생성하기 위해 매개변수가 필요하다
		
		
//		user1.name = "김형진";
//		user1.id = "형진";
//		user1.age = 30;
		
		System.out.println(user1.name);
		System.out.println(user1.id);
		System.out.println(user1.age);
		
//		user1.login(user1.id);
		user1.login();
		
		
	}

}
