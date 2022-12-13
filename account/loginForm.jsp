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

input {
	border:none;
	width:230px;
	height:40px;
	border-radius: 20px;
	font-weight:bold;
	font-size:14px;
	color:white;
	background-color:#8CBDED;
	margin-left:25%;
	margin-top:50px;
}

#back {
	background-color:#f5f5f5;
	color:black;
}

</style>
</head>
<jsp:include page="accountHeader.jsp" />
<body>
<form method="post" name="acf" id="acf">
<h2>로그인 창으로 가기</h2>
<input type="button" name="log-e" value="이메일로 로그인하기" onclick="location.href='AccountServlet?command=email_login_form'">
<br>
<input type="button" name="log-p" value="전화번호로 로그인하기" onclick="location.href='AccountServlet?command=phone_login_form'">
<br>
<input type="button" name="back" id="back" value="취소" onclick="location.href='main.html'">
</form>
</body>
<jsp:include page="accountFooter.jsp" />
</html>