package ex월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		
		// 각 고용 형태별로 객체를 생성하고, 메소드를 사용
		RegularEmployee regular = new RegularEmployee("SMHRD01", "류이수", 6000, 500);
		TempEmployee tempEmp = new TempEmployee("SMHRD02", "안현진", 5000);
		PartTimeEmployee partEmp = new PartTimeEmployee("SMHRD03", "임경남", 20, 20);
		
		System.out.println(regular.getMoneyPay());
		System.out.println(regular.print());
		System.out.println("----------------------------------");
		
		System.out.println(tempEmp.getMoneyPay());
		System.out.println(tempEmp.print());
		System.out.println("----------------------------------");
		
		System.out.println(partEmp.getMoneyPay());
		System.out.println(partEmp.print());
		
		// 추상 클래스는 객체를 생성할 수 있을까?
		// >> 일반적인 객체의 형태로는 불가능하다
		// 어나니머스 이너타입
//		Employee emp = new Employee() {
//			
//			@Override
//			public int getMoneyPay() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		
	}

}
