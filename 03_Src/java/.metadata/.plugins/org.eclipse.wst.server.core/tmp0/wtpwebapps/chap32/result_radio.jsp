<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>result_radio.jsp</title>
</head>
<body>
<h1>결과값 처리</h1>
<hr>
<% 
 	String color = request.getParameter("color");
	
	int r=0;
	int g=0;
	int b=0;

	switch(color) {
	case "red":
		r = 255;
		break;
	case "green":
		g = 255;
		break;
	case "blue":
		b = 255;
		break;
	}
%>
<div style="width:100px; height:100px; background: rgb(<%=r%>, <%=g%>, <%=b%>)"></div>
<hr>

<a href="form_radio.jsp">뒤로</a>
</body>
</html>