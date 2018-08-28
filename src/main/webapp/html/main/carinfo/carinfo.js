$(document).ready(function(){
	$("#query_carinfo").click(queryCarInfo);
	
});
function queryCarInfo() {
	var type = $("#select_isvip").val();
	var url="";
	var title=[];
	var data_column=[];
	var title_column_width=[];
	
	if(type == "0"){
		//临时
		url = "../../../carinfo/querycarinfo.action";
		title = [ "车牌号", "进入时间","离开时间","是否结算" ];
		data_column = [ "cart_number", "input_time_str","remove_time_str" ,"status"];
		title_column_width = [ "25%",  "25%", "25%","25%" ];
	}else{
		url = "../../../vipcarinfo/queryvipcarinfo.action";
		title = [ "车牌号", "姓名", "联系方式", "开始时间","结束时间" ];
		data_column = [ "cart_number", "vip_name", "vip_phone", "start_time_str","end_time_str" ];
		title_column_width = [ "25%", "10%", "25%", "20%","20%" ];

	}
	var car = {
			url : url,
			data : null,
			table_obj : $("#vipcarinfo_table"),
			title : title,
			data_column : data_column,
			title_column_width : title_column_width,
			optr : [ "" ],
			optr_project : [ ""],
			optr_callback : [""],
			optr_column_width : [ "" ],
	};
		myShowTable(car);
		$("#carinfo").show();
}
function myShowTable(parm) {
	var t = parm.table_obj;
	t.html("");
	var head_tr = $("<tr>");
	var td0 = $("<td>").text("选择");
	var check_all = $("<input type='checkbox' id='checkall'>");
	check_all.click(checkAll_or_not);

	td0.append(check_all);
	td0.css("width", "5%");
	head_tr.append(td0);
	for (var i = 0; i < parm.title.length; i++) {
		var head_td = $("<td>").text(parm.title[i]);
		head_td.css("width", parm.title_column_width[i]);
		head_tr.append(head_td);
	}
	for (var i = 0; i < parm.optr.length; i++) {
		var head_td = $("<td>").text(parm.optr[i]);
		head_td.css("width", parm.optr_column_width[i]);
		head_tr.append(head_td);
	}
	t.append(head_tr);
	// 表头-----------------------------------结束--------------
	$.ajax({
		url : parm.url,
		data : parm.data,
		type : "post",
		success : function(data) {
			console.log(data,"...................")
			data.forEach(function(item,index){
				if(item.status==1){
					item.status = "已结算";
				}else{
					item.status = "未结算";
					
				}
			})
			initPage();
			$(data).each(
					function(i, d) {
						var data_tr = $("<tr>");
						var checkbox = $(
								"<input type='checkbox' name='data_checkbox'>")
								.val(d.id);
						var td0 = $("<td>").append(checkbox);
						data_tr.append(td0);
						for (var i = 0; i < parm.title.length; i++) {
							var data_td = $("<td>").append(
									d[parm.data_column[i]]);
							data_tr.append(data_td);
						}
						// --操作
						var td_optr = $("<td>");
						for (var i = 0; i < parm.optr_project.length; i++) {
							var func = parm.optr_callback[i] + "('" + d.id
									+ "')";
							var a_optr = $("<a onclick=" + func + ">").text(
									parm.optr_project[i]);
							td_optr.append(a_optr);
							data_tr.append(td_optr);
						}
						t.append(data_tr);
					});
		}
	});
}
