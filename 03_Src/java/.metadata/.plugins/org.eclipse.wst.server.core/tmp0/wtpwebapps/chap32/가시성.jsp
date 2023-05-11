<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>가시성.jsp</title>
<style type="text/css">
	div, span {
		border: 1px solid red;
	}
	span {
		font-size: 20px;
	}
	.box1 {
		width : 100px;
	}
	
	.box2 {
		width : 100px;
		height : 100px;
	}
	.span1 { /* 적용안됨. */
		width: 100px;
		height: 100px;
	}
	.span2 {
		border: 10px solid blue;
		padding: 10px;
	}
	.span3 {
		display: inline-block;
		width: 100px;
		height: 100px;
	}
	.span4, .box4 {
		display: none;
	}
	
</style>
</head>
<body>
<div class="box1">box1</div>
<div class="box2">box2</div>
<div class="box3">box3</div>
<div class="box4">box4</div>
<hr>
<span class="span1">inline1</span>
<span class="span2">inline2</span>
<span class="span3">inline3</span>
<span class="span4">inline4</span>
</body>
</html>