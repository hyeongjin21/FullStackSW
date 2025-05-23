package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// Data Access Object : 데이터베이스에 접근하는 코드를 모아 놓은 객체

	// DB 연결 및 insert, delete, update, select 하는 코드의 모음

	// 메소드 형태로 코드를 작성

	// 데이터베이스에 연결하는 코드와 자원 반납하는 코드를 메소드화하기

	private PreparedStatement psmt = null;
	private Connection conn = null;
	private ResultSet rs = null;

	// db연결
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "hr";
			String pw = "12345";

			conn = DriverManager.getConnection(url, username, pw);

			if (conn == null) {
				System.out.println("연결 실패");
			} else {
				System.out.println("연결 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 사용한 자원을 반납하는 메소드
	private void getClose() {
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

	// 회원가입
	public int join(MemberDTO dto) {
		int result = 0;
		try {
			getConn();
			String sql = "insert into FULLSTACKMEMBER values (?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getScore());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("중복");
		} finally {
			getClose();
		}
		return result;
	}

	// 로그인
	public MemberDTO login(MemberDTO dto) {

//		MemberDTO dto = null;

		try {
			getConn();

			String sql = "SELECT * FROM FULLSTACKMEMBER WHERE id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();
			try {
				if (rs.next()) {
					dto = new MemberDTO();
					dto.setId(rs.getString("id"));
					dto.setName(rs.getString("name"));
					dto.setScore(rs.getInt("score"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return dto;
	}

	// 회원탈퇴
	public int delete(String userID, String userPW) {

		int result = 0;

		try {
			getConn();

			String sql = "DELETE FROM FULLSTACKMEMBER WHERE id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userID);
			psmt.setString(2, userPW);

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return result;
	}

	// 전체회원 조회
	public ArrayList<MemberDTO> selectAll() {

		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDTO dto = null;

		try {
			getConn();

			String sql = "SELECT * FROM FULLSTACKMEMBER";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setScore(rs.getInt("score"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}

	// 정보수정
	public int update(MemberDTO dto) {

		int result = 0;

		try {
			getConn();

			String sql = "UPDATE FULLSTACKMEMBER SET SCORE = ? WHERE id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getScore());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return result;
	}

}
