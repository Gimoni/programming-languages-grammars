<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/heart_like_love_icon.png"> 
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.css">
<script src="/webjars/bootstrap/5.2.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/jqurey.min.js"></script>
<title>home.jsp</title>
<style type="text/css">
li{
   list-style:none;
   padding-left:0px;
   }
a {
	text-decoration-line: none;
/* 	border: solid orange;
	border-radius: 35px;
	border-padding: 30px; */
}

#rabbit {
	text-align: center;
}

#jinhee:hover {
	
	color : black;

}
#jinhee {
	color: white;
}
</style>
</head>
<body>
<h1>
<span class="badge rounded-pill bg-warning" style="display:flex; height:60px; width:200px;">
Home page
</span>
</h1>

&nbsp; Login user : <sec:authentication property="name"/> <br>
 <br>
 <div id="jinhee">
&nbsp; Project creator : Jinhee Soun <br>
&nbsp; Date created : 2023/06/02 <br>
 </div>
<hr>
<div class = "row">
<div class = "col" style= "border: dashed 10px orange; padding: 30px;">
<h3>Employee</h3>
<h6>Developer Rabbit wants to be a master of Coding :)</h6>
<ul class = "row">
<li class = "col"><a href="/dept/list">Dept</a></li>
<li class = "col"><a href="/emp/list">Emp</a></li>
<li class = "col"><a href="/salgrade/list">Salgrade</a></li>
</ul>
<div id="rabbit" >
<img src="/img/dev_rabbit1.jpg" alt="dev_rabbit1" width="400px" height="400">
</div>
</div>
<div class = "col" style="border: dashed 10px orange; border-left: 30px; padding: 30px;">
<h3>World</h3>
<h6>Welcome to The Rabbit Database</h6>
<ul class = "row">
<li class = "col"><a href="/country/page/1/10">Country</a></li>
<li class = "col"><a href="/city/page/1/10">City</a></li>
<li class = "col"><a href="/language/page/1/10">Country Language</a></li>
</ul>
<div id="rabbit" >
<img src="/img/dev_rabbit3.jpg" alt="dev_rabbit1" width="400px" height="400">
</div>
<ul class = "row">
<li class = "col"><a href="/city/list">City List</a></li>
<li class = "col"><a href="/country/list">Country List</a></li>
<li class = "col"><a href="/language/list">Language List</a></li>
</ul>

</div>
</div>

</body>
</html>