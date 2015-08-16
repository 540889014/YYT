<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		<script type="text/javascript " src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript " src="${pageContext.request.contextPath}/js/all-new.js "></script>
		<style type="text/css">
			body {
				margin: 0 0;
			}
			.wraper {
				height: 100%;
				width: 100%;
				position: absolute;
				left: 0;
				top: 0;
				overflow: hidden;
				z-index: 10;
			}
			.wraps .steps_1 {
				background: #474747 url() no-repeat center center;
			}
			.common_css {
				position: absolute;
				left: 50%;
				top: 50%;
			}
			.main_1 {
				height: 264px;
				width: 904px;
				margin: -132px 0 0 -452px;
			}
			.main_1 .up {
				height: 159px;
				border-top: 1px solid white;
				border-bottom: 1px solid white;
				position: relative;
			}
			.main_1 .up div {
				height: 159px;
				position: absolute;
				left: 0;
				top: 0;
				width: 100%;
				overflow: hidden;
				text-align: center;
			}
			.main_1 .up div img {
				margin-top: 33px;
			}
			.main_1 .up div.final {
				top: 150px;
				opacity: 0;
				filter: alpha(opacity=0);
			}
			.main_1 .up div.todown {
				-webkit-transform: rotateX(360deg);
				-moz-transform: rotateX(360deg);
				-o-transform: rotateX(360deg);
				transform: rotateX(360deg);
				top: 150px;
				opacity: 0;
				-webkit-transition: 0.5s;
				-moz-transition: 0.5s;
				-o-transition: 0.5s;
				transition: 0.5s;
			}
			.main_1 .up div.toup {
				-webkit-transform: rotateX(360deg);
				-moz-transform: rotateX(360deg);
				-o-transform: rotateX(360deg);
				transform: rotateX(360deg);
				top: 0px;
				opacity: 1;
				-webkit-transition: 0.5s;
				-moz-transition: 0.5s;
				-o-transition: 0.5s;
				transition: 0.5s;
			}
			.main_1 .up div.todown2 {
				-webkit-transform: rotateX(0deg);
				-moz-transform: rotateX(0deg);
				-o-transform: rotateX(0deg);
				transform: rotateX(0deg);
				top: 0;
				opacity: 1;
				-webkit-transition: 0.5s;
				-moz-transition: 0.5s;
				-o-transition: 0.5s;
				transition: 0.5s;
			}
			.main_1 .up div.toup2 {
				-webkit-transform: rotateX(0deg);
				-moz-transform: rotateX(0deg);
				-o-transform: rotateX(0deg);
				transform: rotateX(0deg);
				top: 150px;
				opacity: 0;
				-webkit-transition: 0.5s;
				-moz-transition: 0.5s;
				-o-transition: 0.5s;
				transition: 0.5s;
			}
		</style>
	</head>

	<body>
		<div class="wraper" id="wraper">
			<div class="wraps" style="top: 0px;">
				<div class="steps steps_1" style="height: 731px;">
					<div class="main_1 common_css">
						<div class="up">
							<div class="frist todown"><img src="${pageContext.request.contextPath}/img/one.png"></div>
							<div class="final toup"><img src="${pageContext.request.contextPath}/img/two.png"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>