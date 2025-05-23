package ex02HashMap사용하기;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ex05Queue {

	public static void main(String[] args) {

		// Queue 생성해보기
		// Java Queue 자료형은 --> 추상클래스와 비슷한 느낌의 인터페이스 형태
		// (1) 추상메소드를 가지고 있는형태
		// 추상메소드란?
		// 정의(접근제한자, 리턴타입, 이름 등등)되어있으나, 구현(로직)이 안된 메소드

		// 객체생성이 사실 불가능
		// --> 어나니머스 이너 타입 형태로는 생성 가능
		// --> 익명의 내부 자료형(객체)
		// >> 추상메소드들을 오버라이딩하면서, 객체를 생성하는 방식
		// >> 왜 익명이라고 부르냐? 한번만 사용하고, 다른 파일에서는 사용 불가능

		// 큐를 생성할때는, 큐를 상속받고있는 자식클래스로
		// 구현체(new LinkedList<String>())를 만든다.
		Queue<String> queue = new LinkedList<String>();
		// add() 추가 >> 여유공간 이상이면 Exception 발생
		// offer() 추가 >> 여유공간 이상이면 false 되돌려줌
		
		queue.add("첫번째 데이터");
		queue.add("두번째 데이터");
		queue.add("세번째 데이터");
		// offer(data) >> 맨뒤에 데이터 추가
		
		System.out.println(queue);
		// 맨 앞에 있는 데이터 꺼내오기
		// element() >> 큐가 비어있으면 Exception
		// peek() >> 큐가 비어있으면 null 되돌려줌
		System.out.println(queue.element());
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		// 맨앞에 있는 데이터를 꺼내오면서 삭제하려면
		// remove() >> 큐가 비어있으면 Exception
		// poll() >> 큐가 비어있으면 null 되돌려줌
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue);
		

	}

}
