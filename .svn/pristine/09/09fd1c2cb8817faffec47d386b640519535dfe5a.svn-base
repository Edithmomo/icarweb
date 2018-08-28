 $(document).ready(function(){
 
 
$("#vad").click(vad);
 
 

});
 function vad(){
		var user_number = $("#user_number").val();
		var user_phone = $("#user_phone").val();
		var  system_user = new Object();
		system_user.user_number = user_number;
		system_user.user_phone= user_phone;
		$.ajax({
			url : "../../../register/verification.action",
			data :  system_user,
			type : "post",
			success :vad_success,
			 
		});
	}
	function vad_success(data){
		console.log(data);
		console.log("------------------------");
		if(data==null){
			alert("验证失败，工号或联系方式错误,请重新输入");
			 $("#user_number").val("");
			 $("#user_phone").val("");
		}
		else{
			alert("验证成功");
			window.location.href="../NewPassowrd.html";
		}
		
	}