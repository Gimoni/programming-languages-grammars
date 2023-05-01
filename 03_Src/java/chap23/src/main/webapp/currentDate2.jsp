<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store"> 
<title>currentDate2.jsp</title>
</head>
<body>
<p>
<span id="date"></span>
<span id="time"></span>
<p>

<script type="text/javascript">
	function printDate() {
		let c = new Date();
		let year = c.getFullYear();
		let month = c.getMonth()+1;
		let day = c.getDate();
		let hour = c.getHours();
		let minute = c.getMinutes();
		let second = c.getSeconds();
		
		
		if (month<10)
			month = "0" + month;
		
		if (String(day).length==1)
			day = "0" + day;
		
		if (hour<10)
			hour = "0" + hour;
		
		if (minute<10)
			minute = "0" + minute;
		
		if (second<10)
			second = "0" + second;
		
		
		date.innerHTML = year + "-" + month + "-" + day;
		time.innerHTML = hour + ":" + minute + ":" + second;
		
		//setTimeout(printDate, 1000);
	}
	
	setInterval(printDate, 1000);
	console.log("timer start....")
</script>
</body>
</html>