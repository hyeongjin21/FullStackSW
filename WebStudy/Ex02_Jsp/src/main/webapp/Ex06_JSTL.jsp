<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 1. 변수 선언 -->
<% int a = 10; %>
<c:set var="a" value="11"></c:set>

<%-- 2. 출력 --%>
표현식 : <%= a %><br>
JSTL : <c:out value="${a}"></c:out>

<!-- 3. if문 -->
<hr>
<c:if test="${ a%2==0 }">
	<c:out value="a는 짝수"></c:out>
</c:if>
<c:if test="${ a%2==1 }">
	<c:out value="a는 홀수"></c:out>
</c:if>
<c:set var="str" value="안녕하세요"></c:set>
str : <c:out value="${str}"></c:out>

<!-- 4. switch문 -->
<hr>
<c:choose>
	<c:when test="${ a%2==0 }">
		switch문 <c:out value="a는 짝수"></c:out>
	</c:when>
	<c:otherwise>
		switch문 <c:out value="a는 홀수"></c:out>
	</c:otherwise>
</c:choose>
<!-- 5. for문 -->
<hr>

<c:forEach var="i" begin="2" end="6" step="2">
	<c:out value="${i }"></c:out>
</c:forEach>
<hr>

<!-- 6. functions로 배열 만들기 -->
<c:set var="team" value="${fn:split('김형진,공소정,윤아연,안성민',',') }"></c:set>

<c:forEach items="${team}" var="member">
	<c:out value="${member}"></c:out>
</c:forEach>

<c:out value="${team[0]}"></c:out>

<!-- 7. functions로 길이 가져오기 -->
<hr>
<c:out value="${fn:length(team)}"></c:out><br>
<c:out value="${fn:length('안녕하세요')}"></c:out>




</body>
</html>