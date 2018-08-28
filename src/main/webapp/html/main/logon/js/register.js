 $(document).ready(function(){
$("#add_system_user").click(add_system_user);
$("#user_pw").blur(vadpass);
});
 
function add_system_user() {
	var id=$('#select1 option:selected').val();
	var kind_id=null;
	if(id=="管理员"){
		  kind_id=2;
	}else if(id=="普通员工"){
		  kind_id=1;
	}
	var user_number = $("#user_number").val();
	var user_pw = $("#user_pw").val();
	var user_name = $("#user_name").val();
	var user_card =$("#user_card").val();
	var user_phone = $("#user_phone").val();
	var system_user = new Object();
	system_user.kind_id = kind_id;
	system_user.user_number = user_number;
	system_user.user_pw = user_pw;
	system_user.user_name = user_name;
	system_user.user_card = user_card;
	system_user.user_phone = user_phone;
	$.ajax({
		url : "../../../register/adduser.action",
		data : system_user,
		type : "post",
		success : register_success,
		error : function(err) {
			alert("注册用户失败，请重新输入");
			$("#user_number").val("");
			$("#user_pw").val("");
			$("#user_name").val("");
			$("#user_card").val("");
			$("#user_phone").val("");
			$("#pass1").val("");
		}
	});
}
function register_success(data){
	console.log(data);
	console.log("------------------------");
	alert("注册用户成功，请登录");
	window.location.href="../logon.html";
}

	
 


function vadpass(){
	var pass1=$("#pass1").val();
	var pass2=$("#user_pw").val();
	if(pass1!=pass2&&pass1!=null&&pass2!=null){
	 
		$("#pwderrscean").text("两次密码不一致");
		
	}else{
		
		$("#pwderrscean").text("");
	};
		
		
	};



 