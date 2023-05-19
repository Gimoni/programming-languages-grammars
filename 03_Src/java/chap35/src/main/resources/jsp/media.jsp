<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/heart_like_love_icon.png"> 
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.css">
<script src="/webjars/bootstrap/5.2.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<title>media.jsp</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Dongle:wght@700&family=Exo&family=Jua&family=Single+Day&family=Stylish&display=swap');
</style>
<style type="text/css">
body {
	border: 10px solid red;
	background: blue;
	height: 300px;
}

@media(min-width: 500px) {
	body {
		background: yellow;
	}

}
@media(min-width: 700px) {
	body {
		background: black;
	}
	h1 {
		color: white;
	}

}
@media(min-width: 900px) {
	body {
		background: purple;
	}
	h1 {
		color: white;
	}

}
</style>
</head>
<body style="font-family: ">
<h1>Media Query 실습</h1>
</body>
</html>