package exPerson;

import java.util.Arrays;

public class PersonMain {

	public static void main(String[] args) {
		
		// 만들어진 설계도면을 가지고 와서
		// 실제 객체(Object)를 생성하는 공간이다
		
		// 스캐너 사용할 때와 같다
		Person p1 = new Person();
		
		// 1. name, age, gender, height
		// 각 field값 채워주기
		
		p1.name = "김형진";
		
		System.out.println(p1.name);
		
		// Person 객체를 생성 -> p2
		// 각 속성 안에다가 데이터를 넣어주세요
		Person p2 = new Person();
		p2.name = "김형진";
		p2.age = 30;
		p2.gender = "남";
		p2.height = 170;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
		System.out.println(p2.height);
		
		p2.eat();
		p2.sleep();
		p2.br();
		
	}

}
