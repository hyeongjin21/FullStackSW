<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>Join 회원가입</h1>
   
   <form action="JoinController" method ="post">
      ID : <input type = "text" name ="id"> <br>
      PW : <input type = "password" name ="pw"> <br>
      NAME : <input type = "text" name = "name"> <br>
      <input type ="submit" value ="회원가입"> 
   </form>
   
</body>
</html>