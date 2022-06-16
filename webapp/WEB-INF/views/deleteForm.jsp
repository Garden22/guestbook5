<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
</head>
<body>
	<h1>방명록</h1>
	<h2>삭제하기</h2>
	
	<form action="/guestbook5/delete" method="post">
		<input type="hidden" name="no" value="${no}">
		<label for="password">비밀번호 입력</label>
		<input id="password" type="text" name="password" value="">
		<button type="submit">확인</button>
	</form>
</body>
</html>