package exKakao;

public class User {
	
	// 1. field 영역 (Data, 속성)
	String id;
	String name;
	int age;
	
	// 메소드
	
	// 생성자 메소드 : 객체가 생성되기 위해 동작(객체를 초기화 하기위해)하는 메소드
	// constructor
	
	// 1. 리턴타입을 명시하지 않는다
	// 2. 메소드 명이 클래스 이름과 동일하다
	public User(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public User() {
		// 기본 생성자 메소드
		// 생성자를 작성하지 않아도 기본 생성자는 사용이 가능하다
		// -> 기본 생성자는 생략 되어있다
		// -> 생성자를 추가로 만들면 생략되어있는 기본 생성자는 사용할 수 없다
		
		// ** 두개 이상의 생성자를 사용하고 싶다면 class에 명시해주기
		// -> 생성자 메소드도 오버로딩이 가능하다
		
		
	}
	
	
	
	public void sendMessage() {
		System.out.println("메시지 보내기");
	}
	

	public void login() {
		System.out.println(id+"님이 로그인 하셨습니다.");
	}
	
	public void gift() {
		System.out.println("기프티콘 보내기");
	}
	

}
