package exJDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Login {

	public static void main(String[] args) {

		// 1. id, pw 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력해 주세요 >> ");
		String userID = sc.next();

		System.out.print("PW를 입력해 주세요 >> ");
		String userPW = sc.next();

		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;

		// 2. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "12345";

			// 3. 데이터베이스 연결
			conn = DriverManager.getConnection(url, id, pw);

			if (conn == null)
				System.out.println("연결 실패");
			else
				System.out.println("연결 성공");

			// 4. 쿼리문 전송
			String sql = "SELECT * FROM FULLSTACKMEMBER WHERE id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userID);
			psmt.setString(2, userPW);

			rs = psmt.executeQuery();
			// ResultSet rs = psmt.executeQuery();
			// ResultSet : select 문의 결과 값으로
			// 조회된 데이터를 테이블의 형태로 가져온다.
			// cusor를 가지고 있다 -> 초기에 컬럼 명을 가리키고 있다

			// 5. 결과를 이용한 작업 처리
			if (rs.next()) {
				System.out.println(rs.getString("id") + " 님 환영합니다");
				System.out.println("이름 : " + rs.getString("name") + " 점수 : " + rs.getInt("score"));
			} else {
				System.out.println("로그인에 실패 했습니다.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원반납
			try {
				if (rs != null)
					rs.close();
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
