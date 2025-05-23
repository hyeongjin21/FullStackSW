package ex02HashMap사용하기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ex02반장선거 {
	// 모든 입출력을 main method가 갖게 하려면
	// 아래에서 메소드들을 어떻게 바꿀 수 있을까?
	// --> 고민해보기

	private static void count(String str) {

		HashMap<String, Integer> list = new HashMap<String, Integer>();
//		System.out.println(Arrays.toString(str.split("")));
		// 문자열 메소드 중 글자를 하나씩 가져오는 방법
		// (1) 문자열.toCharArray() --> char[]
		// (2) 문자열.split("") --> String[]
		// input.toCharArray();
		// for(char c : str.toCharArray())
		for (String s : str.split("")) {
//			System.out.println(list.get(s));
//			list.replace(s, list.get(s)+1);
			list.put(s, list.getOrDefault(s, 0) + 1);
		}
		System.out.println(list.values());
		int max = Integer.MIN_VALUE;
		String result = "c";
		for (String s : list.keySet()) {
			if (max < list.get(s)) {
				max = list.get(s);
				result = s;
			}
		}
		System.out.println("당선된 후보 >> " + result);

	}

	private static void check(int stdCnt, String str) {
		int len = str.split("").length;
		if (stdCnt != len) {
			int cnt = stdCnt > len ? stdCnt - len : len - stdCnt;
			System.out.println("입력한 값을 다시 한번 체크하세요. 현재 부족한 인원 >> " + cnt);
		} else {
			count(str);
		}
	}

	public static void main(String[] args) {

//		String s0 = "김운비";
//		String s1 = "김운비";
//		String s2 = new String("김운비");
//		System.out.println(System.identityHashCode(s0);
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
//		System.out.println(s0==s2);
//		System.out.println(s0.equals(s1));
//		System.out.println(s0==s2);
//		System.out.println(s0.equals(s2));

		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 >> ");
		int stdCnt = sc.nextInt();
		System.out.print("후보의 기호를 입력하세요 >> ");
		String str = sc.next();

		while (true) {
			check(stdCnt, str);
			break;
		}

	}

}
