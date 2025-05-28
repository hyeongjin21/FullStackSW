<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ex02_showScope</h1>

<%
	// 조회만
	String getPage = (String)pageContext.getAttribute("pageContext");
	String getreq = (String)request.getAttribute("request");
	String getSes = (String)session.getAttribute("session");
	String getApp = (String)application.getAttribute("application");
%>

pageContext : <%= getPage %><hr>
request : <%= getreq %><hr>
session : <%= getSes %><hr>
application : <%= getApp %><hr>

</body>
</html>