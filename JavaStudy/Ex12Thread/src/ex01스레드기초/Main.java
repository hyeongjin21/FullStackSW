package ex01스레드기초;

import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {

		// 스레드 : 프로세스 안에서 동작하는 작업의 단위

		// 자바 어플리케이션 : 메인 스레드가 필수
		// -> Main 메소드

		// 싱글 스레드를 통한 작업 수행
		
		Thread thread = new BeepTask();
		
		thread.start();
		

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		

	}

}
