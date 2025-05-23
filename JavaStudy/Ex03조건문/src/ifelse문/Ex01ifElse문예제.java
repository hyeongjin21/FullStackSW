package ifelse문;

import java.util.Scanner;

public class Ex01ifElse문예제 {

	public static void main(String[] args) {
		// 1. int타입의 변수 grade 선언 -> 키보드 값 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int inputNum = sc.nextInt();

		// 2. 만약에 grade >= 60 합격
		// grade < 60 불합격
		if (inputNum >= 60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");

	}

}
