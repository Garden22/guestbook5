<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>

<body>
	<h1>방명록</h1>
	<h2>방명록 리스트</h2>
	
	<p>글 쓰던가~</p>
	<form action="/guestbook5/add" method="post">
		<table border="1" style="width: 700px">
			<colgroup>
				<col width="10%">
				<col width="40%">
				<col width="10%">
				<col width="40%">
			</colgroup>
			<tr>
				<td><label for="name">이름</label></td>
				<td><input id="name" type="text" name="name" value=""></td>
				<td><label for="password">비밀번호</label></td>
				<td><input id="passwrd" type="text" name="password" value=""></td>
			</tr>
			<tr>
				<td colspan="4"><textarea name="content" style="width: 680px; height: 200px; resize: none"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><button type="submit">등록</button></td>
			</tr>
		</table>
	</form>
	
	<br><br>
	<p>지금까지 방명록</p>
	
	<c:forEach items="${gbList}" var="visit">
		<table border="1" style="width: 700px;">
			<colgroup>
				<col width="25%">
				<col width="65%">
				<col width="10%">
			</colgroup>
			<tr>
				<td>${visit.name}</td>
				<td>${visit.regDate}</td>
				<td><a href="/guestbook5/deleteForm/${visit.no}">[삭제]</a></td>
			</tr>
			<tr>
				<td colspan="3">${visit.content}</td>
			</tr>
		</table>
		<br>
	</c:forEach>
</body>
</html>