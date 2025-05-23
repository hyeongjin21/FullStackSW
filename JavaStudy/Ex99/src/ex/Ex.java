package ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex {

	public static int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public int solution1(String my_string, String target) {
		int answer = 0;
		if (my_string.indexOf(target) != -1) {
			return answer = 1;
		} else
			return answer = 0;
	}

	public int answer1(String my_string, String target) {
		int answer = my_string.contains(target) ? 1 : 0;
		return answer;
	}

	public String solution2(int n) {
		String answer = "" + n;
		return answer;
	}

	public String answer2(int n) {
		String answer = Integer.toString(n);
		return answer;
//      return String.valueOf(n);
	}

	public int solution3(String n_str) {
		int answer = Integer.parseInt(n_str);
		return answer;
	}

	public int answer3(String n_str) {
		return Integer.parseInt(n_str);
	}

	public int solution4(String num_str) {
		int answer = 0;
		char[] arr = num_str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			answer += Character.getNumericValue(arr[i]);
		}
		return answer;
	}

	public int answer4(String numStr) {
//        return numStr.chars().map(c -> c - 48).sum();
		return numStr.chars().map(c -> c - '0').sum();
		// 0의 아스키 코드가 48이라서 48을 뺌
	}

	public int[] solution5(int[] num_list) {
		int[] answer = new int[5];
		Arrays.sort(num_list);
		for (int i = 5; i < num_list.length; i++) {
			answer[i - 5] = num_list[i];
		}
		return answer;
	}

	public int[] answer5(int[] numList) {
		return Arrays.stream(numList).sorted().skip(5).toArray();
	}

	public int[] solution6(int[] num_list) {
		int[] answer = new int[5];
		Arrays.sort(num_list);
		for (int i = 0; i < 5; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}

	public int[] answer6(int[] num_list) {
		Arrays.sort(num_list);
		return Arrays.copyOfRange(num_list, 0, 5);
	}

	public int[] solution7(int[] arr, int n) {
		int len = arr.length;
		if (len % 2 == 0) {
			for (int i = 0; i < len; i++) {
				if (i % 2 != 0)
					arr[i] += n;
			}
		} else {
			for (int i = 0; i < len; i++) {
				if (i % 2 == 0)
					arr[i] += n;
			}
		}
		return arr;
	}

	public int[] answer7(int[] arr, int n) {
		for (int idx = arr.length % 2 == 0 ? 1 : 0; idx < arr.length; idx += 2) {
			arr[idx] += n;
		}

		return arr;
	}

	public int solution8(int[] arr1, int[] arr2) {
		int answer = 0;
		if (arr1.length > arr2.length)
			return answer = 1;
		else if (arr1.length < arr2.length)
			return answer = -1;
		else {
			int sum1 = 0;
			int sum2 = 0;
			for (int i = 0; i < arr1.length; i++) {
				sum1 += arr1[i];
			}
			for (int i = 0; i < arr2.length; i++) {
				sum2 += arr2[i];
			}
			if (sum1 > sum2)
				return answer = 1;
			else if (sum1 < sum2)
				return answer = -1;
			else
				return answer = 0;
		}
	}

	public int answer8(int[] arr1, int[] arr2) {
		int answer = Integer.compare(arr1.length, arr2.length);
		// compare 두 인자값을 비교
		// 첫번쨰가 더 크면 1, 작으면 -1
		// 두 인자값이 같으면 0
		if (answer == 0) {
			answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
		}

		return answer;
	}

	public int[] solution9(int[] arr) {
		int len = 0;
		for (int i = 0; i < arr.length; i++) {
			len += arr[i];
		}
		int[] answer = new int[len];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer[cnt] = arr[i];
				cnt++;
			}
		}
		return answer;
	}

	public int[] answer9(int[] arr) {
		int[] answer = {};

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		answer = new int[sum];

		int idx = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer[idx++] = arr[i];
			}
		}

		return answer;
	}

	public String solution10(String rny_string) {
		String[] str = rny_string.split("");
		String answer = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("m")) {
				answer += "rn";
			} else
				answer += str[i];

		}
		return answer;
	}

	public String answer10(String rny_string) {
		return rny_string.replaceAll("m", "rn");
	}

	public int[] solution11(String myString) {
//		System.out.println(Arrays.toString(arr2));
		String[] arr1 = myString.split("");
		String[] arr2 = myString.split("x");
		int len = 0;
		if (arr1[arr1.length - 1].equals("x"))
			len = arr2.length + 1;
		else
			len = arr2.length;
		int[] answer = new int[len];
		for (int i = 0; i < len; i++) {
			if (i == arr2.length)
				answer[i] = 0;
			else
				answer[i] = arr2[i].length();
		}
		return answer;
	}

	public int[] answer11(String myString) {
		ArrayList<Integer> list = new ArrayList<>();
		String[] tmp = myString.split("x");
		for (int i = 0; i < tmp.length; i++) {
			list.add(tmp[i].length());
		}
		if (myString.endsWith("x")) {
			list.add(0);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public String[] solution12(String my_string) {
		ArrayList<String> arr = new ArrayList<String>();
		String[] arr1 = my_string.split(" ");
		for (String s : arr1) {
			if (!s.equals(""))
				arr.add(s);
		}
		String[] answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
		return answer;
	}

	public String[] answer12(String my_string) {
		return my_string.trim().split("[ ]+");
//        return myString.trim().split("\\s+");
//        return my_string.strip().split("");    
	}

	public String[] solution13(String[] strArr) {
		ArrayList<String> arr = new ArrayList<String>();
		for (String s : strArr) {
			if (!s.contains("ad")) {
				arr.add(s);
			}
		}
		String[] answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}

		return answer;
	}

	public String[] answer13(String[] strArr) {
		ArrayList<String> al = new ArrayList<>();

		for (String s : strArr) {
			if (!s.contains("ad")) {
				al.add(s);
			}
		}
		return al.toArray(String[]::new);
		// return Arrays.stream(strArr).filter(s ->
		// !s.contains("ad")).toArray(String[]::new);
	}

	public String[] solution14(String[] strArr) {
		String[] answer = new String[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			answer[i] = "";
			if (i % 2 == 0) {
				for (String s : strArr[i].split("")) {
					answer[i] += s.toLowerCase();
				}
			} else {
				for (String s : strArr[i].split("")) {
					answer[i] += s.toUpperCase();
				}
			}
		}
		return answer;
	}

	public String[] answer14(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
		}
		return strArr;
	}

	public int solution15(String myString, String pat) {
		int answer = 0;
		if (myString.toLowerCase().contains(pat.toLowerCase()))
			answer = 1;
		return answer;
	}

	public int solution16(int[] num_list) {
		int answer = 0;
		if (num_list.length > 10) {
			for (Integer i : num_list) {
				answer += i;
			}
		} else {
			answer = 1;
			for (Integer i : num_list) {
				answer *= i;
			}
		}
		return answer;
	}

	public int solution17(int[] numbers, int n) {
		int answer = 0;
		for (Integer i : numbers) {
			if (answer <= n)
				answer += i;
		}
		return answer;
	}

	public String[] solution19(String[] todo_list, boolean[] finished) {
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < finished.length; i++) {
			if (!finished[i])
				arr.add(todo_list[i]);
		}
		String[] answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++)
			answer[i] = arr.get(i);
		return answer;
	}

	public String[] answer19(String[] todo_list, boolean[] finished) {
		String str = "";
		for (int i = 0; i < finished.length; i++) {
			str = finished[i] == false ? str + todo_list[i] + "," : str;
		}

		return str.split(",");
	}

	public String[] solution20(String[] names) {
		int len = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
		String[] answer = new String[len];
		int cnt = 0;
		for (int i = 0; i < names.length; i++) {
			if (i % 5 == 0)
				answer[cnt++] = names[i];
		}
		return answer;
	}

	public String solution21(String myString) {
		String answer = "";
		String[] str = myString.split("");
		for (String s : str) {
			answer += s.equals("a") || s.equals("A") ? s.toUpperCase() : s.toLowerCase();
		}
		return answer;
	}

	public String answer21(String myString) {
		return myString.toLowerCase().replaceAll("a", "A");
	}

	public int solution22(String binomial) {
		int answer = 0;
		String[] str = binomial.split(" ");
		switch(str[1]) {
		case"+":
			answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
			break;
		case"-":
			answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
			break;
		case"*":
			answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
			break;
		}
		return answer;
	}
	
	public String solution23(String my_string, String alp) {
        return my_string.toLowerCase().replaceAll(alp,alp.toUpperCase());
    }
	
	public static int[] solution24(int[] arr, int[][] queries) {
        int[] answer = {};
        return answer;
    }

	public static void main(String[] args) {

		int[] num1 = { 0, 1, 2, 3, 4 };
//		int[] num2 = { 3, 3, 3, 3, 3 };
		int[][] num3 = {{0, 1},{1, 2},{2, 3}};
		String str = "programmers";
		String str1 = "p";
		String[] strArr = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };
//		String[] strArr1 = { true, false, true, false };
//		boolean[] arr = {true, false, true, false};
		System.out.println(solution24(num1,num3));

	}

}
