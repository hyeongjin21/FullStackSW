<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>선언문 : 멤버변수, 메소드 등 글래스 영역에 선언하기 위해서 사용하는 문법</h1>
<%!
	// 합을 구하는 메소드
	public int addNum(int num1, int num2) {
		return num1 + num2;
	}
%>
<%
	// console 창에 출력
	System.out.println(addNum(1, 2));
%>
	<!-- Web에 출력 -->
	
	웹<%=addNum(1, 2)%>
	
	<% printConsole(); %>
	
	<%!
		public void printConsole(){
		System.out.println("출력");
	}
	%>
	
	

</body>
</html>