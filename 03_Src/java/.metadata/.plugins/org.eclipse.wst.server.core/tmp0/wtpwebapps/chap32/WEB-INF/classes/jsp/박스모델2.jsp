<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script> 
<title>박스모델2.jsp</title>
<style type="text/css">

	.border-10 {
		border: 10px solid red;
	}
	.border-1 {
		border-color: red;
		border-style: dashed;
		
		border-width: 20px 5px;
	}
	.rectangle {
		width: 100px;
		height: 100px;
	}
	.p-10 {
	 /* 	padding: 10px; */
/* 	 	padding-top: 0px;
	 	padding-right: 10px;
	 	padding-bottom: 0px;
	 	padding-left: 20px; */
	 	padding: 10px 20px;
	}
	
	
</style>

</head>
<body>
<div class="rectangle border-10 p-10">box1</div>
<div class="rectangle border-10">box2</div>
<div class="rectangle border-1">box3</div>

</body>
</html>