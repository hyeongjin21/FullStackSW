package exJDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {

		// JDBC : Java DataBase Connectivity
		// : Java와 DataBase를 연결 할 수 있는 응용 프로그램

		// JAR,WAR : 도구 혹은 프로젝트의 압축/배포 형태
		// : 수 많은 기능을 압축한 형태, 내부 파일을 읽을 수 없다
		// : 일종의 라이브러리 라고도 함

		Scanner sc = new Scanner(System.in);

		System.out.print("ID를 입력해 주세요 >> ");
		String user_id = sc.next();

		System.out.print("PW를 입력해 주세요 >> ");
		String user_pw = sc.next();

		System.out.print("이름를 입력해 주세요 >> ");
		String name = sc.next();

		System.out.print("점수를 입력해 주세요 >> ");
		int score = sc.nextInt();

		PreparedStatement psmt = null;
		Connection conn = null;

		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결
			// 준비물 준비
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "hr";
			String pw = "12345";

			// 2-1 Connection 객체
			conn = DriverManager.getConnection(url, username, pw);
			// 데이터베이스에 대한 모든 정보를 가지고 있는 객체
			// 데이터베이스 연결을 수행한다

			if (conn == null) {
				System.out.println("연결 실패");
			} else {
				System.out.println("연결 성공");
			}

			// 3. 쿼리문 전송
			// 회원 가입 작업
			// ID, PW, NAME, SCORE

			// insert into FULLSTACKMEMBER values ('smhrd','1234','김형진',80);
			String sql = "insert into FULLSTACKMEMBER values (?,?,?,?)";

			// ?인자 활용하기
			// 입력받은 값을 쿼리문 안에 담아주기 위한 작업

			// 3-1 준비한 쿼리문 전송 수레에 담아주기
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, user_id);
			psmt.setString(2, user_pw);
			psmt.setString(3, name);
			psmt.setInt(4, score);

			// 3-2 수레를 전달
			// insert, delete, update와 같이 데이터베이스 테이블에
			// 변경이 일어나는 쿼리문에 사용한다
			int result = psmt.executeUpdate();

			// 4. 결과값을 가지고 결과 처리
			if (result > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스 파일 못찾음");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("중복");
		} finally {
			// 반드시 마지막에는 방문하는 finally 구문 안쪽에서 자원반납

			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
