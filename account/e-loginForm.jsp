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

table td input {
	border-top:none;
	border-left:none;
	border-right:none;
	border-bottom:1px solid gray;
	margin-bottom:20px;
}

#year {
	width:160px;
	border-top:none;
	border-left:none;
	border-right:none;
	border-bottom:1px solid gray;
}

#mon {
	background-image:url(images/arrow_drop_down.png);
	background-repeat:no-repeat;
	background-position:calc(100%) center;
	background-size: 30px;
	width: 160px; /* 원하는 너비설정 */
	height: 36px;
  	font-family: inherit;  /* 폰트 상속 */
  	font-size:16px;
  	color:gray;
  	-webkit-appearance: none; /* 네이티브 외형 감추기 */
  	-moz-appearance: none;
  	appearance: none;
  	border-top:none;
	border-left:none;
	border-right:none;
	border-bottom:1px solid gray;
	margin: 0 1px;
}

#day {
	width:160px;
	border-top:none;
	border-left:none;
	border-right:none;
	border-bottom:1px solid gray;
}
</style>
</head>
<jsp:include page="accountHeader.jsp" />
<body>
<form method="post" action="AccountServlet" name="acf" id="acf">
<input type="hidden" name="command" value="login_success">
<input type="hidden" name="lgf" value="email">
<script type="text/javascript">
	if("${message}"=="이메일이나 비밀번호가 틀렸습니다") {
		alert("${message}");
	}
</script>
<h2>이메일로 로그인하기</h2>
<table>
	<tr>
		<td><input type="text" name="email" placeholder="이메일" style="width:500px"></td>
	</tr>
	<tr>
		<td><input type="password" name="pwd" placeholder="비밀번호" style="width:500px"></td>
	</tr>
	<tr>
		<td>
		<input type="button" value="뒤로" id="back" onclick="location.href='AccountServlet?command=login_form'">
		<input type="submit" value="로그인" onclick="return loginCheck()" id="apply">
		</td>
	</tr>
</table>
</form>
</body>
<jsp:include page="accountFooter.jsp" />
</html>