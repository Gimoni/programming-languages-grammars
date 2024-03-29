<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/heart_like_love_icon.png"> 
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.css">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<script src="/webjars/jquery/jquery.min.js"></script>
<title>login.jsp</title>
<style type="text/css">
	body {
		margin: 50px;
		text-align: center;
		position: fixed;
		height: 600px;
		width: 600px;
		border: 5px solid black;
		
	}
	body:hover {
		margin-top: 100px;
		text-align: center;
		height: 650px;
		widht: 650px;
		border: 10px dashed gray;
		transition: 3s;
	}
	form {
		
	}
	div {
		height : 200px;
		width : 200px;
		background-image: url("/img/face_grin_tongue_icon.png");
		background-size: 200px;
		margin : 0 auto;
	}
	div:hover {
		height : 400px;
		width : 400px;
		background-image: url("/img/face_grin_tongue_icon.png");
		background-size: 200px;
		
		margin : 0 auto;
		transition: 5s;
	}
	

	h1, input {
		margin : 4px;
		font-family: 'Kanit', sans-serif;
	}
</style>
</head>
<body>
<h1>Login page</h1>
<form action="/login" method="post">

<input name="username" type="text" placeholder="USERNAME"><br>

<input name="password" type="password" placeholder="PASSWORD"><br>
<input type="submit" value="LOGIN">
</form>
<hr>
<div>
</div>
<hr>
</body>
</html>