<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store"> 
<title>result.jsp</title>
</head>
<body>
<%
	var param = request.getParameterMap();
	param.forEach((k, v)-> {
		System.out.printf("%s=%s/n", k, Arrays.toString(v));
		System.out.println();
	});
	
	String name = request.getParameter("name");
	String mobile = request.getParameter("mobile");
	int age = Integer.parseInt(request.getParameter("age"));
	

%>
<h1>Your name is <%=name%> .</h1>
<h1>Your mobile number is <%=mobile%> .</h1>
<h1>You are <%=age%> years old.</h1>
<h1>Glad to meet you</h1>
<hr>
<a href="form.jsp">양식으로 이동합니다.<br> moved to the form</a><br>
<hr>
<a href="http://www.naver.com">naver</a>
</body>
</html>