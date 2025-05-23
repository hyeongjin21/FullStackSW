package for문;

public class Ex05for문예제 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 78; i++) {
			sum += (78 - i) * i;
		}
		System.out.println(sum);

		sum = 0;
		int num = 1;
		for (int i = 77; i > 0; i--) {
			sum += (i * num++);
		}
		System.out.println(sum);

		System.out.println("---------------");

		int sum1 = 0;
		for (int i = 1, j = 77; i < 77; i++, j--) {
			sum1 += i * j;
		}
		System.out.println(sum1);

	}

}
