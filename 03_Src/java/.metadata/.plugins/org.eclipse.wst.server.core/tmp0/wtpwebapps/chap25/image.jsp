<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>image.jsp</title>
<script type="text/javascript">
window.onload = function() {
	let img = document.querySelector('img');
	
	img.onclick = function(e) {
		let width = parseInt(Math.random()*500 + 100);
		let height = parseInt(Math.random()*500 + 100);
		let url = `http://via.placeholder.com/\${width}x\${height}`;
		this.src = url;
		console.log(e);
	}
}
</script>
</head>
<body>
<h1>Img 실습</h1>
<hr>
<!-- 인라인 태그 이벤트 모델 -->
<img alt="xxxx" src="" onkeydown="console.log(event); console.log(this)" tabindex="0">
</body>
</html>