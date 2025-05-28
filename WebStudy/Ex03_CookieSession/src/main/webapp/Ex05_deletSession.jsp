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
	// 5. session제거
	// 5-1. 특정 session 삭제
	session.removeAttribute("name");
	
	// 5-2. 전체 session 종료
	session.invalidate();

	// session삭제 후 삭제 된 것 확인하기 위해 showsession으로 이동
	response.sendRedirect("Ex04_showSession.jsp");
	
	
	
%>
</body>
</html>