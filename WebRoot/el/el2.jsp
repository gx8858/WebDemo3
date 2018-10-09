<%@page import="cn.itcast.domain.Person"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>el</title>
</head>
<body>

<%
	pageContext.setAttribute("username", "用户1");
	request.setAttribute("username", "用户2");
	session.setAttribute("username", "用户3");
	application.setAttribute("username", "用户4");
%>

<h4>EL获取域对象中的值</h4>
${ pageScope.username }
${ requestScope.username }
${ sessionScope.username }
${ applicationScope.username }
<%-- 输出：用户1 用户2 用户3 用户4 --%>

<h4>从数组中取值（把数组存到域对象中）</h4>
<%
	String [] arrs = new String[]{"用户1","用户2","用户3"};
	// 先把数组存到域中
	pageContext.setAttribute("arrs", arrs);
%>
${ arrs[2] }   <%-- 输出：用户3 --%>

<h4>从List集合中取值（域对象中）</h4>
<%
	List<String> list = new ArrayList<String>();
	list.add("用户1");
	list.add("用户2");
	list.add("用户3");
	pageContext.setAttribute("list", list);
%>
${ list[1] }   <%-- 输出：用户2 --%>

<h4>从Map集合中取值</h4>
<%
	Map<String,String> map = new HashMap<String,String>();
	map.put("aaa", "用户1");
	map.put("bbb", "用户2");
	map.put("ccc-ddd", "用户3");
	pageContext.setAttribute("map", map);
%>
${ map.bbb }          <%-- 输出：用户2 --%>
${ map["ccc-ddd"] }   <%-- 输出：用户3 --%>


<h4>从List存入对象集合中取值（域对象中）</h4>
<%
	List<Person> ulist = new ArrayList<Person>();
	ulist.add(new Person("用户1","123"));
	ulist.add(new Person("用户2","456"));
	ulist.add(new Person("用户3","789"));
	pageContext.setAttribute("ulist", ulist);
%>
${ ulist[2].username }  <%-- 输出：用户3 --%>
${ ulist[2].password }  <%-- 输出：789 --%>


</body>
</html>
