package kr.smhrd.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import kr.smhrd.myapp.entity.Member;
import kr.smhrd.myapp.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	@GetMapping("/")
	public String JoinPage() {
		return "JoinPage";
		// 우리가 원하는 JoinPage
		// -> webapp/WEB-INF/views/JoinPage.jsp
		
		// 지금 세팅에서 Spring이 검색해서 찾는 페이지
		// -> src/main/resources/JoinPage.html
	}
	
	@PostMapping("/joinController")
	public String joinController(Member member) {
		System.out.println("joinController");
		System.out.println(member);
		int result = memberService.joinMember(member);
		if(result > 0) {
			System.out.println("가입 완료");
		}else {
			System.out.println("가입 실패");
		}
		return "JoinPage";
	}
	
}
