import java.util.Arrays;

public class Ex01배열사용 {

	public static void main(String[] args) {

		// 정수형 배열의 참조 값을 저장할 수 있는 (래퍼런스) 변수 선언
		// 래퍼런스 : 참조
		// 래퍼런스 변수 : 데이터의 주소값을 저장하는 변수
		int[] arr;

		// 연속적인 7개의 공간에 데이터를 저장할 수 있는 정수형 배열 선언
		int[] arr1 = new int[10]; // 7개의 공간이 필요 -> 배열의 크기는 변경이 불가하다

		// 래퍼런스 변수
		// 저장 및 사용을 위해서는 인덱스를 통해 접근 해야한다
		System.out.println(arr1);

		// 배열에 데이터 각각 저장하기
		// 0 ~ 6 인덱스에 값을 10씩 증가시키면서 넣어주기
		// arr1[0] = 10;

		// 배열의 길이 -> 7
		// .length

		// 배열을 다루는 반복문(for)의 기본 구조
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 10 * (i + 1);
		}

//		arr1[10] = 100;
//		ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		// 런타임 에러 : 문법상의 에러는 없으나, 실행이 불가능한 코드

		// 01. arr1 저장된 모든 값의 합, 평균을 출력

		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		int avg = sum / arr1.length;
		System.out.println("합 : " + sum + " 평균 : " + avg);

		// 배열 선언 및 초기화시 배열의 크기를 자동으로 맞춰주는 방법
		String[] arr2 = { "김희광", "김수연", "김형진", "김다원" };

		// 1. 배열 크기 확인
		System.out.println(arr2.length);
		System.out.println(Arrays.toString(arr2));
		// Arrays.toString(배열) : 하나의 문자열로 반환해줌

		// arr1 -> 10 ~ 100
		System.out.println("----------------------");
		System.out.println(Arrays.toString(arr1));

		// 래퍼런스 변수는 실제 데이터가 아니라 주소값을 저장한다
		int[] arr4 = arr1;
		arr4[0] = 100;

		// arr4 과 arr1 은 같은 주소값을 가지고 있다! -> 같은 배열을 공유한다
		System.out.println("arr1" + Arrays.toString(arr1));
		System.out.println("arr4" + Arrays.toString(arr4));
		
		int[] arr5 = arr1.clone();
		arr5[0] = 10;
		System.out.println("arr1" + Arrays.toString(arr1));
		System.out.println("arr5" + Arrays.toString(arr5));
		

	}

}
