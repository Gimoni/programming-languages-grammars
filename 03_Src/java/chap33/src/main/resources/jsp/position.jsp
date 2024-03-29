<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>position.jsp</title>
<script type="text/javascript">
</script>
<style type="text/css">
html {
	border: 10px solid red;
}
body {
	border: 10px solid blue;
}
h1 {
	border: 1px solid red;
}
span {
	border: 1px solid blue;
}

.relative { 
	position: relative;
}
.rt1 {
	top: -50px;
	left: 100px;
}

.rt2 {
	right: 100px;
	bottom: 100px;
}
.rt3 {
	top: 20px;
	left: 20px;
}
.rt4 {
	right: -50px;
	bottom: +50px;
}

/* Absolute */

.absolute {
	position: absolute;
}
.ab1 {
	background: yellow;
	opacity: 0.5;
	margin: 0;
	top: 0;
	left: 0;
}
.ab2 {
	background: yellow;
	opacity: 0.5;
	margin: 0;
	right: 0;
	bottom: 0;
}
.ab3 {
	background: yellow;
	opacity: 0.5;
	top: 100px;
	right: 100px;
}
.ab4 {
	background: yellow;
	opacity:0.5;
	left: 100px;
	bottom: 100px;
}
.box1 {
	border: 50px solid purple;
	position: relative;
	height: 500px;
	padding: 50px;
	overflow : scroll;
}
.ab5 {
	background: orange;
	opacity: 0.5;
	margin: 0;
	top: 0;
	left: 0;
}
.ab6 {
	background: orange;
	opacity: 0.5;
	margin :0;
	bottom:0;
	right:0;
}
.ab7 {
	background: orange;
	opacity: 0.5;
	margin : 0;
	top: -10px;
	left: -10px;
}
.ab8 {
	background: orange;
	opacity: 0.5;
	margin : 0;
	top: 100px;
	right: -80px;
}
/* Fixed */
.fixed {
	position: fixed;
}
.fx1 {
	background: green;
	top: 200px;
	left: 200px;
}
.fx2 {
	background: green;
	right: 10px;
	bottom: 10px;
}
.fx3 {
	background: green;
	left: 0px;
	top: 0px;
}
.fx4 {
	background: green;
	top: 0;
	right: 0;
}

</style>
</head>
<body>
<h1>Position Static 1</h1>
<h1>Position Static 2</h1>
<span>Position Static 3</span>
<span>Position Static 4</span>
<img alt="" src="http://via.placeholder.com/200x200">
<hr>
<h1 class="relative rt1">Position Relative 1</h1>
<h1 class="relative rt2">Position Relative 2</h1>
<span class="relative rt3">Position Relative 3</span>
<span class="relative rt4">Position Relative 4</span>
<hr>
<h1 class="absolute ab1">Position Absolute 1</h1>
<h1 class="absolute ab2">Position Absolute 2</h1>
<span class="absolute ab3">Position Absolute 3</span>
<span class="absolute ab4">Position Absolute 4</span>
<hr>
<div class="box1">
<h1 class="absolute ab5">Position Absolute 5</h1>
<h1 class="absolute ab6">Position Absolute 6</h1>
<span class="absolute ab7">Position Absolute 7</span>
<span class="absolute ab8">Position Absolute 8</span>
</div>
<hr>
<h1>Position Fixed</h1>
<h1 class="fixed fx1">Position Fixed 1</h1>
<h1 class="fixed fx2">Position Fixed 2</h1>
<span class="fixed fx3">Position Fixed 3</span>
<span class="fixed fx4">Position Fixed 4</span>


</body>
</html>