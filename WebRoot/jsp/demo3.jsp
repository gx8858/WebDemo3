<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试PageContext对象</title>
</head>
<body>

<%
	// 向pageContext域对象中存入值
	pageContext.setAttribute("username", "美美");
	// 向指定的域中存入值
	pageContext.setAttribute("username", "美美2", pageContext.PAGE_SCOPE);
	
	request.setAttribute("username", "小凤");
	pageContext.setAttribute("username", "小凤2", pageContext.REQUEST_SCOPE);
	
	session.setAttribute("username", "张默");
	
%>

<%= pageContext.getAttribute("username") %>
<%= request.getAttribute("username") %>
<%= pageContext.getAttribute("username", pageContext.REQUEST_SCOPE) %>

<!-- 全域查找 -->
<%= pageContext.findAttribute("username") %>

</body>
</html>