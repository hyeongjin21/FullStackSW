package 삼항연산자;

import java.util.Scanner;

public class Ex03삼항연산자예제 {

	public static void main(String[] args) {

		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 2. 농구공 갯수 입력받기
		System.out.print("농구공의 갯수를 입력하세요 :");
		int inputNum = sc.nextInt();

		// 3. 필요한 상자의 갯수 구하기
		// 농구공의 갯수가 5로 나누어 떨어진다면 -> 몫 : 상자의 갯수
		// 그렇지 않다면 -> 1,2,3,4 -> 상자가 하나 더 필요하다
//		System.out.print("필요한 상자의 수 : " + (inputNum % 5 == 0 ? inputNum / 5 : inputNum / 5 + 1));

		int box = inputNum % 5 == 0 ? inputNum / 5 : inputNum / 5 + 1;
		System.out.print("필요한 상자의 수 : " + box);

	}

}
