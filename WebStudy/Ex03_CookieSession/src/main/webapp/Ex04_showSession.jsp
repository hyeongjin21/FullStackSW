<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ShowSession</h1>

<%
	// 4. Session조회
	// Object tpye으로 넘어오기 때문에 (String)으로 형변환 시켜서 저장
	// session도 내장객체이기 때문에 선언하지 않아도 사용 가능하다
	String name = (String)session.getAttribute("name");
%>

<%= name %>
${name}
<!-- jsp내에서 변수에 담아 사용하지 않아도 session에 저장된 값으로 사용 가능
	단. session의 값을 담는 코드를 한번 실행해야한다
-->
${classname}

</body>
</html>