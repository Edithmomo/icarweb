$(function() {
	$("#query_btn").click(query_employees);
	$("#delete_userinfo").click(delete_employees);
	$("#add_userinfo").click(add_employeess);
})
function delete_employees(data) {
	console.log(typeof(data)=='object')
	if(typeof(data)=='object'){
		if (checkdelete_obj() != "") {
			var parm = {
				title : "修改员工",
				html : "./shanchu.html",
				width : "50%",
				height : "40%",
				div_obj : $("#new_div"),
				buttons : [ "保存", "退出" ],
				buttons_callback : [ delete_emp, exit ]
			};
			show_new_div(parm);
			$("#user_id_str")[0].value = data;
		} else {
			alert("未选定删除目标")
		}
	}else{
		var parm = {
				title : "修改员工",
				html : "./shanchu.html",
				width : "50%",
				height : "40%",
				div_obj : $("#new_div"),
				buttons : [ "保存", "退出" ],
				buttons_callback : [ delete_emp, exit ]
			};
			show_new_div(parm);
			$("#user_id_str")[0].value = data;
	}
	
}

function delete_emp() {
	var employ_number = $("#employ_number").val();
	var reason = $("#reason").val();
	var user_number = $("#user_id_str")[0].value;
	if ($("#employ_number").data("status")) {
		if (user_number == "[object Object]") {
			user_number = checkdelete_obj();
		}
		$.ajax({
			type : "post",
			url : "../../../employeesmanager/deleteUserInfo.action",
			data : {
				user_number : user_number,
				curd_user_number : employ_number,
				reason : $("#reason").val
			},
			success : save_employ,
			error : errorfun
		})
	}else{
		alert("存在输入不合法的数据！！")
	}
}

function add_employeess() {
	var parm = {
		title : "修改员工",
		html : "./addemployees.html",
		width : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_emp, exit ]
	};
	show_new_noheight(parm);

}
function add_emp() {
	var user_number = $("#user_number").val();
	var user_name = $("#name").val();
	if ($("#user_number").data("status") && validate_password($("#user_pw")[0])
			&& validateName($("#name")[0]) && checkMobile($("#phone")[0])
			&& testid($("#card")[0])) {
		$.ajax({
			url : "../../../employeesmanager/addUserInfo.action",
			type : "POST",
			data : {
				kind_id : $("#kind_id").val(),
				user_card : $("#card").val(),
				user_name : user_name,
				user_pw : $("#user_pw").val(),
				user_phone : $("#phone").val(),
				user_number : user_number,
			},
			success : save_employ,
			error : function(err) {
				console.log(err)
				alert("错误")
			}
		});
	} else {
		alert("存在输入不合法的数据！！")
	}

}

