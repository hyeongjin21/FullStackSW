package com.smhrd.database;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManger {

	// SqlSessionManger : SqlSessionFactory를 관리하는 클래스
	// SqlSession == Connection
	
	// mybatis의 역할 : SQL매핑, DB연결을 "미리" 진행
	// DB연결하는 부분이 자원소모가 가장 크다 => 정능저하
	// 성능 향상을 위해 미리 connection 객체를 만들어놓고 빌려쓰고 반납하는 형식
	// connection객체를 재사용
	
	// static 블록 : 클래스가 로딩 된 후 무조건 실행되는 블록
	static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			// mybatis - config.xml => mybatis 환경설정 파일
			// resource -> mybatis-config.xml의 경로
			String resource = "com/smhrd/database/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// 환경설정 파일을 읽어서 sqlSessionFactory를 생성
			sqlSessionFactory =
					new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	// DAO에서 sqlSessionFactory를 사용할 수 있도록 getter 메소드 생성
	public static SqlSessionFactory getSqlSession() {
		return sqlSessionFactory;
	}
	
}
