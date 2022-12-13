<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/reset.css" rel="stylesheet" type="text/css">
<link href="css/account.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script/account.js"></script>
<title>회원 가입</title>
<style type="text/css">

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
<form method="post" name="act" id="acf" action="AccountServlet">
<input type="hidden" name="command" value="account_success">
<input type="hidden" name="acf" value="email">
<h2>삼성계정 만들기</h2>
<p>계정으로 사용할 이메일 주소를 입력하세요. <a href="AccountServlet?command=account_form2">전화번호를 사용하려면 여기를 누르세요.</a></p>
<span style="color:red; font-size:10px;">${message}</span>
<table>
	<tr>
		<td><input type="text" name="email" placeholder="이메일" style="width:500px"></td>
	</tr>
	<tr>
		<td><input type="password" name="pwd" placeholder="비밀번호" style="width:500px" onfocus="return emailAdd()"></td>
	</tr>
	<tr>
		<td><input type="password" name="pwdcheck" placeholder="비밀번호 확인" style="width:500px" onfocus="return pwdAdd()"></td>
	</tr>
	<tr>
		<td><input type="text" name="fname" placeholder="성" style="width:500px" onfocus="return passCheck()"></td>
	</tr>
	<tr>
		<td><input type="text" name="lname" placeholder="이름" style="width:500px"></td>
	</tr>
	<tr>
		<td>
		<input type="text" name="birthy" size="4" placeholder="년" id="year">
		<select name="birthm" id="mon">
			<option value="default"></option>
			<option value="1">01</option>
			<option value="2">02</option>
			<option value="3">03</option>
			<option value="4">04</option>
			<option value="5">05</option>
			<option value="6">06</option>
			<option value="7">07</option>
			<option value="8">08</option>
			<option value="9">09</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
		</select>
		<input type="text" name="birthd" size="2" placeholder="일" id="day">
		</td>
	</tr>
	<tr>
		<td>
		<input type="button" value="뒤로" id="back" onclick="location.href='AccountServlet?command=account_info'">
		<input type="submit" value="회원가입" onclick="return accountCheck()" id="apply">
		</td>
	</tr>
</table>
</form>
</body>
<jsp:include page="accountFooter.jsp" />
</html>