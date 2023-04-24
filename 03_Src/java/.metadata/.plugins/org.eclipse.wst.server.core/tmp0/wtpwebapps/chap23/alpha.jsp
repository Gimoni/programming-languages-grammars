<%@page import="com.example.model.Alpha"%>
<%@page import="util.Color"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store"> 
<title>alpha.jsp</title>
<style type="text/css">
	span {
		font-family: monospace;
		font-size: 20pt;
		line-height: 100%
	}

</style>
</head>
<h1>Alpha Generator</h1>
<table>
	<tbody>
		<tr>
			<td>만든이 :</td>		
			<td>손진희</td>		
		</tr>
		<tr>
			<td>작성일 :</td>		
			<td>2023/04/21</td>		
		</tr>
		<tr>
			<td>과 목 :</td>		
			<td>JSP</td>		
		</tr>
	</tbody>
</table>
<body>
<hr>

<%
	Random r = new Random();
/* 	int[] line = new int[100];
	int[] column = new int[100]; */
	
	Integer line = 10;
	try {		
	line = Integer.parseInt(request.getParameter("line"));
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	Integer column = 10;
	try {		
	column = Integer.parseInt(request.getParameter("column"));
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	if (line==null)
		line=10;
	if (column==null)
		column=10;

%>
<form action="alpha.jsp">
	<label for= "line"> line :</label>
	<input id="line" name="line" type="number" min="1" max ="100"  size="5" value=<%=line%>> 
	<label for= "column"> column :</label>
	<input id="column" name="column" type="number" min="1" max ="100"  size="5" value=<%=column%>>
	<input type="submit" value="Submit">
</form>
<hr>

	
<%
	for(int i=0; i<line; i++) {
		for(int j=0; j<column; j++) {
			Alpha a = new Alpha();
			Color fg = a.getFg();
			Color bg = a.getBg();
			char ch = a.getCh();
			
			String span = 
			String.format("<span style=\"background-color:%s; color:%s;\">%c</span>", bg, fg, ch);
			out.print(span);
		}
		out.print("<br>");
	}
%>
</body>
</html>







