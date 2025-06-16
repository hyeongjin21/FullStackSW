package kr.smhrd.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.myapp.entity.Member;
import kr.smhrd.myapp.mapper.MemberMapper;

@Service
public class MemberService {
	
	// Controller에게 요청 정보를 전달받아 비지니스 로직을 작성하는 구간
	
	@Autowired
	MemberMapper mapper;
	
	
	public int joinMember(Member member) {
		
		// 회원가입을 하기 위해 mapper를 호출하고
		// 결과값을 되돌려 받아 controller에게 전달
		
		System.out.println("MemberService");
		System.out.println(member);
		int result = mapper.memberJoin(member);
		return result;
	}
}
