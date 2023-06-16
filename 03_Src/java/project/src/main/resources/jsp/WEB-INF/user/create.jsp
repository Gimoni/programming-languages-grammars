<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/heart_like_love_icon.png"> 
<link rel="stylesheet" href="/css/create.css" type="text/css"/>
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>

<title>create.jsp</title>

</head>

<body>
<div id="bigdiv">
<div id="seconddiv">
<h6><span class="badge bg-secondary">User Create</span></h6>
<section class="container">
	<form action="/user/create" method="post">
<button type="button" class="btn btn-light">
<a class="an" href="/" >HOME</a>
</button>
<hr id="nonhr">
	<h1 align="center">Sign in</h1>
<hr id="nonhr">
	<div class = "row">	
		<div class="col-md-2">
			<label class="form-lable mb-2" 
			for="id">id<span>*</span></label>
		</div>
		<div class="col-md-10">
			<input class="form-control" 
			id="id" name="id" 
			placeholder="id" 
			value="${param.id}"/>
		</div>
	</div>
	<div class= "row">
		<div class="col-md-2">
			<label class="form-lable mb-2" 
			for="password">password<span>*</span></label>
		</div>
		<div class="col-md-10">
			<input class="form-control"   
			 id="password"  name="password" 
			  placeholder="password" 
			  type="password" value="${param.password }"/>
		</div>
	</div>
	<div class= "row">
		<div class="col-md-2">
			<label class="form-lable mb-2" 
			for="name">name<span>*</span></label>
		</div>
		<div class="col-md-10">
			<input class="form-control"   
			 id="name" name="name" 
			 placeholder="name" value="${param.name}"/>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2">
			<label class="form-lable mb-2" 
			for="mobile">mobile <span>*</span></label>
		</div>
		<div class="col-md-10">
			<input class="form-control"   
			 id="mobile"  name="mobile"  
			 placeholder="mobile" value="${param.mobile }"/>
		</div>
	</div>
		<hr id="nonhr">
		<hr>
		<div class = "row">
		<div class= col-sm-2>
			<button type="submit" 
			class="btn btn-primary">Submit</button>
		</div>
		<div class= col-sm-2>
		<button type="button" 
		class="btn btn-warning">
		<a class="an" href="/user/login">
		Login<a/></button>
		</div>
		</div>
	</form>	
</section>
<span style="color: red;"> ${param.message}</span>
<c:if test="${exception ne null}">
	<h1>${exception.message}</h1>
</c:if>
<c:if test="${binding.hasErrors()}">
<hr>
<h2>Error Massage</h2>
<hr>
<c:forEach var="g" items="${binding.globalErrors}">
	<div>${g.code} ${g.defaultMessage}</div>
</c:forEach>

<c:forEach var="f" items="${binding.fieldErrors}">
	<div>${f.field} ${f.defaultMessage}</div>
</c:forEach>

</c:if>
</div>
</div>
</body>
</html>