package 단순if문;

import java.util.Scanner;

public class Ex03단순if문예제 {

	public static void main(String[] args) {
		
		// 1. int타입 변수 num 선언 -> 키보드로 숫자를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNum = sc.nextInt();

		// 2. num이 3의 배수이면서 5의 배수라면 -> 3의 배수 && 5의 배수
		if (inputNum % 3 == 0 && inputNum % 5 == 0)
			System.out.println("3과 5의 배수입니다.");

//		if (inputNum % 15 == 0)
//			System.out.println("3과 5의 배수입니다.");
	}

}
