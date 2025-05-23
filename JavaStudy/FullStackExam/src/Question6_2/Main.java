package Question6_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectNum = 0;
		while(true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			selectNum = sc.nextInt();
			if(selectNum == 1) {
				System.out.println("==== 음식점보기 ====");
			}else if(selectNum == 2) {
				System.out.println("==== 미용실보기 ====");
			}else if(selectNum == 3) {
				System.out.println("==== 상세보기 ====");
			}else if(selectNum == 4) {
				System.out.println("평점보기");
			}else if(selectNum == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(selectNum == 10){
				System.out.println("임의의 값 추가");
			}else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
		
		
		
	}

}
