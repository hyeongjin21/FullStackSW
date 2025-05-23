package switch문;

import java.util.Scanner;

public class Ex03switch예제 {

	public static void main(String[] args) {

		// 월을 입력 받아 봄,여름,가을,겨울 중 맞는 계절을 알려주기

		// 월 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();

		switch (month) { // 다중 case 라벨
		case 12, 1, 2:
			System.out.println(month + "월은 겨울입니다!");
			break;
		case 3, 4, 5:
			System.out.println(month + "월은 봄입니다!");
			break;
		case 6, 7, 8:
			System.out.println(month + "월은 여름입니다!");
			break;
		default:
			System.out.println(month + "월은 가을입니다!");
			break;
		}

		System.out.println("----------------------------------");

		switch (month) { // 화살표 case 라벨
		// break; 키워드가 따로 필요하지 않다
		case 12, 1, 2 -> System.out.println(month + "월은 겨울입니다!");
		case 3, 4, 5 -> System.out.println(month + "월은 봄입니다!");
		case 6, 7, 8 -> System.out.println(month + "월은 여름입니다!");
		default -> System.out.println(month + "월은 가을입니다!");
		}

		System.out.println("----------------------------------");

		String result = switch (month) { // 화살표 case 라벨
		// 화살표 문법의 경우 JDK 14버전 이후로만 사용 가능하다
		// break; 키워드가 따로 필요하지 않다
		case 12, 1, 2 -> month + "월은 겨울입니다!";
		case 3, 4, 5 -> month + "월은 봄입니다!";
		case 6, 7, 8 -> month + "월은 여름입니다!";
		default -> month + "월은 가을입니다!";
		};

		System.out.println(result);

	}

}
