package ifelse문;

import java.util.Scanner;

public class Ex02ifElse문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int price = 5000;

		// 입력받을 데이터 : 나이, 인원 수
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");

		System.out.print("나이를 입력하세요 : ");
		int inputAge = sc.nextInt();

		System.out.print("인원수를 입력하세요 : ");
		int inputNum = sc.nextInt();

		// 기본 금액 : 5000원 -> 나이가 20세 미만이라면 50% 할인이 적용된다
		if (inputAge < 20)
			price /= 2;

		System.out.println("총" + (price * inputNum) + "입니다");

	}

}
