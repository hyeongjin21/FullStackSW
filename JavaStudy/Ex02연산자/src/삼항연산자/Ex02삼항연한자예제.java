package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연한자예제 {

	public static void main(String[] args) {

		// 1. 입력 도구 받아오기
		Scanner sc = new Scanner(System.in);

		// 2. 두 개의 정수를 입력 받기
		System.out.print("첫 번째 정수 입력 : ");
		int inputNum1 = sc.nextInt();

		System.out.print("두 번째 정수 입력 : ");
		int inputNum2 = sc.nextInt();

		// 3. 두개의 숫자 중에서 더 큰수에서 작은 수를 빼기
		System.out.println("두수의 차 : " + (inputNum1 >= inputNum2 ? inputNum1 - inputNum2 : inputNum2 - inputNum1));
		
	}

}
