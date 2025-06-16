package kr.smhrd.myapp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import kr.smhrd.myapp.entity.Member;

@Mapper
public interface MemberMapper {

	@Insert("insert into fullstackmember values(#{email},#{pw},#{tel},#{address})")
	public int memberJoin(Member member);
	
}
