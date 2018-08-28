$(function(){
	console.log("12454545")
	$("#query_btn").click(queryEmployee);
})
function queryEmployee() {
	var parm = {
			url : "../../../usermanager/queryAllUserInfo.action",
			data : null,
			table_obj : $("#datatable"),
			title : [ "员工工号", "姓名","身份证号", "权限", "密码" ],
			data_column : [ "user_number", "user_name", "user_card", "kind_id", "user_pw" ],
			title_column_width : [ "25%", "15%", "25%", "15%", "15%" ],
		};
	myShowTable(parm);
}
function myShowTable(parm) {
	var t = parm.table_obj;
	t.html("");
	var head_tr = $("<tr>");
	var check_all = $("<input type='checkbox' id='checkall'>");
	check_all.click(checkAll_or_not);
	for (var i = 0; i < parm.title.length; i++) {
		var head_td = $("<td>").text(parm.title[i]);
		head_td.css("width", parm.title_column_width[i]);
		head_tr.append(head_td);
	}
	t.append(head_tr);
	$.ajax({
		url : parm.url,
		data : parm.data,
		type : "post",
		success : function(data) {
			console.log(data,"...................")
			data.forEach(function(item,index){
				if(item.kind_id==1){
					item.kind_id = "普通员工";
				}else{
					item.kind_id = "管理员";
				}
			})
			initPage();
			$(data).each(
					function(i, d) {
						var data_tr = $("<tr>");
						var checkbox = $(
								"<input type='checkbox' name='data_checkbox'>")
								.val(d.id);
						for (var i = 0; i < parm.title.length; i++) {
							var data_td = $("<td>").append(
									d[parm.data_column[i]]);
							data_tr.append(data_td);
						}
						t.append(data_tr);
					});
		}
	});
}
