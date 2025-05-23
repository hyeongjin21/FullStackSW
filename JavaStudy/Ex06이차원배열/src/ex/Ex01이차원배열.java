package ex;

import java.util.Arrays;

public class Ex01이차원배열 {

	public static void main(String[] args) {
		// 5행 5열의 25 숫자를 저장할 수 있는 2차원 배열 arr을 선언
		int[][] arr = new int[5][5];
		int num = 1;

		// 행을 결정하는 반복문
		for (int i = 0; i < arr.length; i++) {
			// 각 행의 5개 칸에 숫자를 저장하는 반복문
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		// 이차원 배열 arr을 전부 출력하는 코드
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
