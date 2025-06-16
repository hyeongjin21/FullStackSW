package kr.smhrd.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.smhrd.board.entity.Board;

// @Repository -> mabatis에서 mapper.interface의 기능을 수행함

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer>{
	
	// JPA = ORM(object relational massing) ->  객체 중심으로 설계
	
	// JpaRepository<T,ID>
	// T : 사용하는 테이블의 entity 자료형을 명시
	// ID : entity 의 ID 필드의 자료형(
	
	// Interger -> wrapper
	// 데이터를 사용하다 보면 기본 자료형 만으로는, 처리할 수 없는 작어업이 발생
	// 기본 자료형들을 클래스의 형태로 변환하는, 즉 감싸주는 클래스
	
	// mybatis가 가지고 있던 서비스 흐름
	// controller -> service -> mapper interface ->
	
	// JPA Entity 를 기준으로 interface의 추상 메소드를 상속받아 쿼리문까지 직접 구현한다
	
}
