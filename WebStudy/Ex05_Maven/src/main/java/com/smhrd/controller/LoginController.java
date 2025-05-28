package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. post 방식 -> request 객체 인코딩
		request.setCharacterEncoding("UTF-8");

		// 2. 요청 정보 꺼내오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		// 3. dto 객체 설정
		Member member = new Member(id, pw);

		// 4. 데이터 베이스 접근
		String user_id = new MemberDAO().login(member);
		
		
		// 5. 로그인 성공 -> index.jsp -> 로그인 버튼 -> 로그아웃으로 변경
		//	  로그인 실패 -> login.jsp 이동
		// System.out.println(user_id);
		if(user_id == null) {
			response.sendRedirect("Login.jsp");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("id", user_id);
			
			// index.jsp -> 로그인한 유저의 id 값을 출력
			// ex) 류이수님 환영합니다.
			// Session -> id값을 유저가 가지고 있다가 요청시 포함시켜 전달한다
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user_id);
			
			rd.forward(request, response);
		}

	}

}
