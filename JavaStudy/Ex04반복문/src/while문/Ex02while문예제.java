package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		// 반복문 예제에서 중요한 점
		// 내가 어떤 코드를 반복 해야하는지 확인하는 작업
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(num < 10) {
			System.out.print("정수 입력 : ");		
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
		
//		while(true) {
//			System.out.print("정수 입력 : ");		
//			int num2 = sc.nextInt();
//			if(num2 >= 10) {
//				System.out.println("종료되었습니다");
//				break;
//			}
//		}
		
		
	}

}
