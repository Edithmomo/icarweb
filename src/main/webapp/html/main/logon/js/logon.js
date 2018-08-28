$(document).ready(function() {

	$("#logon").click(logon);

});
function logon() {
	var user_number = $("#user_num").val();
	var user_pw = $("#user_pwd").val();
	var system_user = new Object();
	system_user.user_number = user_number;
	system_user.user_pw = user_pw;
 
	$.ajax({
		url : "../../../userloginregedit/dologin.action",
		data : system_user,
		type : "post",
		success : logon_success,
		error:function(err){
			console.log(err,"err..........")
		}

	});
}
function logon_success(data) {
	console.log(data)
	if(data.length > 0){
		sessionStorage.kind_id = data[0].kind_id;
		sessionStorage.user_name = data[0].user_name;
		sessionStorage.user_number = data[0].user_number;
		alert("登录成功");
		location.href = "../../../html/admin/main/center.html";
		parent.location.reload();
	}else{
		alert("账号名或密码错误")
	}
}