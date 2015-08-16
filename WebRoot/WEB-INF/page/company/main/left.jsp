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
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$(".div2").click(function() {
					$(this).next("div").slideToggle("slow").siblings(".div3:visible").slideUp("slow");
				});
			});
		</script>
		<style type="text/css">
			* {
				margin: 0;
				padding: 0;
				list-style-type: none;
			}
			a,
			img {
				border: 0;
			}
			body {
				font: 12px/180% "微软雅黑";
			}
			a,
			a:hover {
				color: #000;
				text-decoration: none;
			}
			.left {
				width: 200px;
				height: 100%;
				border-right: 1px solid #CCCCCC;
				#FFFFFF;
				color: #000000;
				font-size: 14px;
				text-align: center;
				position: absolute;
				left: 0;
				top: 0;
			}
			.div1 {
				text-align: center;
				width: 200px;
				padding-top: 10px;
			}
			.div2 {
				height: 40px;
				line-height: 40px;
				cursor: pointer;
				font-size: 13px;
				position: relative;
				border-bottom: #ccc 1px dotted;
			}
			.div5 {
				height: 40px;
				line-height: 40px;
				cursor: pointer;
				font-size: 13px;
				position: relative;
				border-bottom: #ccc 1px dotted;
			}
			.hygl {
				position: absolute;
				height: 20px;
				width: 20px;
				left: 40px;
				top: 10px;
				background: url(${pageContext.request.contextPath}/img/8.png);
			}
			.yggl {
				position: absolute;
				height: 20px;
				width: 20px;
				left: 40px;
				top: 10px;
				background: url(${pageContext.request.contextPath}/img/8.png);
			}
			.jygl {
				position: absolute;
				height: 20px;
				width: 20px;
				left: 40px;
				top: 10px;
				background: url(${pageContext.request.contextPath}/img/8.png);
			}
			.yygl {
				position: absolute;
				height: 20px;
				width: 20px;
				left: 40px;
				top: 10px;
				background: url(${pageContext.request.contextPath}/img/8.png);
			}
			.rsgl {
				position: absolute;
				height: 20px;
				width: 20px;
				left: 40px;
				top: 10px;
				background: url(${pageContext.request.contextPath}/img/8.png);
			}
			.xtgl {
				position: absolute;
				height: 20px;
				width: 20px;
				left: 40px;
				top: 10px;
				background: url(${pageContext.request.contextPath}/img/1.png);
			}
			.div3 {
				display: none;
				font-size: 13px;
			}
			.div3 ul {
				margin: 0;
				padding: 0;
			}
			.div3 li {
				height: 30px;
				line-height: 30px;
				list-style: none;
				border-bottom: #ccc 1px dotted;
				text-align: center;
			}
		</style>

	</head>

	<body>

		<div class="left">
			<div class="div1">
				<div class="left_top">
					<img src="${pageContext.request.contextPath}/img/bbb_01.jpg">
					<img src="${pageContext.request.contextPath}/img/bbb_02.jpg" id="2">
					<img src="${pageContext.request.contextPath}/img/bbb_03.jpg">
					<img src="${pageContext.request.contextPath}/img/bbb_04.jpg">
				</div>
				<div class="div2">
					<div class="hygl"></div>加盟店管理</div>
				<div class="div3">
					<ul>
						<li><a href="companystore_companystorelist.action" target="main">加盟店列表</a>
						</li>
					</ul>
				</div>

				<div class="div2">
					<div class="hygl"></div>预约处理</div>
				<div class="div3">
					<ul>
						<li><a href="second/YYCL/yylb.html" target="main">预约操作</a>
						</li>
						<li><a href="second/YYCL/预约查询.html" target="main">预约查询</a>
						</li>
					</ul>
				</div>
				<div class="div2">
					<div class="yggl"></div>人事管理</div>
				<div class="div3">
					<ul>
						<li><a href="second/HR/yggl.html" target="main">人员管理</a>
						</li>
						<li><a href="second/HR/jsgl.html" target="main">角色管理</a>
						</li>
					</ul>
				</div>

				<div class="div2">
					<div class="yggl"></div>系统配置</div>
				<div class="div3">
					<ul>
						<li><a href="second/XTPZ/病症管理.html" target="main">病症管理</a>
						</li>
						<li><a href="second/XTPZ/服务项目.html" target="main">服务项目</a>
						</li>
						<li><a href="second/XTPZ/儿歌链接.html" target="main">儿歌链接</a>
						</li>
						<li><a href="#" target="main">育儿知识库</a>
						</li>
					</ul>
				</div>

				<div class="div2">
					<div class="yggl"></div>个人信息管理</div>
				<div class="div3">
					<ul>
						<li><a href="second/GRXXGL/grxx.html" target="main">个人信息</a>
						</li>
						<li><a href="second/GRXXGL/password.html" target="main">密码修改</a>
						</li>
					</ul>
				</div>

			</div>
		</div>
	</body>

</html>