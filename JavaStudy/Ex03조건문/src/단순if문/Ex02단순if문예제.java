package 단순if문;

import java.util.Scanner;

public class Ex02단순if문예제 {

	public static void main(String[] args) {
		// 1. 나이를 입력받아 age 변수에 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int inputAge = sc.nextInt();
		
		// 2. 만약에 age >= 20 "성인입니다"
		if(inputAge >= 20) {
			System.out.println("성인입니다");
		}
		
		// age < 20 프로그램을 종료
		
		
	}

}
