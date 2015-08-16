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
		<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/jquery.dataTables.css" rel="stylesheet" type="text/css" />
		<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
		<script class="jsbin" src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/dataTables.bootstrap.js"></script>
		<script src="${pageContext.request.contextPath}/js/main.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
			label {
				font-size: 13px;
			}
			td {
				text-align: center;
			}
			th {
				text-align: center;
			}
			select.input-sm {
				height: 25px;
			}
			.ip {
				background: #fff;
				border: 1px solid #e6e6e6;
				color: #333;
				font-size: 14px;
				font-weight: bold;
				-webkit-appearance: none;
			}
		</style>
	</head>

	<body style="height: 655px;">
		<div id="w" style="margin-left: auto;margin-right: auto; *zoom: 1;">
			<div style="height: 30px;font-size: 15px;text-align: center;margin-top: 10px;">
				相关查询
				<div style="margin-top: -19px;">
					<hr style="border: 1px #888888 solid;" />
				</div>
			</div>
			<div style="height: 40px;line-height: 1px;margin-top: 2px;">
				<form action="#">
					<p>
						<label>加盟店名称：</label>
						<input type="text" />
						<label>城市：</label>
						<input type="text" />
						<label>店长：</label>
						<input type="text" />
						<label>注册日期：</label>
						<input type="text" />
					</p>
					<div style="float:right; margin-top: -35px;">
						<input type="submit" class="btn btn-info" style="height: 32px;" value="查询">
					</div>
				</form>
			</div>
			<div style="margin-top: -28px;">
				<hr style="border: 1px #888888 solid;" />
			</div>
			<div style="margin-top: -15px;">
				<div class="ibox-title">
					<h5>加盟店列表</h5>
					<div class="ibox-tools">
						<button id="tb-refresh" href="#" class="btn btn-primary btn-xs p310" data-toggle="modal" data-target="#Add">添加</button>
						<button id="tb-refresh" href="#" class="btn btn-primary btn-xs p310" data-toggle="modal" data-target="#Change">变更</button>
						<button id="tb-refresh" href="#" class="btn btn-primary btn-xs p310">注销</button>
						<button id="tb-refresh" href="#" class="btn btn-primary btn-xs p310">数据导出</button>
					</div>
				</div>
				<div>
					<table border="1px" id="example" style="width: 100%;" class="table-bordered">
						<thead>
							<tr>
								<th>
									<INPUT name="chkAll" id="chkAll" title="全选" onClick="ChkAllClick('chkSon','chkAll')" type="checkbox" />
								</th>
								<th>标号</th>
								<th>加盟店名称</th>
								<th>店长</th>
								<th>门店电话</th>
								<th>店长手机</th>
								<th>邮箱</th>
								<th>微信号</th>
								<th>总公司专员</th>
								<th>员工数</th>
								<th>门店地址</th>
								<th>注册日期</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>

			</div>
		</div>
		</div>
		</div>
		<!--添加加盟店-->
		<div class="modal fade" id="Add" tabindex="-1" role="dialog" aria-labelledby="modal-label" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
						</button>
						<h4 class="modal-title" id="modal-label">添加加盟店</h4>
					</div>
					<div class="modal-body">
								加盟店名称：
								<input type="text" class="form-control" placeholder="......"> 
								店长：
								<input type="password" class="form-control" placeholder="......">
								门店电话：
								<input type="password" class="form-control" placeholder="......"> 
								店长手机：
								<input type="password" class="form-control" placeholder="......">
								邮箱：
								<input type="password" class="form-control" placeholder="......"> 
								微信号：
								<input type="password" class="form-control" placeholder="......">
								总公司专员：
								<input type="password" class="form-control" placeholder="......"> 
								员工数：
								<input type="password" class="form-control" placeholder="......">
								门店地址：
								<input type="password" class="form-control" placeholder="......"> 
								注册日期：
								<input type="password" class="form-control" placeholder="......">
							<input type=submit value="确认添加" style="width:85px">
					</div>
				</div>
			</div>
		</div>
<!--变更加盟店-->
		<div class="modal fade" id="Change" tabindex="-1" role="dialog" aria-labelledby="modal-label" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
						</button>
						<h4 class="modal-title" id="modal-label">信息更改</h4>
					</div>
					<div class="modal-body">
								加盟店名称：
								<input type="text" class="form-control" placeholder="......"> 
								店长：
								<input type="password" class="form-control" placeholder="......">
								门店电话：
								<input type="password" class="form-control" placeholder="......"> 
								店长手机：
								<input type="password" class="form-control" placeholder="......">
								邮箱：
								<input type="password" class="form-control" placeholder="......"> 
								微信号：
								<input type="password" class="form-control" placeholder="......">
								总公司专员：
								<input type="password" class="form-control" placeholder="......"> 
								员工数：
								<input type="password" class="form-control" placeholder="......">
								门店地址：
								<input type="password" class="form-control" placeholder="......"> 
								注册日期：
								<input type="password" class="form-control" placeholder="......">
							<input type=submit value="确认更改" style="width:85px">
					</div>
				</div>
			</div>
		</div>
</html>