package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Ex05_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// 로그인 요청 처리를 위해서 데이터 확인하기
		// post 방식의 요청일 때는 추가로 데이터를 꺼내오기 전에 인코딩이 필요하다
		request.setCharacterEncoding("UTF-8");
		
		// 1. 요청 데이터 꺼내오기
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		System.out.println(id+":"+pw);
	}

}
