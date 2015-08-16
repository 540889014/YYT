	<!--表格隔行变色-->
		$(document).ready(function() {
			$('tr').addClass('odd');
			$('tr:even').addClass('even');
		});
<!--div最小值设定-->
$(function() {
		//var bw=parseInt(document.body.clientWidth);  //js写法
		var bw = parseInt($(document.body).width()); //jquery写法
		if (bw < 1100) {
			$("#w").width("1100px");
		} else {
			$("#w").width("99%");
		}
	})
	//窗口最大化最小化事件
$(window).resize(function() {
	//var bw=parseInt(document.body.clientWidth);  //js写法
	var bw = parseInt($(document.body).width()); //jquery写法
	if (bw < 1100) {
		$("#w").width("1100px");
	} else {
		$("#w").width("99%");
	}
});

<!--选择框多选-->
// --列头全选框被单击--- 
function ChkAllClick(sonName, cbAllId) {
		var arrSon = document.getElementsByName(sonName);
		var cbAll = document.getElementById(cbAllId);
		var tempState = cbAll.checked;
		for (i = 0; i < arrSon.length; i++) {
			if (arrSon[i].checked != tempState)
				arrSon[i].click();
		}
	}
	// --子项复选框被单击--- 

function ChkSonClick(sonName, cbAllId) {
		var arrSon = document.getElementsByName(sonName);
		var cbAll = document.getElementById(cbAllId);
		for (var i = 0; i < arrSon.length; i++) {
			if (!arrSon[i].checked) {
				cbAll.checked = false;
				return;
			}
		}
		cbAll.checked = true;
	}
	// --反选被单击--- 

function ChkOppClick(sonName) {
	var arrSon = document.getElementsByName(sonName);
	for (i = 0; i < arrSon.length; i++) {
		arrSon[i].click();
	}
};

<!--表格样式定义-->
$(function() {
	var table = $('#example').DataTable({
		"pagingType": "full_numbers",
		"sLoadingRecords": "正在加载数据...",
		"sZeroRecords": "暂无数据",
		stateSave: true,
		"searching": false,
		"dom": 'rt<"bottom"iflp<"clear">>',
		"aoColumnDefs": [{
			"bSortable": false,
			"aTargets": [0]
		}, {
			"class": "tn",
			"targets": [0]
		}, {
			/*"targets": [ 4 ],*/
			/*"data": "download_link",*/
		}],
		"language": {
			"processing": "玩命加载中...",
			"lengthMenu": "显示 _MENU_ 项结果",
			"zeroRecords": "没有匹配结果",
			"info": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
			"infoEmpty": "显示第 0 至 0 项结果，共 0 项",
			"infoFiltered": "(由 _MAX_ 项结果过滤)",
			"infoPostFix": "",
			"url": "",
			"paginate": {
				"first": "首页",
				"previous": "上一页",
				"next": "下一页",
				"last": "末页"
			}
		},
	});
});