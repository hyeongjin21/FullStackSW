package ex추상화;

public abstract class Pokemon {
	// 추상 클래스
	// - 추상 메소드를 하나라도 가지고 있다면 -> 추상 클래스다
	// - abstract 키워드를 사용해서 선언한다.
	// - 일반 메소드는 가질 수 없을까?
	// 추상 클래스는 일반 메소드를 가질 수 있다.
	// 일반 메소드만 가지고 있을 수도 있다.
	
	String type;
	String name;
	int atk;
	
	public void temp() {
		System.out.println("일반메소드");
	}

	// 우리가 만드는 모든 포켓몬들이 가지고 있는
	// 공통점들만 작성하는 클래스

	// 1. field

	// 2. method
	// - 기본 공격, skill1
	public abstract void basicAtk();
	// 기본공격을 설계해 놓더라도
	// 모든 포켓몬은 해당 기능을 상속받아 재정의 (메소드 오버라이딩)
	public abstract void skill1();
	
	// 1. abstract : 추상
	// 추상 메소드
	// - 선언 되어있으나 내부 로직이 구현되어 있지 않은 메소드
	// - 중괄호를 가지고 있지 않는다.
	// - 추상 메소드는 상속받은 자식 클래스에서 반드시
	// 메소드를 오버라이딩 해야한다.(필수)

}
