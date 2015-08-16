<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<frameset rows="70px,*" border="0" >
		<frame src="${pageContext.request.contextPath}/manager/companyIndex_company_top.action" scrolling="no"/>
		<frameset cols="201px,*">
			<frame src="${pageContext.request.contextPath}/manager/companyIndex_company_left.action"/>
			<frame src="${pageContext.request.contextPath}/manager/companyIndex_company_center.action"/ name="main">
		</frameset>
	</frameset>
</html>