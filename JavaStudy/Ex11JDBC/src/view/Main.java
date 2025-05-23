package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {

		// 디자인 패턴 : 계속 반복적인 문제가 발생해서 이 문제를 해결하고자,
		// 코드 작성의 형식, 규칙을 지정해 놓은 것

		// MVC 디자인 패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드의 모음
		// View : 사용자에게 보여지는, 사용자가 조작하는 코드의 모음
		// Controller : 실제로 기능이 일어나는 부분, 모델과 뷰를 이어주는 역할도 함

		System.out.println("==== SMHRD 회원 관리 프로그램 ====");

		// [1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원 조회 [5]회원정보 수정
		// 1 ~ 5 이외의 숫자를 입력하면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원 조회 [5]회원정보 수정");
			int selectNum = sc.nextInt();
			if (selectNum == 1) {
				System.out.println("====== 회원가입 ======");

				System.out.print("ID를 입력해 주세요 >> ");
				String user_id = sc.next();

				System.out.print("PW를 입력해 주세요 >> ");
				String user_pw = sc.next();

				System.out.print("이름를 입력해 주세요 >> ");
				String name = sc.next();

				System.out.print("점수를 입력해 주세요 >> ");
				int score = sc.nextInt();

				MemberDAO dao = new MemberDAO();
				MemberDTO dto = new MemberDTO();
				dto.setId(user_id);
				dto.setPw(user_pw);
				dto.setName(name);
				dto.setScore(score);
				int result = dao.join(dto);
				
				if (result > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}
				

			} else if (selectNum == 2) {
				System.out.println("======= 로그인 =======");

				System.out.print("ID를 입력해 주세요 >> ");
				String userID = sc.next();

				System.out.print("PW를 입력해 주세요 >> ");
				String userPW = sc.next();

				MemberDAO dao = new MemberDAO();
				MemberDTO dto = new MemberDTO();
				dto.setId(userID);
				dto.setPw(userPW);
				dto = dao.login(dto);
				
				if(dto != null) {
					System.out.println(dto.getName()+"님 환영합니다.");
				}else {
					System.out.println("로그인에 실패 했습니다.");
				}


			} else if (selectNum == 3) {
				System.out.println("====== 회원탈퇴 ======");

				System.out.print("ID를 입력해 주세요 >> ");
				String userID = sc.next();

				System.out.print("PW를 입력해 주세요 >> ");
				String userPW = sc.next();
				
				// 데이터베이스에 접근해서 Delete문 실행하기
				// DAO -> 데이터베이스 접근 기능을 가진 객체
				MemberDAO dao = new MemberDAO();
				int result = dao.delete(userID,userPW);

				if (result > 0)
					System.out.println("삭제되었습니다.");
				else
					System.out.println("실패했습니다.");

			} else if (selectNum == 4) {
				System.out.println("====== 전체 회원 조회 ======");
				System.out.println("ID\t이름\t점수");
				
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.selectAll();
				for(MemberDTO m : list)
					System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getScore());

			} else if (selectNum == 5) {
				System.out.println("==== 회원정보 수정 ====");

				System.out.print("ID를 입력해 주세요 >> ");
				String userID = sc.next();

				System.out.print("PW를 입력해 주세요 >> ");
				String userPW = sc.next();

				System.out.print("변경 할 점수를 입력하세요 >> ");
				int updateScore = sc.nextInt();
				
				// 1. dao 객체 생성
				MemberDAO dao = new MemberDAO();
				
				// 2. 데이터 바인딩
				MemberDTO dto = new MemberDTO();
				dto.setId(userID);
				dto.setPw(userPW);
				dto.setScore(updateScore);
				
				int result = dao.update(dto);
				
				if(result > 0)
					System.out.println("정보가 수정되었습니다.");
				else
					System.out.println("수정하지 못하였습니다.");

			} else {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
		}

	}

}
