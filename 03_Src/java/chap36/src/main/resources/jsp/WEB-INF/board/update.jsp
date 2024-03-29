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
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>

<title>update.jsp</title>
    <script type="text/javascript">
      function showClock(){
        var currentDate = new Date();
        var spanClock = document.getElementById('spanClock');
        var msg = "현재 시간 : ";
        if(currentDate.getHours()>12){      //시간이 12보다 크다면 오후 아니면 오전
          msg += "오후 ";
          msg += currentDate.getHours()-12+"시 ";
       }
       else {
         msg += "오전 ";
         msg += currentDate.getHours()+"시 ";
       }
 
        msg += currentDate.getMinutes()+"분 ";
        msg += currentDate.getSeconds()+"초";
 
        divClock.innerText = msg;
 
        if (currentDate.getMinutes()>58) {    //정각 1분전부터 빨강색으로 출력
          divClock.style.color="red";
        }
        setTimeout(showClock,1000);  //1초마다 갱신
      }
    </script>
</head>
<body>
<h1>Board Update 게시판 수정</h1>
<hr>
<a href="/">Home</a>
<hr>
<a href="/board/create" class="btn btn-warning">게시판 작성</a>
<hr>
  <body onload="showClock()">
    <div id="divClock" class="clock">
 
    </div>
<section class="container">
	<form action="/board/update" method="post">
		<div class="mb-3">
			<label class="form-lable mb-2" for="id">id<span>*</span></label>
			<input class="form-control"    id="id" name="id"  value="${board.id}" disabled = "disabled"/>
			<input class="form-control"    id="id" name="id"  value="${board.id}" type = "hidden"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="title">title<span>*</span></label>
			<input class="form-control"    id="title"  name="title"  value="${board.title }" disabled = "disabled" type="hidden"/>
			<input class="form-control"    id="title" name="title"  value="${board.title}" type="text" />
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="content">content<span></span></label>
			<input class="form-control"    id="content"  name="content"  value="${board.content }" disabled = "disabled" type="hidden"/>
			<input class="form-control"    id="gender"  name="content"  placeholder="${board.content}" value="${board.content}"/>
		</div>
		<div class="mb-3" >
<!-- 			<label class="form-lable mb-2" for="day" ><span></span></label> -->
<%-- 			<input class="form-control"    id="day"  name="day"  placeholder="${board.day} " value="${board.day}"  /> --%>
<%-- 			<input class="form-control"    id="day"  name="day"  placeholder="${board.day} " value="${board.day}" type="hidden"/> --%>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="writer">writer<span></span></label>
			<input class="form-control"    id="writer"  name="writer"  value="${board.writer }" disabled = "disabled" type="hidden"/>
			<input class="form-control"    id="writer"  name="writer"  placeholder="${board.writer}" value="${board.writer}"/>
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
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

</body>
</html>