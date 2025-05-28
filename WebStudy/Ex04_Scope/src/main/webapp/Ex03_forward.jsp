<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// response.sendRedirect("이동할 페이지 주소");
	// sendRedirect방식
	//	- 요청(1)이 들어오면 이동해야할 페이지 주소를 응답(1) 
	//		이동해야할 페이지를 다시 요청(2)
	//	- 요청(request객체)이 2번이고, 서로 다른 request객체이기 때문에
	//		데이터 유지가 불가능
	//	- 데이터를 전송하고 싶으면 쿼리스트링 방식으로 Text형태의 데이터만 전송 가능
	// 		-> url주소?key=value&key=value....
	//  - 이동해야할 페이지를 새롭게 요청하는 것이라서, 다른 서버로 이동 가능
	// 	- 요청이 2번이기 때문에, 네트워크 트패릭이 발생 -> 실행속도가 상대적으로 느림
	
	RequestDispatcher rd = request.getRequestDispatcher("Ex02_showScope.jsp");
	// RequestDispatcher rd = request.getRequestDispatcher("https://www.naver.com");
	
	rd.forward(request, response);
	// forward방식
	//	- 요청(1)이 들어오면, 해당 요청(1)을 그대로 다른 페이지에게 의뢰(페이지 이동)
	// 	- 요청이 1번이고, request객체가 그대로 이동하기 때문에 데이터 유지가 가능
	//	- request객체에 setAttribute로 저장하기 때문에 Object타입으로 데이터 전송 가능
	//  - request객체가 이동을 해야해서 같은 서버로만 이동 가능
	// 	- 요청이 1번이기 떄문에, 네트워크 트래픽 발생 X -> 실행속도가 빠름
	
%>
</body>
</html>