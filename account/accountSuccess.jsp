<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/reset.css" rel="stylesheet" type="text/css">
<link href="css/account.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script/account.js"></script>
<style type="text/css">
#acf {
	height:400px;
}

#loginBtn {
	border:none;
	width:230px;
	height:40px;
	border-radius: 20px;
	font-weight:bold;
	font-size:14px;
	color:white;
	background-color:#8CBDED;
	position:absolute;
	left:50%;
	transform:translateX(-50%);
	
}
</style>
</head>
<jsp:include page="accountHeader.jsp" />
<body>
<form method="post" name="act" id="acf">
<input type="hidden" name="command" value="login_form">
<h2 align="center">회원가입을 축하합니다.</h2>
<table>
	<tr>
		<td><input type="submit" value="로그인하기" id="loginBtn"></td>
	</tr>
</table>
</form>
</body>
<jsp:include page="accountFooter.jsp" />
</html>