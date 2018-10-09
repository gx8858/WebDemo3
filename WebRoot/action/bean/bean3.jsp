<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>使用JSP的动作标签封装数据</h3>
<jsp:useBean id="u" class="cn.itcast.domain.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<h4>查看数据</h4>
<jsp:getProperty property="username" name="u"/>
<jsp:getProperty property="password" name="u"/>


</body>
</html>