<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>form_radio.jsp</title>
</head>
<body>
<h1>From radio 실습</h1>
<hr>
<form action="result_radio.jsp" method="get">
	<input name="id" type="hidden" value="box">
	<label>red</label>
	<input name="color" type="radio" value="red">
	<label>green</label>
	<input name="color"type="radio" value="green">
	<label>blue</label>
	<input name="color"type="radio" value="blue" checked="checked">
	<input type="submit" value="submit"> 
</form>

</body>
</html>