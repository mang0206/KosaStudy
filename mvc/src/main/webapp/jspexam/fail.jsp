<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	img{
		width:500px;
		height:auto;
	}
</style>
</head>
<body>
<h2> "${time.hour}시 ${time.minute}분에 당첨 실패!! 아쉽아쉽"</h2>

<a href="${ header.referer }">로또 응모 링크</a>
<img src="images/아쉽.jpg">
</body>
</html>