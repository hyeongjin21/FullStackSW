package exBank;

public class BankBook {
	// 1. field
	private int money;

	// 2. method
	public void deposit(int money) {
		// 입금을 처리하는 메소드
		this.money += money; 
		// this = 존재하는 필드의 변수를 쓴다는 선언
		
	}

	public void withdraw(int money) {
		// 출금
		this.money -= money;
	}

	public void showMoney() {
		// 잔액확인
		System.out.println("현재 잔액 : " + money + "원");
	}

}
