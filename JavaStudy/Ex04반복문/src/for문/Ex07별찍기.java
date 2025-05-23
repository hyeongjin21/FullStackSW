package for문;

public class Ex07별찍기 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------");
		int cnt = -1;
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			cnt += 2;
			for (int k = 0; k < cnt; k++) {
				System.out.print(" ");
			}
			for (int l = 4; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print("*");
			}
			cnt -= 2;
			for (int k = 0; k < cnt; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l <= i + 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
