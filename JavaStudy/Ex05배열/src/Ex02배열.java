import java.util.Arrays;
import java.util.Random;

public class Ex02배열 {

	public static void main(String[] args) {
		// 배열과 for문
		// 1. 반복문을 사용해서 모든 배열에 랜덤한 값으로 초기화

		// 2. 중복 제거
		// -> 5 2 5 -> 5라고 하는 숫자를 중복 체크
		// -> 다시 2번 인덱스에 랜덤값을 부여하고, 다시 중복체크

		// array 정수형 데이터 5개 저장할 수 있는 배열 생성
		int[] array = new int[5];

		Random rd = new Random();

		// 반복문을 사용해서 배열에 랜덤값 부여하기
		for (int i = 0; i < array.length;) {
			// 랜덤값 생성
			int number = rd.nextInt(10) + 1;

			// 중복 검사
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (array[j] == number) {
					isDuplicate = true;
					break;
				}
			}
			// 중복이 아니라면 배열 안에 값을 저장
			// 중복이라면 다시 랜덤한 값을 부여

			if (!isDuplicate) {
				array[i] = number;
				i++;
			}

		}

		// 출력
		System.out.println("번호 출력");
		System.out.println(Arrays.toString(array));

		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			int rNum = (int) (Math.random() * 10) + 1;
			boolean check = false;
			for (int j = 0; j <= i; j++) {
				if (num[j] == rNum) {
					check = true;
					break;
				}
			}
			if (!check) {
				num[i] = rNum;
			} else
				i--;
		}
		System.out.println(Arrays.toString(num));
	}

}
