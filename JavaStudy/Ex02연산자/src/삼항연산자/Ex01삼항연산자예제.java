package 삼항연산자;

import java.util.Scanner;

public class Ex01삼항연산자예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 정수를 입력받기
		System.out.print("정수를 입력하세요 : ");
		int inputNum = sc.nextInt();

		// 2. inputNum이라는 값이 홀수 인지 짝숭인지 판별
		// 삼항 연산자 사용
		// 조건식(boolean) ? 실행문1 : 실행문2;
		System.out.print(inputNum + (inputNum % 2 == 0 ? "는(은) 짝수입니다." : "는(은) 홀수입니다."));

	}

}
