package 비교연산자;

public class Ex01비교연산 {

	public static void main(String[] args) {
		// 비교 연산자
		// 서로 다른 두개의 피연산자를 비교하는 연산자
		// 연산의 결과로 boolean 타입의 값을 리턴(되돌려 준다)

		// 변수를 선언함과 동시에 초기화 하는 구문
		int a = 3;
		// int a -> 변수 선언
		// a = 3; -> 할당

		int b = 10;

		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);

		// 논리 연산자 ( and, or, not )
		// 논리 연산자는 피연산자가 boolean 타입이여야한다
		// 결과값 : boolean 타입

		// 1. && -> and 연산자
		System.out.println((a > b) && (a == b));
		
		// 2. || -> or 연산자
		// 둘 중에 하나라도 true 라면 true 값을 되돌려주는 연산자
		
		// 3. ! -> not 연산자
		// true -> false 값을 리턴
		// false -> true 값을 리턴
		

	}

}
