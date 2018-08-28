$(function(){
	console.log("12454545")
	$("#query_btn").click(queryEmployee);
})
function queryEmployee() {
	var parm = {
			url : "../../../usermanager/queryAllUserInfo.action",
			data : null,
			table_obj : $("#datatable"),
			title : [ "员工", "姓名", "权限", "密码" ],
			data_column : [ "user_number", "user_name", "kind_id", "user_pw" ],
			title_column_width : [ "25%", "15%", "25%", "15%" ],
			optr : [ "操作" ],
			optr_project : [ "编辑"],
			optr_callback : [ "edit"],
			optr_column_width : [ "15%" ]
		};
		showTable(parm);
}
