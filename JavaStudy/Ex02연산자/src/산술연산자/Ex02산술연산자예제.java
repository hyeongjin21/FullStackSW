package 산술연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {

		// 1. 두 개의 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int inputNum1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int inputNum2 = sc.nextInt();
		
		// 2. 두 수의 더하기, 빼기, 곱하기, 나누기 결과값을 "출력"
		
		System.out.println("더한 결과 값 : " + (inputNum1 + inputNum2));
		System.out.println("뺀 결과 값 : " + (inputNum1 - inputNum2));
		System.out.println("곱한 결과 값 : " + (inputNum1 * inputNum2));
		System.out.println("나눈 결과 값 : " + ((double)inputNum1 / inputNum2));
		
		
	}

}
