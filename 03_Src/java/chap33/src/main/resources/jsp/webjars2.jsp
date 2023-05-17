<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="faviconAlpha.png"> 
<link rel="stylesheet" href="http://localhost:8093/webjars/bootstrap/5.2.3/css/bootstrap.css">
<script src="/webjars/bootstrap/5.2.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<title>webjars2.jsp</title>
<script>
 $(document).ready(function() {
	$('button').css('box-shadow', '10px 10px 10px red'); 
 }); 
</script>
</head>
<body>
<button>Basic</button>
<button class="btn btn-primary">Primary</button>
<button class="btn btn-secondary">Secondary</button>
<button class="btn btn-info">Info</button>
<button class="btn btn-warning">Warning</button>
</body>
</html>