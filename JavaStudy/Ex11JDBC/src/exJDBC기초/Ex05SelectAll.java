package exJDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex05SelectAll {

	public static void main(String[] args) {
		// 입력 받을 데이터가 없다

		// 전체 회원 조회 기능

		// ====== 전체 회원 조회 ======
		// ID 이름 점수
		// smhrd 류이수 100

		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "12345";

			conn = DriverManager.getConnection(url, id, pw);

			String sql = "SELECT * FROM FULLSTACKMEMBER";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			System.out.println("====== 전체 회원 조회 ======");
			System.out.println("ID\t이름\t점수");
			
			while (rs.next()) {
				System.out.println(rs.getString("id") + "\t" + rs.getString("NAME") + "\t" + rs.getInt("SCORE"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
