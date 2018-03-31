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
<form action="dept_update" method="post">
id<input value='<s:property value="dept.deptno" />' name="dept.deptno" readonly="readonly"> 
名称<input value='<s:property value="dept.dname" />' name="dept.dname"> 
地址<input value='<s:property value="dept.loc" />' name="dept.loc"> 
<input type="submit" value="修改">
</form>
</body>
</html>