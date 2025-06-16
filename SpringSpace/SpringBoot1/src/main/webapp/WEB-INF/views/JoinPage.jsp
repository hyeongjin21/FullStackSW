<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Controller에 요청을 보낼 수 있도록 form 태그 작성하기 -->
	<!-- 4개의 데이터 email, pw, tel, address -->
	<form action="joinController" method="post">
		<p>
			email : <input name="email" type="text">
		</p>
		<p>
			pw : <input name="pw" type="password">
		</p>
		<p>
			tel : <input name="tel" type="text">
		</p>
		<p>
			address : <input name="address" type="text">
		</p>
		<p>
			<input type="submit">
		</p>
	</form>



</body>
</html>