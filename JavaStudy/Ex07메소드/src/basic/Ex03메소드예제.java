package basic;

import java.util.Scanner;

public class Ex03메소드예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
//		System.out.println("연산자 입력 : ");
//		String op = sc.next();
		char op = '-';
		System.out.println(cal(num1, num2, op));
	}

//	public static int cal(int num1, int num2, String op) {
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		switch (op) {
//		case "+":
		case '+':
			result = num1 + num2;
			break;
		case '-':
			if (num1 > num2)
				result = num1 - num2;
			else
				result = num2 - num1;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}

//		int result2 = switch (op) {
//		case '+' -> num1 + num2;
//		case '-' -> num1 > num2 ? num1 - num2 : num2 - num1;
//		case '*' -> num1 * num2;
//		case '/' -> num1 / num2;
//		default -> num1 % num2;
//		};

		return result;
	}

}
