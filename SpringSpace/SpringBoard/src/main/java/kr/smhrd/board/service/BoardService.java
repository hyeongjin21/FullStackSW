package kr.smhrd.board.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.smhrd.board.dto.BoardDTO;
import kr.smhrd.board.entity.Board;
import kr.smhrd.board.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	BoardRepository boardRepository;
	
	public List<Board> getAllBoard() {
		
		return boardRepository.findAll();
	}

	// 게시물을 등록하는 메소드 
	public BoardDTO boardWrite(BoardDTO boardDto) {
		// -> 실제 사진 저장은 우리 프로젝트 폴더에, DB에는 파일의 이름만 저장
		// 1. 요청 정보에서 파일을 가지고와서
		// -> 파일 이름 추출, 파일을 프로젝트에 저장
		
		MultipartFile file = boardDto.getFile();
		
		// 파일 이름만 추출하기
		String filename = file.getOriginalFilename();
		
		// 파일 저장 경로를 추출
		String uploadPath = new File("src/main/resources/static/upload").getAbsolutePath();
		
		// 파일 저장 -> 전달받은 파일이 존재할 때
		if(!file.isEmpty()) {
			try {
				File savePath = new File(uploadPath,filename);
				file.transferTo(savePath);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 테이블에 저장하는 데이터는 Entity의 형태로 repository에게 전달한다
		Board board = new Board();
		board.setTitle(boardDto.getTitle());
		board.setWriter(boardDto.getWriter());
		board.setContent(boardDto.getContent());
		board.setFilename(filename);
		
		// board -> boardDTO
		return BoardDTO.fromEntity(boardRepository.save(board));
		
	}
	
	public BoardDTO boardView(int num) {
		// Board board = new Board();
		
		// findById() -> 리턴타입이 Optional<>
		// java 8버전 이후로 등장 NPE (Null Point Exception을 처리하기 위해서)
		// 만약에 null 값이 발생한 경우 -> 아무런 값을 가지고 있지 않은 Option<T> 이라는 
		// 객체를 반환 할 수 있는 클래스
		Optional<Board> optionalBoard = boardRepository.findById(num);
		// 결과값이 null이 아닌 경우에만 BoardDTO로 변환하겠다.
		// optional -> .get() 메소드를 활용 실제 데이터를 꺼내와야한다.
		// return boardRepository.findById(num).map(BoardDTO::fromEntity).get();
		
		// if(optionalBoard.isPresent()) {
		// 		return BoardDTO.fromEntity(optionalBoard.get());
		// }
		// optionalBoard.orElseThrow(()-> new NullPointerException())

		// return BoardDTO.fromEntity(boardRepository.findById(num).get());
		
		return BoardDTO.fromEntity(optionalBoard.orElseThrow(()-> new IllegalArgumentException("게시글 없음")));
	}

}
