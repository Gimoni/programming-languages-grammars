<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>result_alpha2.jsp</title>
</head>
<body>
<h1>Result_Alpha2 결과 실습</h1>
<hr>
<% 
	String fg2 = request.getParameter("fg2");
	String bg2 = request.getParameter("bg2");
%>
<h3>fg =[<%=fg2%>]</h3>
<h3>bg =<%=bg2%></h3>
<div style="width:100px; height:100px; color:<%=fg2%>; background:<%=bg2%>;"> Hello </div>
<hr>
<a href="form_alpha2.jsp">뒤로</a>
<hr>
<table border="1">
	<thead>
		<tr><th>name</th><th>value</th></tr>
	</thead>
	<tbody>
		
<% 
	var parms = request.getParameterMap();
	for (var entry : parms.entrySet()) {
		String row = "<tr><td>%s</td><td>%s</td></tr>";
		out.println(String.format(row, entry.getKey(), Arrays.toString(entry.getValue())));
	}
%>
	</tbody>
</table>
</body>
</html>