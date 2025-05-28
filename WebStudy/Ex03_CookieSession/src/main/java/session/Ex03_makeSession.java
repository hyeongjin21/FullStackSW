package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Ex03_makeSession")
public class Ex03_makeSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Session : Client의 정보를 유지하는 객체
		// 1. 저장위치 : ServerPC
		// 2. 보안 : 강력
		// 3. 자원 : Server의 자원을 사용 -> 남발X
		// 4. 용량 : Server가 허용하는 한 제한 X
		// 5. 저장형식 : Object -> 모든 객체 저장 가능
		
		// 1. Session객체 생성
		HttpSession session = request.getSession();
		
		// 2. session객체에 데이터 저장
		// session.setAttribute(name,값);
		// session에는 Object타입으로 저장 -> 모든객체
		// session의 name이 겹치면 덮어쓰기
		session.setAttribute("name", "김형진");
		session.setAttribute("classname", "풀스택");
		
		// 3. session의 유효기간 설정
		session.setMaxInactiveInterval(60*60);
		
		response.getWriter().print("<h1>MakeSession</h1>");
		
	}

}
