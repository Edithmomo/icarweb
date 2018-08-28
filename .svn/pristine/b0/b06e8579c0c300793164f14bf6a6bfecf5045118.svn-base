$(function() {
	$("#query_btn").click(query_standard);
	$("#update_monthle_btn").click(update_monthle);
	$("#update_temp_btn").click(update_temp);
})
function query_standard() {
	$("#new_div").load("./selectStandard.html", function() {
		$(".modal-body").html("");
		$.ajax({
			type : "POST",
			url : "../../../moneyinfoadmain/queryMoneyInfo.action",
			success : query_success,
			error : errorfun,
		});
	});
}

function update_monthle() {
	$("#new_div").load("./updateMonthlyStandard.html")
}
function update_temp() {
	console.log("1231231232");
	$("#new_div").load("./updateTemporaryStandard.html")
}
function save_parkingspace(ops) {
	var user_number = $("#user_number").val();
	if (user_number != "" && user_number != null) {
		var userinfo = new Object();
		userinfo.user_number = user_number;
		query_oneById(userinfo, function(data) {
			if (data != "" && data != null) {
				console.log(data,"....",ops)
				$.ajax({
					type : "POST",
					data : {
						user_number : user_number,
						moneyinfoId : ops,
						price : $("#num").val(),
						reason : $("#reason").val(),
					},
					url : "../../../moneyinfoadmain/updateMoneyInfo.action",
					success : save_employ,
					error : errorfun,
				});
			}else{
				alert("员工不存在,请重新输入 ");
				 $("#user_number").val("");
			}
		})
	} else {
		alert("操作员工号不能为空");
	}
}
function query_oneById(userinfo, query_oneemp) {
	$.ajax({
		url : "../../../employeesmanager/queryByUserNumber.action",
		type : "POST",
		data : userinfo,
		success : query_oneemp,
		error : errorfun,
	})
}
function save_employ(data) {
	console.log(data);
	if (data == "false") {
		alert("修改失败！！服务器错误,请稍后重试")
		return;
	}
	alert("操作成功！！！")
	$("#myModal").modal('hide')
}
function query_success(data) {
	console.log(data,"data")
	console.log(data.list,"datalist")
	
	var str = "<ul>"+
				"<li><font>当前"+ data.list[0].moneyKind +"收费标准为(/小时)："+ data.list[0].price +"</font></li>"+
				"<li><font>当前"+ data.list[1].moneyKind +"收费标准为(/月)：" +data.list[1].price +"</font></li>"+
			   "</ul>";
	$(".modal-body").html(str);
	$("#new_div").show();
}

function exit() {
	$("#new_div").html("");
	$("#new_div").hide();
	$("#backdiv").hide();
}

function errorfun(err) {
	alert("请求失败");
}