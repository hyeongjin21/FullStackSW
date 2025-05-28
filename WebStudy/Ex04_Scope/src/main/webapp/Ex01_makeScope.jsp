<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ex01_makeScope</h1>

<%
	// 생성 : 객체.setAttribute("이름",Object)
	pageContext.setAttribute("pageContext", "하나의 jsp");
	request.setAttribute("request", "하나의 요청");
	session.setAttribute("session","하나의 브라우저");
	application.setAttribute("application", "하나의 어플리케이션");

	// 조회 : 객체.getAttribute("이름")
	String getPage = (String)pageContext.getAttribute("pageContext");
	String getReq = (String)request.getAttribute("request");
	String getSes = (String)session.getAttribute("session");
	String getApp = (String)application.getAttribute("application");
	
	// request객체 요청하기
	RequestDispatcher rd = request.getRequestDispatcher("Ex02_showScope.jsp");
	rd.forward(request, response);
	//response.sendRedirect("Ex02_showScope.jsp");
%>

pageContext : <%= getPage %><hr>
request : <%= getReq %><hr>
session : <%= getSes %><hr>
application : <%= getApp %><hr>

</body>
</html>