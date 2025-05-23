package ex추상화;

public class Kkubuk extends Pokemon{
	
	@Override // @(어노테이션) 
	// - 특별한 의미나, 기능을 가지고 있지 않고
	//	 일종의 주석 역할을 수행한다
	public void basicAtk() {
		System.out.println("basicAtk");
	}

	public void skill1() {
		// 재정의 -> 메소드 오버라이딩
		System.out.println("skill1");
	}

}
