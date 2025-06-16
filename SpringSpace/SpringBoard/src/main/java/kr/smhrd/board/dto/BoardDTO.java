package kr.smhrd.board.dto;

import java.time.LocalDateTime;

import org.springframework.web.multipart.MultipartFile;

import kr.smhrd.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

	// Entity 클래스는 원칙적으로 Model의 역할을 수행한다.
	// -> Controller에서 Board의 형태로 데이터를 전달 받는 것은 서비스 전반에 테이블 구조를
	//    노출 시키는 행위
	
	// DTO 클래스는 데이터를 전송하고, 가공하는 행위를 수행
	
	private int num;
	@NonNull
	private String title;
	@NonNull
	private String writer;
	@NonNull
	private String content;
	private String filename;
	private MultipartFile file; // 파일 업로드를 위한 형태
	private LocalDateTime b_date; // 시간을 표시하기위한 형태
	
	// 데이터베이스에 접근하고 나서 결과물 Entity를 바로 DTO로 변환하는 메소드
	public static BoardDTO fromEntity(Board board) {
		return BoardDTO.builder()
				.num(board.getNum())
				.title(board.getTitle())
				.writer(board.getWriter())
				.filename(board.getFilename())
				.content(board.getContent())
				.b_date(board.getB_date())
				.build();
	}
	
}
