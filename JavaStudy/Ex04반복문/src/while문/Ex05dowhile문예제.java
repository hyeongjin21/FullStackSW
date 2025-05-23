package while문;

import java.util.Scanner;

public class Ex05dowhile문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 1;
		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();

		while (weight > goal) {
			System.out.print(count++ + "주차 감량 몸무게 : ");
			int num = sc.nextInt();
			weight -= num;
			if (weight <= goal)
				System.out.println(weight + "달성");
		}

		// ------------------------------------------------------

//		int count = 1;
//		System.out.print("현재몸무게 : ");
//		int weight = sc.nextInt();
//		System.out.print("목표몸무게 : ");
//		int goal = sc.nextInt();
//		do {
//			System.out.print(count++ + "주차 감량 몸무게 : ");
//			int num1 = sc.nextInt();
//			weight -= num1;
//		} while (weight > goal);
//		System.out.println(weight + "kg 달성");
		// --------------------------------------------------

		// 1. 현재 몸무게와 목표 몸무게를 입력 받기 -> 한 번만 진행
//		System.out.print("현재 몸무게 : ");
//		int nowWeight = sc.nextInt();
//
//		System.out.print("목표 몸무게 : ");
//		int goal = sc.nextInt();
//		int week = 1;
//		do {
//			// 2. 주차별 감량 몸무게를 입력 -> 반복
//			System.out.print(week++ + "주차 감량 몸무게 : ");
//			int weight = sc.nextInt();
//			nowWeight -= weight;
//		} while (nowWeight > goal);
//		// 3. 현재 몸무게가 <= 목표 몸무게 -> 목표 달성
//		System.out.println(nowWeight + "달성 축하합니다");

	}

}
