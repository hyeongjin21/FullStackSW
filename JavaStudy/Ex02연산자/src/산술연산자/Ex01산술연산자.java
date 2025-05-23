package 산술연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {

		// 산술연산자
		// / : 몫
		// % : 나머지
		// 정수형 10이라는 데이터를 담는 num1 선언
		int num1 = 10;
		// 실수형 7f 라는 데이터를 담는 num2 선언
		float num2 = 7f;
		
		System.out.println(num1/num2);
		// 정수형과 실수형을 연산하게 되면 자동으로 실수형태로 변환
		
		// + : 연결 연산
		int num3 = 10;
		String num4 = "7";
		
		System.out.println(num3 + num4 + num2);
		// 문자 + 숫자 ---> 연결의 의미
		// 문자 + 숫자 = 문자 자료형이다
		
	}

}
