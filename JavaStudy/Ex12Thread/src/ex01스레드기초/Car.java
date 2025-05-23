package ex01스레드기초;

public class Car extends Thread{

	private String name;
	
	
	public Car(String name) {
		this.name = name;
	}
	
	// Thread 상속을 통해 새로운 작업 단위를 만들기 위해서는
	// run 메소드를 오버라이딩 해야한다
	@Override
	public void run() {
		for(int i = 0;i<4;i++) {
			System.out.println(name + "가 동작하고 있습니다.");
		}
	}
	
	
	
	
	
	
	
}
