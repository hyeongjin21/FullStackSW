package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet -> 어노테이션
// Url Mapping을 하기 위해서는 @WebServlet 안쪽에 문자열 형태로 작성한다
// ** 문자열을 바꾸더라도 / <- 있어야한다. /Mapping할 문자열
@WebServlet("/myPage")
// 일반 클래스 인데 HttpServlet 클래스를 상속 받는다.
public class Ex01_requestResponse extends HttpServlet {
				// service 메소드 : Java 의 main 메소드와 같은 역할을 한다
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// service 메소드 : 매개변수 2개(request, response)
		// 1. request 객체 : 사용자가 요청을 했을 때, 요청에 대한 정보를 담고있는 객체
		// ex) 검색 -> 검색어, 로그인 -> id/pw
		
		// 실습1. 내 servlet 페이지를 요청한 사람의 ip 주소 확인하기
		// servlet : 요청에 동적으로 작동하며, html 문서(정적페이지)로 응답
		// http://192.168.219.217:8081/Ex01_Servlet/Ex01_requestResponse
		String client_ip = request.getRemoteHost();
		System.out.println(client_ip);
		
		// 2. response 객체 : 사용자에게 응답할 때 사용하는 객체
		// ex) html 문서로 응답, 다른 페이지로 응답..
		
		// 응답할 html 문서에 대한 설정
		response.setContentType("text/html; charset=utf-8");
		
		// 웹에 출력(html 코드 작성) -> PrintWriter 객체 활용
		PrintWriter out = response.getWriter();
		out.print("<h1> Hello </h1>");
		out.print("<h1> 김형진의 페이지 </h1>");
		
		// Servlet이 실행되는 위치 : webapp 폴더
		out.print("<img height='200px' src='./img/background.jpeg'>");
		
	}

}
