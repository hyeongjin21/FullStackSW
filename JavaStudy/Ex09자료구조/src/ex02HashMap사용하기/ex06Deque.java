package ex02HashMap사용하기;

import java.util.Deque;
import java.util.LinkedList;

public class ex06Deque {

	public static void main(String[] args) {
		// 클래스의 풀네임 생각해보기
		// qualified name
		// ex02HashMap사용하기.ex06Deque
		
		// 덱 >> 큐를 2개 겹쳐놓은 형태
		// Double ended Queue
		
		// 덱 >> 객체 생성 불가능
		// 가능한 구현체 >> LinkedList 형태, ArrayDeque 형태
		Deque<String> deque = new LinkedList<String>();
		deque.addFirst("첫번째 데이터 추가");
		deque.addLast("마지막 데이터 추가");
		
		System.out.println(deque);
		// 추가적으로 자바에서 제공하는 클래스들에 대해 알아보고 싶다면
		// 구글에 Java 클래스명 documentation 이렇게 검색해서
		// 공식 홈페이지 문서를 읽어보기
		
	}

}
