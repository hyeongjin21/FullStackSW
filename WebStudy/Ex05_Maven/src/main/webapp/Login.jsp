<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login 기능</h1>
	<!-- 1. Login.jsp -> 아이디, 비밀번호를 입력받아서
			LoginController에게 요청 보내기 -->
	<form action="LoginController" method="post">
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>