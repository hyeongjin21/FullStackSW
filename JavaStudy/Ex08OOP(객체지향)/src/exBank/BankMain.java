package exBank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		// 1. 금액 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금할 금액 : ");
		int money = sc.nextInt();
		
		//** money 변수와 BankBook.money 다르다
		
		// 2. 금액을 처리할 수 있는 bank 객체 생성
		BankBook bank = new BankBook();
		
		// 3. 입력된 금액을 우리 통장 객체에 저장
		bank.deposit(money);
		
		// 4. 현재 잔액을 콘솔창에 출력
		bank.showMoney();
		
		// 5. 출금할 금액 입력
		System.out.print("출금할 금액 : ");
		money = sc.nextInt();
		bank.withdraw(money);
		
		// 6. 잔액 출력
		bank.showMoney();

	}

}
