package exPerson;

public class Person {
	
	// 클래스 : 내가 만들고자 하는 객체의 설계도면 혹은 나만의 자료형
	// -> 실행이 목적 X / main 메소드는 생성하지 않는다
	
	// -> 설계가 목적 그 이상 그 이하의 목적도 없다
	
	// 1. field (속성, Data)
	// 사람이라면 가지고 있을 속성을 정의
	// 이름, 나이, 성별, 키
	
	String name;
	int age;
	String gender;
	int height;
	
	// 2. method (기능, logic)
	// 숨쉬기, 먹기, 자기
	
	public void br() {
		System.out.println("후아후아 숨을 쉰다.");
	}
	
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}
	
	
}
