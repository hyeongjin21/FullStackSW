package basic;

import java.util.Scanner;

public class Ex05메소드예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		System.out.println(isPerfect(num));
	}

	public static boolean isPerfect(int num) {
		boolean result = false;
		int sum = 0;
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) sum += i;
		}
		if (sum == num) result = true;
		else result = false;
		return result;
	}

}
