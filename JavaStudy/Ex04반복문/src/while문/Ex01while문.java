package while문;

public class Ex01while문 {

	public static void main(String[] args) {

		// 반복문 : 동일한 내용이 반복될 경우에 해당 코드를 반복시켜주는 문법
		// : 문장을 반복할 떄는 '주어진 조건이 만족되는 동안'반복 된다

		while (true) { // () 안쪽에는 boolean타입의 검사 조건이 들어간다
			// 반복하고자 하는 문장은 {} 안쪽에 작성한다.
			System.out.println("안녕하세요!");
			break;
			// loop (반복문)

		}

		// ex) 나는 안녕하세요 라는 문구를 딱 10번만 실행할거야

		int i = 0;
		while (i < 10) {
			System.out.println("안녕하세요");
			i++;
		}

	}

}
