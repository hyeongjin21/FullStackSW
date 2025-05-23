package ex월급계산프로그램;

public abstract class Employee {
	
	// 각 고용 형태의 공통점만 뽑아 만드는 공통의 조상 클래스
	String empno;
	String name;
	int pay;
	
	public abstract int getMoneyPay();
	
	public String print() {
		return (empno + " : " + name + " : " + pay);
	}
	
}
