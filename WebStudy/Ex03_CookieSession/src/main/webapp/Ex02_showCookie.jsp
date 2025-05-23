<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 4. 쿠키 조회
	// 서버가 따로 요청하지 않아고 Cookie는 요청이 들어올 때 request 객체에 담아서 옴
	Cookie[] cookies = request.getCookies();
	for(int i = 0;i < cookies.length;i++){
		out.print("쿠키이름 : "+cookies[i].getName()+"<br>");
		out.print("쿠키값 : "+cookies[i].getValue()+"<hr>");
	}
%>
</body>
</html>