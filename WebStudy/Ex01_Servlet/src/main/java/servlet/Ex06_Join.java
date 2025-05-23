package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join")
public class Ex06_Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 0. 인코딩(문자 -> 코드) : form태그가 해당 페이지의 charset으로
		// 1. post방식 디코딩(코드 -> 문자)
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		// 2. 사용자가 입력한 데이터 꺼내오기
		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");
		String pwChk = request.getParameter("userpw_re");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String date = request.getParameter("birth");
		String[] favorite = request.getParameterValues("favorite");
		String color = request.getParameter("color");
		String introduce = request.getParameter("introduce");

		// 3. Web에 출력하기
		out.print("<style> div{background-color:"+color+";width:100px; height:25px;display:inline-block;}</style>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pw + "<br>");
		out.print("비밀번호 확인 : " + pwChk + "<br>");
		out.print("성별 : " + gender + "<br>");
		out.print("혈액형 : " + blood + "형<br>");
		out.print("생일 : " + date + "<br>");
		out.print("취미 : ");
		if (favorite == null) {
			out.print("<br>");
		} else {
			for (int i = 0; i < favorite.length; i++) {
				out.print(favorite[i] + " ");
			}
			out.print("<br>");
		}
		out.print("색깔 : " + color);
		out.print("<div></div><br>");
		out.print("하고싶은 말 : " + introduce);
	}

}
