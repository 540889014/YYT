<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title></title>

		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
		<style>
			body {
				background-color: #08BCBF;
			}
			.one {
				float: left;
				height: 30px;
				margin-top: 10px;
				margin-left: 50px;
			}
			.two {
				float: right;
				height: 30px;
				margin-top: 40px;
				margin-right: 70px;
			}
			.yytgl {
				font-family: '黑体';
				font-size: 27px;
				color: #FFFFFF;
				text-shadow: 0 0 5px #31708F;
			}
		</style>
	</head>

	<body>
		<div class="one">
			<span class="yytgl">易幼堂公司管理系统</span>
		</div>
		<div class="two">
			<span style="padding-right: 50px;padding-top: 3px;color: #FFFFFF; "><a href="second/GRXXGL/grxx.html" target="main" style="text-decoration: none;color: #FFFF99; ">苑洪得</a>，欢迎登陆本系统。</span>
			<a href="welcome.html" target="main" style="text-decoration: none;color: #FFFFFF; "><span class="glyphicon glyphicon-home " aria-hidden="true "></span>&nbsp;返回首页&nbsp;</a>
			<a href="login.html " target="_parent" style="text-decoration: none;color: #FFFFFF; "><span class="glyphicon glyphicon-log-out " aria-hidden="true "></span>&nbsp;退出系统</a>
		</div>
	</body>

</html>