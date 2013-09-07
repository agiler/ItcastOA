<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

		<s:form action="roleAction_edit">
			<s:hidden name="id"></s:hidden>
			<!-- 
			<input type="text" name="" class="" style=""/>
			<textarea name="" class="" style=""></textarea>
			 -->
			<s:textfield name="name" label="名称" cssClass="" cssErrorStyle=""></s:textfield>
			<s:textarea name="description" label="说明"></s:textarea>
			<s:submit value="提交"></s:submit>
		</s:form>

	</body>
</html>
