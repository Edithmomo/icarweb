$(function() {
	var addUrl="../../../cartadmin/addCart.action";
	var getMoneyUrl="../../../cartadmin/settlement.action";
	$('#submit').click(function(){
		var cart=new Object();
		var cartNumber = $('#lurucart').val();
		cart.cartNumber=cartNumber;
		alert("欢迎车牌号为:"+cart.cartNumber+"的车主光临");
		$.ajax({
			url:addUrl,
			data:cart,
			type:"POST",
			success : function(data){
				if (data.success) {
					if(data.isVip==true){
						alert("该车辆为包月车辆");
					}else{
						alert("该车辆为临时车辆");
						alert("停车费用为每小时5元");
					}				
				} else {
					alert('提交失败！');
				}
			}
		});
	});
	$('#shoufei').click(function() {
		var cart=new Object();
		var cartNumber = $('#cartshoufei').val();
		cart.cartNumber=cartNumber;
		alert("车牌号为:"+cart.cartNumber);
		$.ajax({
			url:getMoneyUrl,
			data:cart,
			type:"POST",
			success : function(data){
				alert(data.success);
				if (data.success) {
					if(data.isVip==true){
						alert("该车为包月车，欢迎下次光临");
					}else{
						alert("结算成功");
						alert("应收金额为："+data.payMoney);
					}
				} else {
					alert('提交失败！');
				}
			}
		});
	});
});