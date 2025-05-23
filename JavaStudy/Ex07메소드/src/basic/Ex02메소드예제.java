package basic;

public class Ex02메소드예제 {

	public static void main(String[] args) {
		System.out.println(add(3, 5));
		System.out.println(sub(3, 5));
		System.out.println(mul(3, 5));
		System.out.println(div(3, 5));
	}

	public static int add(int num1, int num2) {
		int result = num1 + num2;
//		return num1 + num2;
		return result;
	}

	public static int sub(int num1, int num2) {
		int result = num1 - num2;
//		return num1 - num2;
		return result;
	}

	public static int mul(int num1, int num2) {
		int result = num1 * num2;
//		return num1 * num2;
		return result;
	}

	public static int div(int num1, int num2) {
		int result = num1 / num2;
//		return num1 / num2;
		return result;
	}

}
