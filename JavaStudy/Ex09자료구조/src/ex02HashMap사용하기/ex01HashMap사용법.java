package ex02HashMap사용하기;

import java.util.HashMap;

public class ex01HashMap사용법 {

	public static void main(String[] args) {

		// 1. HashMap 생성하기
		HashMap<String, String> map = new HashMap<String, String>();

		// 기본자료형을 넣고 싶다면
		// Wrapper Class를 사용하자
		// 기본 자료형 --> 레퍼런스 타입으로 만든 클래스
		// 대문자로 시작하면 왠만하면 다 나옴
		// HashMap<String, Integer>
		// HashMap<String, Float>

		// 2. map에 데이터 추가하기
		// map.put(key,value); 지정한 자료형
		map.put("김운비", "밤비");
		map.put("박수현", "수박");

		// 3. map 크기가져오기
		map.size();
		System.out.println(map.size());
		System.out.println(map);

		// 4. 데이터 접근하기
		// map.get(Object key);
		// Object key = "박수현"
		// -> 자동으로 형변환? 객체에서? 상속 전제
		// -> 업캐스팅
		System.out.println(map.get("박수현"));

		// 5. 데이터 삭제하기
		map.remove("김운비");
		System.out.println(map);

		// 6. 데이터 수정하기
		// (1) map.put()을 통해서 중복되는 key값에
		// 대응되는 value를 overwrite하는 것도 가능
		// (2) map.replace(key,수정할value)
		map.put("류이수", "기획팀 막내");
		map.put("조준용", "DB천재");
		System.out.println(map);
		map.replace("류이수", "JAVA천재");
		System.out.println(map);

		// 7. key 값들만 꺼내오는 방법
		System.out.println(map.keySet());
		for (String s : map.keySet()) {
			System.out.println(s);
		}

		// 8. value 들만 꺼내오기
		System.out.println(map.values());

		// 9. map에 대응되는 데이터를 꺼내오는 방법2
		// map.getOrDefault(key값, default값)
		// --> 대응되는 key값이 있다면 이에 해당하는 value
		// --> 없다면, 기본값을 되돌려줌.
		map.getOrDefault("박수현", null);

	}

}
