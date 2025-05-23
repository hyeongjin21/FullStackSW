package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03_getName")
public class Ex03_getName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		// 요청 처리
		
		// 1. 요청 데이터 꺼내오기
		String name = request.getParameter("inputName");
		// String -> int로 변환
		// Integer.parseInt(String data);
		int age = Integer.parseInt(request.getParameter("inputAge"));
		
		out.print("제 이름은 " + name + "입니다<br>");
		out.print("제 나이는 "+age+"살입니다");
	}

}
