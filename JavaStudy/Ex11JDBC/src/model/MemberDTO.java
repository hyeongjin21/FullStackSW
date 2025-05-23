package model;

public class MemberDTO {
	// model
	// DTO - Data Transfer Object -> Getter, Setter
	// -> 데이터 전송이 목적 데이터베이스 테이블과 유사한 구조를 가진다
	// VO - value Object -> Getter 메소드만 가진다.

	// 1. 필드 ( 아이디, 비밀번호, 이름, 점수 )
	private String id;
	private String pw;
	private String name;
	private int score;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
