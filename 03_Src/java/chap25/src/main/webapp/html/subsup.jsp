<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>subsup.jsp</title>
</head>
<body>
<h1>sub/ sup 실습</h1>
<p>
	10<sup>2</sup> = <b><%=Math.pow(10, 2) %></b>
</p>
<p>
	log<sub>10</sub>(100) = <i><%=Math.log10(100)%></i>
</p>
<p>
	<ins>취소선</ins>><del>deprecated</del>
</p>

<i>
<h1>Hello</h1>
</i>

<h1><i>Hello</i></h1>
<h1><del>Hello</del></h1>


</body>
</html>