package kr.smhrd.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.smhrd.board.dto.BoardDTO;
import kr.smhrd.board.entity.Board;
import kr.smhrd.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	// 게시글 작성 페이지로 이동하는 메소드
	@GetMapping("/goBoardWrite")
	public String goBoardWrite() {
		return "BoardWrite";
	}
	
	// 게시글 업로드하는 컨트롤러
	@PostMapping("/BoardWrite")
	public String BoardWrtie(BoardDTO boardDto) {
		
		// 1. Board -> 게시글의 정보를 저장 할 수 이는 객체
		// -> Board -> Entity 
		
		// 2. 주고 받는 데이터는 전부 DTO로 처리
		// -> boardDto -> view에서 전달한 모든 데이터를 가지고 있는 객체
		
		BoardDTO result = boardService.boardWrite(boardDto);
		
		if(result != null) {
			System.out.println("[게시글 업로드 성공]");
		}else {
			System.out.println("[게시글 업로드 실패]");
		}
		
		return"redirect:/";
	}
	
	// 상세 게시글을 불러올 수 있는 goBoardDetail
	@GetMapping("/goBoardDetail")
	public String goBoardDetail(Model model, BoardDTO baordDto) {
		BoardDTO result = boardService.boardView(baordDto.getNum());
		System.out.println(result);
		model.addAttribute("detail",result);
		return "BoardDetail";
	}
	
	@GetMapping("/")
	public String goBoardMain(Model model) {
		
		// Main페이지가 로드 되는 순간 DB에서 게시글 정보를 가지고 온다
		
		// 1. model 객체 가지고 오기 -> model 객체 안에서 내용을 화면에 보내준다.
		
		// 2. Board -> 1개의 게시글에 대한 정보 -> 5개의 Board 객체
		// num, 작성자, 글 제목, 시간
		
//		Board board1 = new Board();
//		board1.setNum(1);
//		board1.setWriter("홍길동");
//		board1.setTitle("글 제목1");
//		board1.setB_data("10:44");
//		Board board2 = new Board(2,"아무개","글 제목2","10:45");
		
		// 3. List 안에 Board 객체 5개를 저장
		
//		List<Board> list = new ArrayList<Board>();
//		list.add(board1);
//		list.add(board2);
//		list.add(new Board(3,"아무개","글 제목3","10:46"));
//		list.add(new Board(4,"아무개","글 제목4","11:20"));
//		list.add(new Board(5,"아무개","글 제목5","12:20"));
		
		// 4. model 안에 "boardlist" 라는 이름으로 list를 저장
//		model.addAttribute("boardList",list);

		// ----------------------------------------------------
		
		// Main페이지가 로드 되는 순간 DB에서 게시글 정보를 가지고 온다
		
		// 1. 로직을 수행할 수 있는 Service 객체 호출
		List<Board> list = boardService.getAllBoard();
		
		model.addAttribute("boardList",list);
		
		return "BoardMain";
		// templates/BoardMain.html
		// 별다른 추가 설정이 필요하지 않다.
	}
	
	
}
