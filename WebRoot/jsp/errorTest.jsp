<%-- 
<%@ page language="java" errorPage="/error/error.jsp"    // 这个是指定某一个错误页面
    pageEncoding="UTF-8" %>
 --%>
<%-- 下面的是默认的，因为在web.xml中配置了错误的页面（好处：不用为每一个页面设置错误页面） --%>>
<%@ page language="java"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>errorTest</title>
</head>
<body>

<%
	int a = 10 / 0;
%>

</body>
</html>