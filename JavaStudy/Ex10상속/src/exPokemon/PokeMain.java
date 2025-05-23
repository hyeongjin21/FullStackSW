package exPokemon;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PokeMain {

	public static void main(String[] args) {

		// 설계한 설계도면을 바탕으로 객체를 생성하고 기능을 실행시키는 공간
		Pika p1 = new Pika();

		p1.setName("피카츄");
		p1.setAtk(500);

		System.out.println(p1.getName() + "/" + p1.getAtk());

		p1.basicAtk();
		p1.skill1();
		p1.skill2();

		System.out.println("-------------------");

		// 1. 라이츄 객체 생성
		// 2. 필드값 채워주기
		// 3. name, atk, 각 기술(메소드)
		Raichu r1 = new Raichu();
		r1.setName("라이츄");
		r1.setAtk(600);
		System.out.println(r1.getName() + "/" + r1.getAtk());

		r1.basicAtk();
		r1.skill1();
		r1.skill2();
		r1.skill3();

		// 다형성
		// skill1 메소드
		// 메소드를 사용하는 주체가 피카츄냐 라이츄냐 에 따라 결과 값이 다르다

		System.out.println("-------------------");
		// 1. 업캐스팅(자동 형변환)
		// 하위 (자식) 클래스가 상위 (부모) 클래스로 형 변환하는 것
		// *** 서로 상속 관계에 있을 때 객체간의 형변환(Casting)이 가능하다

		Raichu r2 = new Raichu();

		Pika p2 = r2;

		p2.skill1();
		// 업캐스팅 한 경우이지만 메소드를 오버라이딩한 경우
		// 자식 클래스가 가지고(재정의한) 있는 메소드가 실행 된다
		p2.skill2();
//		p2.skill3();
		// 업캐스팅을 한 경우 자식 클래스만 가지고 있는 필드와 메소드에 접근 할수 없다

		System.out.println("-------------------");

		// 2. 다운캐스팅

//		Raichu r3 = (Raichu) new Pika();
		// 다운 캐스팅은 업캐스팅 된 객체의 타입을 다시 되돌리는 것
		// 즉, 이미 업캐스팅 된 객체만 다운 캐스팅이 가능하다.

		Raichu r4 = (Raichu) p2;
		r4.skill3();
		
		// 업캐스팅과 다운캐스팅
		// 상속 관계에 있는 많은 객체들을 효율적으로 저장 및 사용하기 위함
		
		// 몬스터 볼 안에 포켓몬 저장하기
		ArrayList<Pika> ball = new ArrayList<Pika>();
		
		ball.add(p1);
		
		// 자식 클래스인 라이츄가 부모 클래스인 Pika 클래스로 형 변환 된후
		// Pika 클래스를 저장할 수 있는 ball ArrayList에 저장된 것
		ball.add(r1);
		
		
		
		
		
		
		
		
		
		
		

	}

}
