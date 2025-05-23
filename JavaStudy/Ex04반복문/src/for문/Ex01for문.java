package for문;

public class Ex01for문 {
	public static void main(String[] args) {

		// for문 사용 방법
		// for( 1-초기화 구문; 2-검사조건; 3-반복 후 작업 )
		// 1 : for문에서 사용할 전용 변수를 선언하는 구문! i : index
		// 2 : 반복하기 위한 검사 조건 ( true일 때 반복문을 실행 )
		// 3 : 반복문을 실행 한 후에 반드시 거치는 작업!

		// 실행 순서
		// 시작 -> 1 (최초 딱 1번만) -> 2 -> 실행문장 실행 -> 3
		// -> 2 -> 실행문장 실행 -> 3 -> 2 (false -> 반복문을 종료)

		for (int i = 0; i < 5; i++) {
			System.out.println("실행구문 " + i);
		}

		// 1~10까지 숫자를 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "\t"); // \ : 이스케이프 문자열
		}

		System.out.println();
		System.out.println();

		// 96 ~ 73 까지 출력
		for (int i = 96; i >= 73; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 위 숫자들 중 홀수만 출력
		for (int i = 96; i >= 73; i--) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 95; i >= 73; i -= 2) {
			System.out.print(i + " ");
		}
		
	}
}
