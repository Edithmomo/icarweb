//$(document).ready(function() {
//    console.log("1231231231231231322")
//	$("#guanlilogon").click(guanlilogon);
//
//});
//function guanlilogon() {
//	console.log("......................................................")
//	var user_number = $("#user_num").val();
//	var user_pw = $("#user_pwd").val();
//	 
//	var system_user = new Object();
//	system_user.user_number = user_number;
//	system_user.user_pw = user_pw;
//	 
//	console.log("......................2..............................")
//	$.ajax({
//		url : "../../../userloginregedit/doguanlogin.action",
//		data : system_user,
//		type : "post",
//		success : logon_success,
//		error:function(err){
//			console.log(err,"err..........")
//		}
//
//	});
//}
//function logon_success(data) {
//	console.log(data);
//	console.log(data, "------------------------");
//}