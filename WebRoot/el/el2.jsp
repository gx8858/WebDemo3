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
<title>Insert title here</title>
</head>
<body>

<%
	pageContext.setAttribute("username", "美美");
	request.setAttribute("username", "张默");
	session.setAttribute("username", "乌鸦");
	application.setAttribute("username", "李代沫");
%>

<h4>EL获取域对象中的值</h4>
${ pageScope.username }
${ requestScope.username }
${ sesssionScope.username }
${ applicationScope.username }


<h4>从数组中取值（把数组存到域对象中）</h4>
<%
	String [] arrs = new String[]{"美美","张默","房祖名"};
	// 先把数组存到域中
	pageContext.setAttribute("arrs", arrs);
%>
${ arrs[2] }

<h4>从List集合中取值（域对象中）</h4>
<%
	List<String> list = new ArrayList<String>();
	list.add("美美");
	list.add("张默");
	list.add("房祖名");
	pageContext.setAttribute("list", list);
%>
${ list[1] }

<h4>从Map集合中取值</h4>
<%
	Map<String,String> map = new HashMap<String,String>();
	map.put("aaa", "美美");
	map.put("bbb", "张默");
	map.put("ccc-ddd", "房祖名");
	pageContext.setAttribute("map", map);
%>
${ map["ccc-ddd"] }


<h4>从List存入对象集合中取值（域对象中）</h4>
<%
	List<Person> ulist = new ArrayList<Person>();
	ulist.add(new Person("美美","123"));
	ulist.add(new Person("张默","456"));
	ulist.add(new Person("祖明","789"));
	pageContext.setAttribute("ulist", ulist);
%>
${ ulist[2].username }


</body>
</html>




















