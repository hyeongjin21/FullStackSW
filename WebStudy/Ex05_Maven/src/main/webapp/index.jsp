<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>
<!-- 유저가 로그인에 성공했는지 판별 -->

<% 
	String user = (String)session.getAttribute("loginUser");
	if(user == null){%>
<a href ="Join.jsp"><button>회원가입</button></a>
<a href="Login.jsp"><button>로그인</button></a>	
<% }else{%>
<%= user %>님 환영합니다
<a href ="Join.jsp"><button>회원가입</button></a>
<a href="Logout.jsp"><button>로그아웃</button></a>
<%} %>

</body>
</html>
