<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BeanTest</title>
</head>
<body>

<h3>在JSP中封装数据</h3>
<form action="/test/action/bean/bean2.jsp" method="post">
	姓名：<input type="text" name="username" /><br/>
	密码：<input type="password" name="password" /><br/>
	<input type="submit" value="提交" />
</form>

<h3>在JSP中使用动作标签来封装数据</h3>
<form action="/test/action/bean/bean3.jsp" method="post">
	姓名：<input type="text" name="username" /><br/>
	密码：<input type="password" name="password" /><br/>
	<input type="submit" value="提交" />
</form>


<h3>在JSP中把数据提交到Servlet程序中</h3>
<form action="/test/user" method="post">
	姓名：<input type="text" name="username" /><br/>
	密码：<input type="password" name="password" /><br/>
	<input type="submit" value="提交" />
</form>

<h3>在JSP中把数据提交到Servlet程序中（BeanUtil封装数据）</h3>
<form action="/test/user2" method="post">
	姓名：<input type="text" name="username" /><br/>
	密码：<input type="password" name="password" /><br/>
	余额：<input type="text" name="money" /><br/>
	生日：<input type="text" name="birthday" /><br/>
	<input type="submit" value="提交" />
</form>

</body>
</html>





