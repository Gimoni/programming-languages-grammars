<%@page import="util.Color"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store"> 
<title>alpha2.jsp</title>
</head>
<body>
<%
// 스크립트릿(Scriptlet)
	Random r = new Random();
	for(int i=0; i<40; i++) {
		Color fg;
		Color bg;
		do{
			fg = Color.values()[r.nextInt(8)];
			bg = Color.values()[r.nextInt(8)];
		}while(fg==bg);
		char ch = (char)r.nextInt('A','Z'+1);
		
%>
<span style="background-color:<%=bg%>; color:<%=fg%>;>"s><%=ch%></span>
<%
		//out.println(String.format("<span>%c</span>\n", ch));
	}
		

%>

</body>
</html>