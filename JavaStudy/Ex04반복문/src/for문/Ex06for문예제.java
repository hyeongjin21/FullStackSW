package for문;

public class Ex06for문예제 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------");

		for (int i = 1; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------");

//		int count = -1;
//		for (int i = 0; i < 6; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			count += 2;
//			for (int k = 1; k <= count; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			count -= 2;
//			for(int k = 1; k<=count;k++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i < 10; i++) {
//			for (int j = 2; j < 10; j++) {
//				System.out.print(j + " * " + i + " = " + j * i + "\t");
//			}
//			System.out.println();
//		}
		
		
		

	}

}
