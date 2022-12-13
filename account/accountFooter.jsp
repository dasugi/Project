<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	position:relative;
	height:100px;
	width:100vw;
}

#f {
	width:200px;
	height:17px;
	position:absolute;
	right:20%;
	top:860px;
	opacity:80%;
}
#link {
	position:absolute;
	left:18%;
	top:890px;
}

#link a {
	text-decoration:none;
	font-size:12px;
	margin: 0 15px;
	font-weight:lighter;
	color: gray;
	word-spacing:0.5;
}
#copyright {
	position:absolute;
	right:20%;
	font-size:12px;
	color:gray;
	top:890px;
}
</style>
</head>
<body>
<table>
	<tr id="link">
		<td>
			<a href="#">이용약관</a>
		</td>
		<td>
			<a href="#" style="font-weight:bold">개인정보 처리방침</a>
		</td>
		<td>
			<a href="#">공지</a>
		</td>
		<td>
			<a href="#">문의하기</a>
		</td>
	</tr>
	<tr>
		<td><img id="f" alt="" src="images/footer_logo.png"></td>
		<td colspan="4" id="copyright">Copyright ⓒ 1995-2022 Samsung. All Rights Reserved.</td>
	</tr>
</table>
</body>
</html>