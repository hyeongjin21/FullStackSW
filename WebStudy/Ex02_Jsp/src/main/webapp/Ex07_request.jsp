<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	fieldset{
		width: 350px;
	}
</style>
</head>
<body>
<!-- form태그로 전송받은 데이터들을 확인 후, 점수별로 학점을 부여해서 출력 -->
<% 
	/* response.setContentType("text/html; charset=utf-8"); */
	/* post방식 인코딩 값에 대해서 디코딩 */
	// request객체 : jsp의 내장객체 -> 따로 선언하지 않아도 사용 가능
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	// 점수 데이터는 평균점수 연산을 위해 int형 변환
	int javaScore = Integer.parseInt(request.getParameter("javaScore"));
	int pythonScore = Integer.parseInt(request.getParameter("pythonScore"));
	int WebScore = Integer.parseInt(request.getParameter("WebScore"));
	int MLScore = Integer.parseInt(request.getParameter("MLScore"));
	// 평균값 구하기
	int sum = javaScore + pythonScore + WebScore + MLScore;
	int avg = sum / 4;
	String result = "";
	if(avg==100){
		result = "A+";
	}else if(avg>=90){
		result = "A";
	}else if(avg>=80){
		result = "B";
	}else if(avg>=70){
		result = "C";
	}else{
		result = "D";
	}
%>

<fieldset>
<legend>학점 확인 프로그램</legend>
<table>
<tr><td>이름</td><td><%=name %></td></tr>
<tr><td>Java 점수</td> <td><%=javaScore%></td></tr>
<tr><td>Python 점수</td> <td><%=pythonScore%></td></tr>
<tr><td>Web 점수</td> <td><%=WebScore%></td></tr>
<tr><td>ML 점수</td> <td><%=MLScore%></td></tr>
<tr><td>평균 </td> <td><%=avg %></td></tr>
<tr><td>학점</td>  <td><%= result %></td></tr>
</table>
</fieldset>

</body>
</html>