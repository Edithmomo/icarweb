$(function() {
	var addUrl='../../../vipcartadmin/addVipCart.action';
	var xufeiUrl='../../../vipcartadmin/renewal.action';
	$('#submit').click(function(){
		alert("nihao");
		var vipCart=new Object();
		var cartNumber = $('#chepai').val();
		var vipName = $('#cartname').val();
		var vipPhone = $('#phone').val();
		var startTime = $('#starttime').val();
		var endTime = $('#endtime').val();
		vipCart.cartNumber=cartNumber;
		vipCart.vipName=vipName;
		vipCart.vipPhone=vipPhone;
		vipCart.startTimeStr=startTime;
		vipCart.endTimeStr=endTime;
		$.ajax({
			url:addUrl,
			data:vipCart,
			type:"POST",
			success : function(data){
				if (data.success) {
					alert('办理成功');				
				} else {
					alert('办理包月失败！');
				}
			}
		});
	});
	$('#tijiao').click(function(){
		alert("nihao");
		var vipCart=new Object();
		var cartNumber = $('#cartnumber').val();
		var time= $('#time').val();
		vipCart.cartNumber=cartNumber;
		vipCart.time=time;
		$.ajax({
			url:xufeiUrl,
			data:vipCart,
			type:"GET",
			success : function(data){
				if (data.success) {
					alert('续费成功');				
				} else {
					alert('续费失败！');
				}
			}
		});
	});
});