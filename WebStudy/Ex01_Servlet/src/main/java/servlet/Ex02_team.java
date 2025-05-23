package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02_team")
public class Ex02_team extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] ipList = { "192.168.219.46", "192.168.219.71", "192.168.219.141",
				"192.168.219.217", "0:0:0:0:0:0:0:1" };
		String client_ip = request.getRemoteHost();
		// http://192.168.219.217:8081/Ex01_Servlet/Ex02_team
		System.out.println(client_ip);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		boolean isIpCheck = false;

		for (String ip : ipList) {
			if (ip.equals(client_ip)) {
				isIpCheck = true;
			}
		}
		if (isIpCheck) {
			out.print("<h1> 환영합니다 </h1>");
			out.print("<img height='150px' src='./img/welcome.jpeg'>");
		} else {
			out.print("<h1> 잘못들어왔습니다 </h1>");
			out.print("<img height='200px' src='./img/nope.jpeg'>");
		}

	}

}
