package switch문;

public class Ex01switchCase {

	public static void main(String[] args) {

		// switch-case문 
		// if 문과 함께 자주 사용하는 조건문의 일종
		
		int num = 3;
		
		switch(num) { // switch문의 경우에는 (소괄호) 안에 boolean 타입이 아니라
					// 정수, 실수, 문자, 문자열과 같은 명확한 값이 들어간다
		case 1:
			System.out.println("num은 숫자 1");
			break;	
		case 3:
			System.out.println("num은 숫자 3");
			break;	// 조건문, 반복문 더 이상 실행시키지 않고 멈추게 만드는 키워드
		case 5:
			System.out.println("num은 숫자 5");
		case 7:
			System.out.println("num은 숫자 7");
		default:	// else와 같은 역할
			System.out.println("num");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
