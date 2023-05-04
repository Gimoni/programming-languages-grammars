<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<script src="js/alphaself.js"></script>
<style type="text/css">
input[type='range'] {
	display: block;
	width: 100%;
}
div {
	border: 20px solid black;
	font-family: fantasy;
}
ol {
	border: 20px solid red;

}
</style>
<title>alphaself.jsp</title>
</head>
<body>
<h1>Form 실습</h1>
<hr>
<form name="alpha">
<fieldset name="position">
	<legend>Position</legend>
	<input name="line" type="range" min="1" max="20">
	<input name="column" type="range" min="1" max="40">
</fieldset>
<fieldset name="color">
	<legend>Color</legend>
	<label>Foreground</label>
	<select name="fg">
		<option value="red">Red</option>
		<option value="green">Green</option>
		<option value="blue">Blue</option>
	</select>
	<label>Background</label>
	<select name="bg">
		<option value="red">Red</option>
		<option value="green">Green</option>
		<option value="blue">Blue</option>
	</select>
</fieldset>
<fieldset name="character">
	<legend>Character</legend>
	<table border="1">
		<tbody>
			<tr><th>A</th><th>B</th><th>C</th><th>D</th><th>E</th><th>F</th><th>G</th><th>H</th><th>I</th><th>J</th></tr>
			<tr>
				<td><input name="ch" type="radio" value="A" checked="checked"></td>
				<td><input name="ch" type="radio" value="B"></td>
				<td><input name="ch" type="radio" value="C"></td>
				<td><input name="ch" type="radio" value="D"></td>
				<td><input name="ch" type="radio" value="E"></td>
				<td><input name="ch" type="radio" value="F"></td>
				<td><input name="ch" type="radio" value="G"></td>
				<td><input name="ch" type="radio" value="H"></td>
				<td><input name="ch" type="radio" value="I"></td>
				<td><input name="ch" type="radio" value="J"></td>
			</tr>
			<tr><th>K</th><th>L</th><th>M</th><th>N</th><th>O</th><th>P</th><th>Q</th><th>R</th><th>S</th><th>T</th></tr>
			<tr>
				<td><input name="ch" type="radio" value="K"></td>
				<td><input name="ch" type="radio" value="L"></td>
				<td><input name="ch" type="radio" value="M"></td>
				<td><input name="ch" type="radio" value="N"></td>
				<td><input name="ch" type="radio" value="O"></td>
				<td><input name="ch" type="radio" value="P"></td>
				<td><input name="ch" type="radio" value="Q"></td>
				<td><input name="ch" type="radio" value="R"></td>
				<td><input name="ch" type="radio" value="S"></td>
				<td><input name="ch" type="radio" value="T"></td>
			</tr>
			<tr><th>U</th><th>V</th><th>W</th><th>X</th><th>Y</th><th>Z</th><th colspan="4"></th></tr>
			<tr>
				<td><input name="ch" type="radio" value="U"></td>
				<td><input name="ch" type="radio" value="V"></td>
				<td><input name="ch" type="radio" value="W"></td>
				<td><input name="ch" type="radio" value="X"></td>
				<td><input name="ch" type="radio" value="Y"></td>
				<td><input name="ch" type="radio" value="Z"></td>
				<td colspan="4"></td>
			</tr>
		</tbody>
	</table>
</fieldset>
<fieldset name="exe">
	<legend>Execution</legend>
	<input type="reset"  value="Reset">
	<input type="submit" value="Create">
</fieldset>
</form>
<div></div>
<ol id="ol"></ol>

</body>
</html>