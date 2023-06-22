<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/heart_like_love_icon.png">
<link rel="stylesheet" type="text/css" href="/css/list.css">  
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>

<title>delete.jsp</title>
</head>
<body>
<div class= "box">
<header>
<div class="container-fluid p-3 bg-dark text-white text-center">
  <div class="d-flex justify-content-front">
  	<sec:authorize access="isAnonymous()">
	<a class="hi" href="/user/login">Login</a>
	</sec:authorize>
	
	<sec:authorize access="isAuthenticated()">
	<a  class="hi" href="/user/logout">Logout</a>
	</sec:authorize>
  </div>
  <h1>Wakey Techno Wakey House</h1>
  <div class="d-flex justify-content-end">
  <p><sec:authorize access="isAuthenticated()">
&nbsp; Hello ! Login User : &nbsp; <sec:authentication property="name"/> <br>How are you today?!
</sec:authorize></p> 
  </div>
</div>
     <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
         <div class="container">
             <h2><a class="navbar-brand" href="#!"></a></h2>
             <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
             <div class="collapse navbar-collapse" id="navbarSupportedContent">
                 <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                     <li class="nav-item"><a class="nav-link" aria-current="page" href="/">Home</a></li>
                     <li class="nav-item"><a class="nav-link" href="/#wakeytech">Wakey Tech</a></li>
                     <li class="nav-item"><a class="nav-link" href="/dept/list">Dept List</a></li>
                 </ul>
             </div>
         </div>
     </nav>
</header>
<h2>Dept Delete</h2>
<section class="container">
	<form action="/dept/delete" method="post">
		<div class="mb-3">
			<label class="form-lable mb-2" for="deptno">deptno<span>*</span></label>
			<input class="form-control"    id="deptno" name="deptno" placeholder="부서번호를 입력하세요." value="${dept.deptno}" disabled ="disabled"/>
			<input class="form-control"    id="deptno" name="deptno" placeholder="부서번호를 입력하세요." value="${dept.deptno}" type="hidden"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="dname">dname<span>*</span></label>
			<input class="form-control"    id="dname"  name="dname"  placeholder="부서이름를 입력하세요." value="${dept.dname }"  disabled ="disabled"/>
			<input class="form-control"    id="dname"  name="dname"  placeholder="부서이름를 입력하세요." value="${dept.dname }"  type ="hidden"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="loc">loc</label>
			<input class="form-control"    id="loc"	   name="loc"    placeholder="부서위치를 입력하세요." value="${dept.loc}"  disabled ="disabled"/>
			<input class="form-control"    id="loc"	   name="loc"    placeholder="부서위치를 입력하세요." value="${dept.loc}"  type ="hidden"/>
		</div>
		<button type="submit" class="btn btn-dark">Submit</button>
	</form>	
</section>
<hr>
<c:if test="${binding.hasErrors()}">
<h2>Error Massage</h2>
<hr>
<c:forEach var="g" items="${binding.globalErrors}">
	<div>${g.code} ${g.defaultMessage}</div>
</c:forEach>
<hr>
<c:forEach var="f" items="${binding.fieldErrors}">
	<div>${f.field} ${f.defaultMessage}</div>
</c:forEach>

</c:if>
</div>
</body>
</html>