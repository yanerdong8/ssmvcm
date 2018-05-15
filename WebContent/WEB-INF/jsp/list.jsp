<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width="80%" align="center">
		<tr>
			<td colspan="4" align="right"><a href="${pageContext.request.contextPath}/toadd">添加</a> </td>
		</tr>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="bean">
			<tr>
				<td>${bean.id }</td>
				<td>${bean.name }</td>
				<td>${bean.pwd }</td>
				<td><a href="delete?id=${bean.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>