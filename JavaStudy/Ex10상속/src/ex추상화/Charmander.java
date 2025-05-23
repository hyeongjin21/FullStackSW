package ex추상화;

public class Charmander extends Pokemon{

	// type, name, atk
	private String type;
	private String name;
	private int atk;
	
	// method(1. 포켓몬 기술 2. getter/setter)
	public void basicAtk() {
		System.out.println("basicAtk");
	}
	public void skill1() {
		System.out.println("skill1");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
