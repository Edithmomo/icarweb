 $(document).ready(function(){
 
$("#update_pwd").click(update_pwd);
$("#user_pw").blur(vadpass);

});
 function update_pwd(){
		var user_number = $("#user_number").val();
		var user_pw = $("#user_pwd").val();
		var  system_user = new Object();
		system_user.user_number = user_number;
		system_user.user_pw = user_pw;
		$.ajax({
			url : "../../../register/updatePwd.action",
			data :  system_user,
			type : "post",
			success :update_success,
			 
		});
	}
	function update_success(data){
		console.log(data);
		console.log("------------------------");
		if(data==null){
			alert("修改密码失败，工号或密码错误,请重新输入");
			 $("#user_number").val("");
			 $("#user_pwd").val("");
			 $("#pass1").val("");
		}
		else(data!=null){
			alert("修改密码成功");
			window.location.href="../logon.html";
		}
		}
	function vadpass(){
		var pass1=$("#pass1").val();
		var pass2=$("#user_pw").val();
		if(pass1!=pass2&&pass1!=null&&pass2!=null){
			console.log($("#pwderrscean"));
			$("#pwderrscean").text("两次密码不一致");
			
		}else{
			
			$("#pwderrscean").text("");
		}
			
			
		}