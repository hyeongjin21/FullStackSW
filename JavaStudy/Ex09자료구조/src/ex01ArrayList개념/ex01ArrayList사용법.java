package ex01ArrayList개념;

import java.util.ArrayList;

public class ex01ArrayList사용법 {

	public static void main(String[] args) {
		
		// 1. ArrayList 생성하기
		// -> String 객체를 저장하는 자료구조 list 생성
		// ArrayList<자료형> 변수명 = new ArrayList<자료형>();
		// --> 우측 <> 안쪽의 자료형은 생략 가능하다 
		ArrayList<String> list = new ArrayList<String>();
		
		// 2. ArrayList 크기 확인
		// 리스트명.size();
		System.out.println(list.size());
		
		// 3. 데이터 추가
		list.add("한솥 치킨제육");
		list.add("미역국");
		list.add("라면맛 닭가슴살");
		
		System.out.println(list.size());
		
		// 4. 특정위치에 데이터 추가하기
		list.add(0, "와인");
		System.out.println(list.size());
		
		// 5. 데이터 가져오기
		// 리스트명.get(인덱스번호);
		// 리스트명.getFirst(); || 리스트명.getLast();
		System.out.println(list.get(3));
		
		// 6. 데이터 삭제하기
		// 리스트명.remove(인덱스);
		list.remove(0);
		System.out.println(list.size());
		
		// 7. 데이터 전체삭제하기
		// 리스트명.clear();
		list.clear();
		System.out.println(list.size());
		
		
	}

}
