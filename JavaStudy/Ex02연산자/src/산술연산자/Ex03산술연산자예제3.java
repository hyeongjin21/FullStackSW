package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제3 {

	public static void main(String[] args) {

		// 변수 num 값을 입력받아 백의 자리 이하를 버리는 코드를 작성해라
		// 만일 변수 num의 값이 456 이라면 400이 되고, 111이라면 100이 된다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		
		System.out.println("결과 값 : " + inputNum / 100 * 100);
		
		
		
		
	}

}
