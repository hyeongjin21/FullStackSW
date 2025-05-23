<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.html" %>
    <!-- 
    	지시자 : jsp가 servlet으로 변환 될 때 필요한 정보를 기술
    	1. page지시자 : jsp페이지에 대한 환경설정
    		- language : 사용할 언어
    		- contentType : 문서의 종류, 인코딩 방식 등을 지정
    		 -> response.setContentType("text/html; charset=UTF-8");
    		- import
    		- errorPage : 페이지가 오류났을 때 대신할 페이지를 지정
     -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<String> list = new ArrayList<String>();
	Random r = new Random();
%>
<%= 2/0 %>
</body>
</html>