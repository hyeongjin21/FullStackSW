package exPokemon;

public class Raichu extends Pika{
	// Raichu : 새로운 클래스 (자식 클래스, 서브 클래스)
	// : extends 키워드를 사용해서 기존 클래스의 기능을 물려받는다
	
	// 상속의 특징
	// 1. 다중 상속을 받을 수 없다
	// 2. 상속 횟수의 제한이 없다
	// 3. 모든 클래스는 java.lang.Object라고 하는
	//	  공통의 조상 클래스를 상속 받는다
	
	// 라이츄만의 새로운 기술을 1개만 정의해보자
	
	// 메소드 오버라이딩
	// : 부모 클래스가 가지고 있는 메소드의 틀(리턴타입, 메소드명, 매개변수)을 그대로 가지고 와서
	//   중괄호 안쪽의 "로직"만 새로 재정의하는 기법
	
	public void skill1() {
		System.out.println("천만볼트");
	}
	
	public void skill3() {
		System.out.println("짓누르기");
	}
	
	
}
