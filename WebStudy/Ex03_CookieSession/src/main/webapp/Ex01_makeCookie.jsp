<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> makeCookie </h1>

<%
	
	// Cookie : Client의 정보를 유지하기 위한 객체
	// 1. 저장위치 : ClientPC
	// 2. 보안 : 취약
	// 3. 자원 : Client의 자원을 사용 -> 서버에 영향X (=> 서버 부하 감소)
	// 4. 용량 : 쿠키 하나당 4KB X 300개 = 1.2MB
	// 5. 저장형식 : 텍스트로만 저장 가능
	
	// 1. Cookie객체 생성 -> new Cookie("쿠키이름","쿠키값");
	Cookie cookie = new Cookie("name","김형진");
	
	// 2. Cookie의 기한 설정
	// 양수 : 초 단위로 해당 시간만큼 쿠키를 유지
	// 음수 : 브라우저 종료 시 쿠키가 제거
	// 0 : 제거
	cookie.setMaxAge(60*60);

	// 3. 쿠키 전송
	// 쿠키는 응답할 때 전송하므로, reponse객체를 사용해서 전송
	response.addCookie(cookie);

%>

</body>
</html>