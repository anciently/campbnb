<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertUser TEST</title>
</head>
<body>
<!-- 알아서 세팅 -->
<form action="/write" method="post">
	제목 : <input type="text" name="title"><br>
	내용 : <input type="text" name="contents" style="width:200px;height:100px;"><br>
	작성자 : <input type="text" name="writer"><br>
	비밀번호 : <input type="password" name="password"><br>
	
<input type=submit value="등록">
<input type=button value="글 목록">

</form>
</body>
</html>