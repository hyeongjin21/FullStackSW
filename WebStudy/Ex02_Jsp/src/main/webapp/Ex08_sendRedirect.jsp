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
		// 1. 현재 jsp 접속 했음을 확인
		System.out.println("Ex08.jsp");

		// 2. naver페이지로 이동할 수 있도록 응답
		// 특정 작업들을 수행 후 지정한 페이지로 이동하고 싶을 때 주로 사용
		response.sendRedirect("https://www.naver.com");
	%>

</body>
</html>