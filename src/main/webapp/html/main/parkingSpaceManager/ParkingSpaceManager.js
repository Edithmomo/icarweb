$(function() {
	$("#query_btn").click(function(){
		$("#new_div").load("./selectParkingSpace.html", function() {
			$(".modal-body").html("");
			query_parkingSpace(query_success);
		});
	});
	$("#delete_btn").click(delete_parkingSpace);
	$("#add_btn").click(add_parkingSpace);
})
function delete_parkingSpace() {
	$("#new_div").load("./deleteParkingSpace.html")
}
function add_parkingSpace() {
	$("#new_div").load("./addParkingSpace.html")
}
function save_parkingspace(ops) {
	var user_number = $("#user_number").val();
	var num = $("#num").val();
	console.log(num)
	if (num == "" && num == null) {
		alert("修改车位的数量不能为空");
		return;
	}
	if(parseInt(num) <= 0){
		alert("修改车位的数量必须大于0");
		return;
	}
	if (user_number != "" && user_number != null) {
		var userinfo = new Object();
		userinfo.user_number = user_number;
		query_oneById(userinfo, function(data) {
			if (data != "" && data != null) {
				if(ops == "-"){
					console.log(ops,"-")
					query_parkingSpace(function(data){
						console.log(data)
						if(parseInt(num) <= data.all_num ){
							$.ajax({
								type : "POST",
								data : {
									user_number : user_number,
									num : ops + num,
									operations_id : 2,
									reason : $("#reason").val(),
								},
								url : "../../../cartspacemanager/updatetotalparkingspace.action",
								success : save_employ,
								error : errorfun,
							});
						}else{
							alert("删除失败！！删除的车位数大于当前的总车位数");
						}
					})
				}else{
					console.log(ops,"+")
					$.ajax({
						type : "POST",
						data : {
							user_number : user_number,
							num : ops + num,
							operations_id : 2,
							reason : $("#reason").val(),
						},
						url : "../../../cartspacemanager/updatetotalparkingspace.action",
						success : save_employ,
						error : errorfun,
					})
				}
			}else{
				alert("员工不存在,请重新输入 ");
				 $("#user_number").val("");
			}
		})
	} else {
		alert("操作员工号不能为空");
	}
}

function save_employ(data) {
	if (data == "false") {
		alert("修改失败！！服务器错误,请稍后重试")
		return;
	}
	alert("操作成功！！！")
	$("#myModal").modal('hide')
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
function query_parkingSpace(option) {
		$.ajax({
			type : "POST",
			url : "../../../cartspacemanager/queryparkingspace.action",
			success : option,
			error : errorfun,
		});
}

function query_success(data) {
	var str = "<ul>" + "<li><font>车位总数：" + data.all_num + "</font></li>"
			+ "<li><font>已用车位数：" + data.use_num + "</font></li>"
			+ "<li><font>剩余车位数：" + data.residue + "</font></li>" + "</ul>";
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