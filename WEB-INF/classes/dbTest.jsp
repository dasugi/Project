<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JDBC 드라이버 테스트</h2>
<%
	Connection conn = null;
	try {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pw = "1234";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pw);
		out.print("Success");
	} catch (Exception e) {
		out.print("Fault");
	}
%>
</body>
</html>