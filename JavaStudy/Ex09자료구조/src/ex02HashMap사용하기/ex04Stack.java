package ex02HashMap사용하기;

import java.util.Stack;

public class ex04Stack {

	public static void main(String[] args) {
//		z();
		// 1. 자바에서 스택 사용해보기
		Stack<String> stack = new Stack<String>();
		stack.push("첫번째데이터");
		stack.push("두번째데이터");
		stack.push("세번째데이터");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		stack.add(0, "마지막데이터");
		
		// 코드가 deprecated 되었다.
		System.out.println(stack);

		// Java 설계 구조상의 문제로, 스택 사용은 권장하지 않는다.
		// 중간데이터 추가, 삭제가 가능한 형태로 되어있음
		
	}

//	private static void z() {
//		y();
//		x();
//	}
//
//	private static void x() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void y() {
//		// TODO Auto-generated method stub
//		
//	}

}
