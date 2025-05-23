package 연락처;

public class Profile {
	// 연락처 1개의 자료를 표현
	
	// 필드
	private String name;
	private String phone;
	private String group;
	private String birth;
	
	// 메소드
	// 생성자
	// - 생성자도 메소드다
	// - 메소드명이 클래스명과 동일하다
	// - 리턴타입을 지정조차 하지 않는다
	// - 기본생성자(매개변수를 아무것도 받지않는 생성자)는 생략가능하다
	// - 내가 새로운 생성자를 만들게 되면 기본생성자는 overwrite(덮어씌워짐)
	// - 메소드이기때문에 오버로딩 가능하다.
	//   (매개변수의 개수와 타입을 다르게 함으로써 중복으로 정의하는 기법)
	public Profile(String name, String phone, String group, String birth) {
		this.name = name;
		this.phone = phone;
		this.group = group;
		this.birth = birth;
	}

	// getter, setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
	
}
