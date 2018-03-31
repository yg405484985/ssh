<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px" cellspacing="0px" width="600px">
		<tr>
			<th>id</th>
			<th>名称</th>
			<th>地址</th>
			<th colspan="2">操作</th>
		</tr>

		<!--  遍历List对象     list:action中的属性-->
		<s:iterator var="d" value="deptList">
			<tr>
				<td><s:property value="#d.deptno" /></td>
				<td><s:property value="#d.dname" /></td>
				<td><s:property value="#d.loc" /></td>
				<td><a href="dept_findById?dept.deptno=<s:property value='#d.deptno' />">修改</a></td>
				<td><a href="dept_deleteById?dept.deptno=<s:property value='#d.deptno' />">删除</a></td>
			</tr>
		</s:iterator>

	</table>
<center><a href="deptadd.jsp">添加</a></center>




</body>
</html>