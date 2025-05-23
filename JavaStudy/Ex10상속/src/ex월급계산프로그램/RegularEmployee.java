package ex월급계산프로그램;

import ex인터페이스.Ex01인터페이스기초;

public class RegularEmployee extends Employee implements Ex01인터페이스기초{
	// 1. field 영역 설계
	int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

	@Override
	public void tempMethod() {
		// TODO Auto-generated method stub
		
	}

}
