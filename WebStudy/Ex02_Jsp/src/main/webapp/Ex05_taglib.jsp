<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	taglib 지시자 : 태그라이브러리를 사용하기 위한 지시자 
	ex) JSTL : Jsp에서 사용가능한 표준 태그 라이브러리 
			 : 5가지의 커스텀태그(core, functions, sql, xml,fmt)
			 : core -> 변수 선언, if/for등의 제어기능 태그
			 : functions -> 문자열을 처리하는 함수 기능 태그
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<% for(int i = 1;i<=6;i++){ %>
				<td><%= i %></td>
			<% } %>
		</tr>
	</table>
	<!-- 
		스크립트릿을 사용하려면 jsp문법과 java문법을 다 알아야만 가능 
	 	프로그래밍 언어를 배우지 않은 사람들은 알기 어렵다
	 -->
	 
	 <table border=1>
	 	<tr>
	 		<c:forEach var="i" begin="1" end="6" step="1">
	 			<td> ${ i } </td>
	 		</c:forEach>
	 	</tr>
	 </table>
	 
</body>
</html>