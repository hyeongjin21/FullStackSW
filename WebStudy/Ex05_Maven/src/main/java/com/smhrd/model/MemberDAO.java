package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManger;

public class MemberDAO {

	// sqlSessionFactory 불러오기
	SqlSessionFactory sessionFactory = SqlSessionManger.getSqlSession();

	public int join(Member member) {
		// 1. sqlSessionFactory에서 sqlsession (== Connection) 1개 빌려오기(요청)
		// 매개변수의 true : auto Commit에 대한 설정
		SqlSession session = sessionFactory.openSession(true);
		
		// 2. session.insert("sql문장이 작성된 태그의 id", sql문장에 필요한 데이터)
		// sql문장이 작성된 태그의 id : 현재 속해있는 메소드의 이름과 동일하게 작성
		int row = session.insert("join", member);
		
		// 3. sqlsession 반납
		session.close();
		
		return row;
	}

	public String login(Member member) {
		// 1. SessionFactory에서 세션 1개 빌려오기
		SqlSession session = sessionFactory.openSession();
		// 2. select 메소드 실행하기
		Member row = session.selectOne("login",member);
		if(row == null) {
			return null;
		}
		return row.getId();
	}

	
}
