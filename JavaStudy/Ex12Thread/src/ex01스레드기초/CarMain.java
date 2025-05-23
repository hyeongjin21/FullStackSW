package ex01스레드기초;

public class CarMain {

	public static void main(String[] args) {

		
		Car car1 = new Car("카1");
		car1.start();
		
		Car car2 = new Car("카2");
		car2.start();
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Main 메소드가 실행 중 입니다.");
		}
	}

}
