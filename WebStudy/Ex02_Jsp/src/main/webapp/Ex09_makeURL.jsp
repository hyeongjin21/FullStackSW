<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function openNewTab(urlPage){
		window.open(urlPage,"_blank");
	}
</script>
</head>
<body>
	<%
	String urlPage = request.getParameter("page");
	String url = "";
	String mainPage = "http://localhost:8081/Jsp/Ex09_makeURL.html";
	if (urlPage.equals("naver")) {
		url = "https://www.naver.com";
	} else if (urlPage.equals("google")) {
		url= "https://www.google.com";
	} else if (urlPage.equals("youtube")) {
		url = "https://www.youtube.com";
	} else {
		response.sendRedirect(mainPage);
	}
	%>
<script>
	const sendUrl = "<%= url %>";
	openNewTab(sendUrl);
</script>
</body>
</html>