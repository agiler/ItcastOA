<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>

	<body>

		<s:iterator value="#list">
			<%-- 
			<s:property value="id"/>,
			<s:property value="name"/>,
			<s:property value="description"/>,
			<a href="${pageContext.request.contextPath}/roleAction_delete.action?id=${id}" onclick="return confirm('确定要删除一条记录吗？')">删除</a>
			<s:a action="roleAction_delete" onclick="return confirm('确定要删除一条记录吗？')">
				<s:param name="id" value="%{id}"></s:param>
				删除
			</s:a>
			--%>
			
			${id},
			${name},
			${description},
			<s:a action="roleAction_delete?id=%{id}" onclick="return confirm('确定要删除一条记录吗？')">删除</s:a>,
			<s:a action="roleAction_editUI?id=%{id}">修改</s:a>
			<br/>
		</s:iterator>


		<s:a action="roleAction_addUI">添加</s:a>

	</body>
</html>
