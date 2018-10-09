<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>静态包含</title>
</head>
<body>

<%@ include file="/include/logo.jsp" %>
<%@ include file="/include/menu.jsp" %>

<%= a %>

<h3>真实数据</h3>
<table border="1" width="50%">
	<tr>
		<td>新闻</td>
		<td>体育</td>
	</tr>
	<tr>
		<td>新闻</td>
		<td>体育</td>
	</tr>
</table>

<%@ include file="/include/foot.jsp" %>

</body>
</html>