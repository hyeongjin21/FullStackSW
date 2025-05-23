package ex02HashMap사용하기;

import java.util.HashMap;
import java.util.Scanner;

public class ex03아나그램구하기 {

	private static boolean solution1(String a, String b) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		if (a.length() == b.length())
			return false;
		for (String s : a.split("")) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (String s : b.split("")) {
			if (!map.containsKey(s)) {
				return false;
			} else {
				map.replace(s, map.get(s) - 1);
			}
		}
		for(int num : map.values()) {
			if(num != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문장을 입력하시오 >> ");
		String strA = sc.next();
		System.out.print("두번째 문장을 입력하시오 >> ");
		String strB = sc.next();
		String a = "AbaAeCe";
		String b = "baeeACA";
		boolean result = solution1(a, b);
		boolean result1 = solution1(strA, strB);
		System.out.println(result);
		System.out.println(result1);

	}

}
