package ex;

public class Ex03이차원배열예제 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 21;
		// 이차원 배열에 값 넣기 -> 정방향
		for (int i = 0; i < arr[0].length; i++) { // 행
			for (int j = 0; j < arr.length; j++) { // 열
				arr[i][j] = num++;
			}
		}
		// 이차원 배열 값 출력 -> 스네이크 모양
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("----------------");
		int arr1[][] = new int[5][5];
		for(int i = 0;i<arr[0].length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr.length;j++) {
					
				}
			}
		}

	}

}
