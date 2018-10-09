<%@page import="cn.itcast.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>把数据封装User对象中</h3>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	// 完成封装
	User user = new User();
	user.setUsername(username);
	user.setPassword(password);
	// 在后台的程序中传输user对象
%>

<%= user.getUsername() %>
<%= user.getPassword() %>

</body>
</html>







