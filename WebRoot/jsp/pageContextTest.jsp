<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试PageContext对象</title>
</head>
<body>
<%--
	1.这一个对象顶9个。可以获取另外的8个对象。
	2.域对象：代表当前的页面的域。
	3.向其他的域对象中存取值。
	
	4.pageContext对象的API
		* setAttribute(String name, Object value) 
		* setAttribute(String name, Object value, int scope) 
		
		* Object getAttribute(String name)  
		* Object getAttribute(String name, int scope)  
		
		* Object findAttribute(String name)
 --%>
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

<!-- 全域查找，默认从最小的域中找值，如果找不到，上一个域中找-->
<%= pageContext.findAttribute("username") %>

<%-- 结果为：美美2 小凤2 小凤2 美美2 --%>

</body>
</html>