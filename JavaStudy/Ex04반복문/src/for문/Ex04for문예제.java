package for문;

import java.util.Scanner;

public class Ex04for문예제 {

	public static void main(String[] args) {

		// 약수 구하기
		// 숫자를 입력받아 약수를 구하라

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}

	}

}
