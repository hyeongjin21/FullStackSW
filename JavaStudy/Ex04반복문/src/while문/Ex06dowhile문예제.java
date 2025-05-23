package while문;

import java.util.Scanner;

public class Ex06dowhile문예제 {

	public static void main(String[] args) {
		
		// 입력 받은 문자열 비교하기!
		// 기본 자료형의 값이 같은지 비교 할때 ==
		// String( char의 배열 형태 )
		// -> char를 여러개 저장할 수 있는 형태
		// "안녕하세요"
		
		// String -> 래퍼런스(참조) 자료형
		// 실제 데이터가 아니라 주소값을 가지고 있는 자료형
		
		Scanner sc = new Scanner(System.in);
		
//		String str1 = "안녕하세요";
//		String str2 = "안녕하세요";
//		String str3 = sc.next();
//		
//		System.out.println("1번" + (str1 == str2));
//		
//		System.out.println("2번" + (str1 == str3));
//		
//		System.out.println("3번" + str1.equals(str3));
		
		// 입력 받은 문자열과 변수 안에 담긴 문자열을 비교하기 위해서는
		// .equals() 라고하는 비교 기능을 사용한다
		
		String ID = "test";
		String password = "test1234";
		String inputID = "";
		String inputPassword = "";
		boolean check = true;
		int count = 0;
		
		do {
			System.out.print("아이디를 입력해주세요 : ");
			inputID = sc.next();
			System.out.print("비밀번호를 입력해주세요 : ");
			inputPassword = sc.next();
			
			if(inputID.equals(ID) && inputPassword.equals(password)) {
				System.out.println("로그인 성공!");
				check = false;
			}else {
				count++;
				if(count == 3) {
					System.out.println("아이디와 비밀번호가 3회 틀렸습니다.");
					check = false;
				}
				System.out.println("로그인 실패");
			}
			
		}while(check);
		
//		while(true) {
//			System.out.print("아이디를 입력해주세요 : ");
//			inputID = sc.next();
//			System.out.print("비밀번호를 입력해주세요 : ");
//			inputPassword = sc.next();
//			
//			if(inputID.equals(ID) && inputPassword.equals(password)) {
//				System.out.println("로그인 성공!");
//				break;
//			}else {
//				count++;
//				if(count == 3) {
//					System.out.println("아이디와 비밀번호가 3회 틀렸습니다.");
//					break;
//				}
//				System.out.println("로그인 실패");
//			}
//		}
		
		
		
		
		
		
		

	}

}
