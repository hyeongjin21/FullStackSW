package ex01스레드기초;

import java.awt.Toolkit;

public class BeepTask extends Thread {

	// 하나의 새로운 작업 단위인 스레드를 생성해보자

	// 새로운 작업 단위를 지정하기 위해서는 반드시
	// run 메소드가 오버라이딩 되어야한다
	@Override
	public void run() {
		Toolkit kit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			kit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Thread.sleep() -> 현재 실행 중인 스레드의 동작을 특정 시간동안
			// 일시 중단하는 메서드
		}
	}

	// 스레드를 생성하는 2가지 방법
	// 1. Thread 클래스 상속 받기
	// 2. Runnable 인터페이스 구현하기

	// 스레드 생성하는 방법이 2가지나 있는 이유
	// 자바는 다중 상속이 불가능 하기 때문에
	// 스레드 생성을 위해 Thread 클래스를 상속 받으면
	// 추가적으로 원하는 기능을 상속 받을 수 없다

	// -> 이런 경우에는 인터페이스를 통해 구현 한다

}
