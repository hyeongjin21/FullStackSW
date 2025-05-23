package exJDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. ID, PW -> 점수를 수정할 수 있도록 Score
		System.out.print("ID를 입력해 주세요 >> ");
		String userID = sc.next();

		System.out.print("PW를 입력해 주세요 >> ");
		String userPW = sc.next();

		System.out.print("변경 할 점수를 입력하세요 >> ");
		int updateScore = sc.nextInt();

		PreparedStatement psmt = null;
		Connection conn = null;

		// 2. 드라이버 로딩 ( 동적 로딩 )
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "12345";

			// 3. 데이터베이스 연결
			conn = DriverManager.getConnection(url, id, pw);
			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}
			// 4. 쿼리문 전송 (쿼리문 작성)
			String sql = "UPDATE FULLSTACKMEMBER SET SCORE = ? WHERE id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, updateScore);
			psmt.setString(2, userID);
			psmt.setString(3, userPW);

			int result = psmt.executeUpdate();
			// 5. 결과를 이용한 작업 처리

			if (result > 0) {
				System.out.println("업데이트 완료");
			} else {
				System.out.println("업데이트 실패");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원 반납
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
