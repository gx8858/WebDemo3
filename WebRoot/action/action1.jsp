<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp动作标签</title>
</head>
<body>

<h3>action1的页面</h3>
<jsp:forward page="/action/action2.jsp">
	<jsp:param value="zhangsan" name="username"/>
</jsp:forward>	
	
</body>
</html>