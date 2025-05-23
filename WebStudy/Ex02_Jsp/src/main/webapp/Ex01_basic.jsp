<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 덧셈의 결과 </h1>
	<%
		// 스크립트릿 : Jsp문서 내에 Java코드를 작성하기 위한 문법
		int a = 3;
		int b = 10;
		int result = a + b;
		System.out.println("a+b"+result);
	%>
	<!-- 표현식 : 동적인 데이터를 Web에 출력하기 위해 사용하는 문법 -->
	a+b의 결과 : <%= result %>
	
	<hr>
	<h1> 1 ~ 100까지의 합</h1>
	<%
		int sum = 0;
		for(int i = 1;i <=100;i++){
			sum += i;
		}
	%>
	1 ~ 100까지의 합은 <%= sum %>입니다.
	
	<hr>
	<table border=1>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
		</tr>
	</table>
	<table border=1>
		<tr>
			<% for(int i = 1;i<=6;i++){ %>
				<td><%= i %></td>
			<% } %>
		</tr>
	</table>
	<table border=1>
		<tr>
			<% for(int i = 1;i<=6;i++){ 
				out.print("<td>"+i+"</td>");
			} %>
		</tr>
	</table>
	
</body>
</html>