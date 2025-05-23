package student;

public class StudentMain {

	public static void main(String[] args) {

		// 객체 생성
		Student stu1 = new Student("류이수", "20241111", 20, 50, 99, 77);
		Student stu2 = new Student("정연희","20242222",20,90,25,50);
		
		// 학생의 정보를 저장한다
		// 중요한 정보를 저장할 때는 private
		
		// 외부 클래스에서 값이 함부러 바뀌지 않게 하고,
		// 메소드를 사용하여, 목적에 맞게 데이터를 유지하는 방법
		
		String name = stu1.getName();
		System.out.println(name);

	}

}
