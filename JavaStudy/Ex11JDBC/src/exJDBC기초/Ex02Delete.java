package exJDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Delete {

	public static void main(String[] args) {

		// 1. 회원 탈퇴에 필요한 id, pw 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력해 주세요 >> ");
		String userID = sc.next();

		System.out.print("PW를 입력해 주세요 >> ");
		String userPW = sc.next();

		PreparedStatement psmt = null;
		Connection conn = null;

		// 2. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "12345";

			// 3. 데이터베이스 연결
			conn = DriverManager.getConnection(url, id, pw);

			// 4. 쿼리문 전송
			if (conn == null)
				System.out.println("연결 실패");
			else
				System.out.println("연결 성공");

			String sql = "DELETE FROM FULLSTACKMEMBER WHERE id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userID);
			psmt.setString(2, userPW);

			int result = psmt.executeUpdate();

			// 5. 결과를 이용한 작업 처리
			if (result > 0)
				System.out.println("삭제되었습니다.");
			else
				System.out.println("실패했습니다.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원반납
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
