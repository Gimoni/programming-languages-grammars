<%@page import="com.example.mapper.EmpMapper"%>
<%@page import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<link rel="icon" href="favicon.png">
<title>동위선택자.jsp</title>
<style type="text/css">
	h1 + p { /* h1의 형제 중 첫번째 p */
		background: red;
	}
	h1 ~ p { /* h1의 모든 p태그 형제 */
		color: blue;
	}
</style>
</head>
<body>
<h1>Hello1</h1>
<p>안녕하세요</p>
<p>저는 동위선택자 입니다.</p>


</body>
</html>