function add_validata(dom) {
	if ($("#vali_number")[0] == undefined) {
		$(dom)
				.after(
						"<span id='vali_number' style='display:inline;position:relative;top:-20px;left: 50px;' >错误</span>");
	}
	var user_number = dom.value;
	if (user_number != "" && user_number != null) {
		if (user_number.length != 8) {
			$("#vali_number").html('员工工号必须八位数字组成')
			$("#vali_number").css({
				"color" : "red"
			});
			$(dom).data("status", "false");
			return;
		}
		return query_oneById({
			user_number : user_number
		}, function(data) {
			if (data.length > 0) {
				$("#vali_number").html('该员工工号已存在')
				$("#vali_number").css({
					"color" : "red"
				});
				$(dom).data("status", "false")
				return false;
			} else {
				$("#vali_number").html('输入合法')
				$("#vali_number").css({
					"color" : "green"
				});
				$(dom).data("status", "true")
				return true;
			}
		})
	} else {
		$("#vali_number").html('员工工号不能为空');
		$("#vali_number").css({
			"color" : "red"
		});
		$(dom).data("status", "false")
		return false;
	}
}
function update_validata(dom) {
	if ($("#vali_number")[0] == undefined) {
		$(dom)
				.after(
						"<span id='vali_number' style='display:inline;position:relative;top:-20px;left: 50px;' >错误</span>");
	}
	var user_number = dom.value;
	if (user_number != "" && user_number != null) {
		if (user_number.length != 8) {
			$("#vali_number").html('员工工号必须八位数字组成')
			$("#vali_number").css({
				"color" : "red"
			});
			$(dom).data("status", "false");
			return;
		}
		return query_oneById({
			user_number : user_number,
			kind_id : 2
		}, function(data) {
			if (data.length <= 0) {
				$("#vali_number").html('该员工工号不存在')
				$("#vali_number").css({
					"color" : "red"
				});
				$(dom).data("status", "false")
				return false;
			} else {
				$("#vali_number").html('输入合法')
				$("#vali_number").css({
					"color" : "green"
				});
				$(dom).data("status", "true")
				return true;
			}
		})
	} else {
		$("#vali_number").html('员工工号不能为空');
		$("#vali_number").css({
			"color" : "red"
		});
		$(dom).data("status", "false")
		return false;
	}
}
function query_employees() {
	var user_name = $("#query_input").val();
	var userinfo = new Object();
	userinfo.user_name = user_name;
	console.log(userinfo)
	var parm = {
		url : "../../../employeesmanager/queryByUserNumber.action",
		data : userinfo,
		table_obj : $("#datatable"),
		title : [ "员工工号", "姓名", "身份证号", "联系方式" ],
		data_column : [ "user_number", "user_name", "user_card", "user_phone" ],
		id : "user_id",
		title_column_width : [ "20%", "15%", "20%", "15%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_callback : [ "update_employees", "delete_employees" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
function update_employees(data) {
	var parm = {
		title : "修改员工",
		html : "./xiugai.html",
		width : "50%",
		height : "65%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_emp, exit ]
	};
	show_new_noheight(parm);
	query_oneById({
		user_id : data
	}, query_oneemp);
}
function query_oneemp(data) {
	console.log(data, "adf");
	data = data[0];
	$("#kind_id").val(data.kind_id);
	$("#kind_id").data("userinfo", data);
	$("#name").val(data.user_name);
	$("#phone").val(data.user_phone);
	$("#card").val(data.user_card);
}
function update_emp() {
	var curd_user_number = $("#curd_user_number").val();
	if ($("#curd_user_number").data("status") && validateName($("#name")[0])
			&& checkMobile($("#phone")[0]) && testid($("#card")[0])) {
		var d = $("#kind_id").data("userinfo");
		$.ajax({
			url : "../../../employeesmanager/updateUserInfo.action",
			type : "POST",
			data : {
				kind_id : $("#kind_id").val(),
				user_card : $("#card").val(),
				user_id : d.user_id,
				user_name : $("#name").val(),
				user_phone : $("#phone").val(),
				curd_user_number : curd_user_number,
				reason : $("#reason").val(),
			},
			success : save_employ
		});
	} else {
		alert("存在输入不合法的数据");
	}
}
function save_employ(data) {
	if (data == false) {
		alert("修改失败！！服务器错误,请稍后重试")
		return;
	}
	alert("操作成功！！！")
	$("#new_div").html("");
	$("#new_div").hide();
	$("#backdiv").hide();
	query_employees();
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
function exit() {
	$("#new_div").html("");
	$("#new_div").hide();
	$("#backdiv").hide();
}

function query_success(data, query_userinfo_data) {
	console.log(data);
	if (data != "" && data != null) {
		data = data[0];
		query_userinfo_data = data;
		var str = "<li class='info_list' ><font>姓名：</font><span>"
				+ data.user_name + "</span></li>"
				+ "<li class='info_list' ><font>联系方式：</font><span>"
				+ data.user_phone + "</span></li>"
				+ "<li class='info_list' ><font>身份证号：</font><span>"
				+ data.user_card + "</span></li>";
		console.log($("#show_userinfo"))
		$("#show_userinfo").prepend(str);
		$('.modal').modal('show');
	} else {
		alert("查询工号错误");
	}

}
function errorfun(err) {
	alert("请求失败");
}