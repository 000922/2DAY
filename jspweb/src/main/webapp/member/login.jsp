<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 로그인 페이지 </h3>
	<from action="/jspweb/member/login" method="post">
		아이디 : <input type="text" name="mid">			<br>
		비밀번호 : <input type="text" name="mpassword">	<br>
		<input type="submit" value="로그인">
	</from>


</body>
</html>
