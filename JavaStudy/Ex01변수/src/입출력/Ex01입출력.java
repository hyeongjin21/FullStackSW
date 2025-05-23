package 입출력;

import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {
		// 주석 : 코드에 영향을 끼치지 않는 일종의 메모
		// 단축키
		// 1) 글자 크기 늘리기	  : ctrl +
		// 2) 글자 크기 줄이기	  : ctrl -
		// 3) 한 줄 삭제		  : ctrl d
		// 4) 저장			  : ctrl s
		// 5) 자동 import 단축키 : ctrl shift o

		// 1. 출력문
		// ---> () 안쪽에 출력하고 싶은 구문 작성
		System.out.println("Hello World!");
		
		// 본인 이름 출력하기
		// 출력문 생성 단축키 : syso -> ctrl space
		System.out.println("김형진");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 개행(줄바꿈)을 없애고 싶다면 ln을 지워주기
		System.out.print("글자를 입력해주세요 >> ");
		// 2-2) 입력받기
		sc.next();
		
		
	}

}
