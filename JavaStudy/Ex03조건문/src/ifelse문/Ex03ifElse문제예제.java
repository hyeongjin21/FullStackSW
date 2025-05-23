package ifelse문;

import java.util.Scanner;

public class Ex03ifElse문제예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("상품의 개수를 입력하세요 : ");
		int inputNum = sc.nextInt();

		int price = 10000 * inputNum;
		if (inputNum >= 11)
			System.out.println("가격은 " + (price - price / 10) + "원입니다.");
		else
			System.out.println("가격은 " + price + "원입니다.");

		// 변수의 Scope
		// Scope : 조준경, 배율, 살피다, 영역
		// 변수가 유효한 범위 즉 변수를 사용할 수 있는 범위
		
		// 변수를 선언한 위치에 따라 유효범위 (Scope) 가 다르다
		// 지역 변수 : 변수를 선언한 특정 영역 안에서만 유효한 변수
		// -> 선언한 {} 영역 안쪽에서만 유효한 (사용할 수 있는) 변수
		// 전역 변수 : 클래스 파일 전체에서 사용할 수 있는 변수
		
		
	}

}
