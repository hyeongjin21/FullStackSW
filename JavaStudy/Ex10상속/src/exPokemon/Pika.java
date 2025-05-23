package exPokemon;

public class Pika {
	
	// Pika : 기존 클래스 (부모 클래스, 슈퍼 클래스)
	// : 상속받는 자식 클래스에게 내가 가지고 있는
	// field와 method를 전부 사용할 수 있도록 해준다
	
	

	// 1. field (속성)
	// - type, name, atk 총 3개의 속성을 정의
	private String tpye = "전기";
	private String name;
	private int atk;

	// 2. method (기능 -> 포켓몬 기술)
	// - 기본 공격 basicAtk
	// - 스킬 : skill1, skill2 (기술명을 출력하기)
	public void basicAtk() {
		System.out.println("basicAtk");
	}

	public void skill1() {
		System.out.println("백만볼트");
	}

	public void skill2() {
		System.out.println("전광석화");
	}

	// setter, getter
	public String getTpye() {
		return tpye;
	}

	public void setTpye(String tpye) {
		this.tpye = tpye;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}
