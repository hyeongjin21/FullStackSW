package basic;

import java.util.Scanner;

public class Ex04메소드예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int base = sc.nextInt();
//		int base = 2;
		System.out.print("제곱수 입력 : ");
		int n = sc.nextInt();
//		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);

	}

	public static int powerN(int num1, int num2) {
		int result = 1;
		for (int i = 0; i < num2; i++) {
			result *= num1;
		}
//		int result2 = (int) Math.pow(num1, num2); 제곱 구하는 명령어(double타입으로 반환)
		return result;
	}

}
