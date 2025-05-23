package basic;

public class Ex01메소드기본 {

	// 접근제한자 void(리턴타입 - 되돌려줄 리턴 값이 없을 경우 작성하는 키워드)
	// main - 메소드명 (매개변수)
	public static void main(String[] args) {
		// main : 코드를 실행할 수 있는 기능을 가진 메소드
		// main 메소드 안쪽에서는 메소드를 사용 할 수는 있지만 메소드 설계는 불가능하다

		// static -> 정적인, 고정적인
		// static 저장 공간은 자바가 코드를 실행하면서 가장 먼저 읽는 공간
		// 모든 클래스에서 공유할 수 있는 공간

		// 메소드 사용(호출) : 다른 메소드 안쪽에서도 가능하다
		int result = addNumber(2, 3);
		System.out.println("연산 결과는 : " + result);
		
		// 메소드 오버로딩 (메소드 중복 정의)
		addNumber(3.5, 1.6);
		
		// 메소드의 이름은 같지만 매개변수는 다르게 해야한다
		// 1. 매개변수의 갯수가 다르거나
		// 2. 매개변수의 데이터 타입이 달라야한다
		// 리턴 타입만 다른 경우에는 메소드 오버로딩이라고 할 수 없다
		

	}
	
	private static double addNumber(double d, double e) {
		double result = d + e;
		return result;
	}

	// 메소드 설계 : main 메소드 뿐만 아니라 모든 메소드 안에서는 
	//			  메소드 설계 즉 생성이 불가능하다
	public static int addNumber(int num1, int num2) {
		// 숫자를 더해주는 기능을 설계하는 과정
		int result = num1 + num2;
		return result;
	}

}
