package kr.smhrd.board.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity	// 이 클래스가 DB의 테이블과 매핑되어있는 엔티티임을 명시
@Table(name = "board")
public class Board {

	/*	1. num -> 게시글의 식별
	 * 	2. title
	 * 	3. writer
	 *  4. filename
	 *  5. content
	 *  6. b_data -> DB에서 자동으로 작성 날짜가 들어갈 수 있도록 설계  
	 * */
	
	// -> 테이블의 PK -> Id로 표시한다
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int num;
	
	@Column(nullable = false,length=200)
	String title;
	
	@Column(nullable = false,length=200)
	String writer;
	
	@Column(length=200)
	String filename;
	
	@Column(nullable = false,length=2000)
	String content;
	
	// 테이블의 컬럼 명과 변수명이 다르면 안되나요?
	// -> @Column 어노테이션에 name = "b_date"
	
	@Column(columnDefinition = "DATETIME DEFAULT NOW()")
	LocalDateTime b_date;
	
	// JPA ORM
	// "DATETIME DEFAULT NOW()" -> null
	
	// JPA에서 제공하는 이벤트리스너 -> entity가 테이블에 저장되기 직전에 알아서 호출되는 메소드
	@PrePersist
	public void timePersist() {
		if(b_date == null) {
			b_date = LocalDateTime.now();
		}
	}
	
}