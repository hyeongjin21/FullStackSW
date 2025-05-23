package switch문;

import java.util.Scanner;

public class Ex02switch예제 {

	public static void main(String[] args) {

		// 90점 이상인 경우에는 "A학점입니다" 문구 출력
		// 90점 이상을 어떻게 판별하지?
		// 90,91,92,93,94 ~ 99,100
		// 앞자리가 9라고 하는 특징 93/10 -> 9, 100/10 -> 10

		// 1. 점수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점입니다!");
			break;
		case 8:
			System.out.println("B학점입니다!");
			break;
		case 7:
			System.out.println("C학점입니다!");
			break;
		default:
			System.out.println("D학점입니다!");
			break;
		}

	}

}
