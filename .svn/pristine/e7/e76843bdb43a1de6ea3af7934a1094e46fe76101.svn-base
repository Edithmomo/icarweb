function showTable(parm) {
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
	$
			.ajax({
				url : parm.url,
				data : parm.data,
				type : "post",
				success : function(data) {
					console.log(data)
					initPage();
					$(data)
							.each(
									function(i, d) {
										var data_tr = $("<tr>");
										if (parm.id != null && parm.id != "") {
											var checkbox = $(
													"<input type='checkbox' name='data_checkbox'>")
													.val(d[parm.id]);
										} else {
											var checkbox = $(
													"<input type='checkbox' name='data_checkbox'>")
													.val(d.id);
										}
										var td0 = $("<td>").append(checkbox);
										data_tr.append(td0);
										for (var i = 0; i < parm.title.length; i++) {
											var data_td = $("<td>").append(
													d[parm.data_column[i]]);
											data_tr.append(data_td);
										}
										// --操作
										var td_optr = $("<td>");
										if (parm.id != null && parm.id != "") {
											for (var i = 0; i < parm.optr_project.length; i++) {
												var func = parm.optr_callback[i]
														+ "('"
														+ d[parm.id]
														+ "')";
												var a_optr = $(
														"<a onclick=" + func
																+ ">").text(
														parm.optr_project[i]);
												td_optr.append(a_optr);
												data_tr.append(td_optr);
											}
										} else {
											for (var i = 0; i < parm.optr_project.length; i++) {
												var func = parm.optr_callback[i]
														+ "('" + d.id + "')";
												var a_optr = $(
														"<a onclick=" + func
																+ ">").text(
														parm.optr_project[i]);
												td_optr.append(a_optr);
												data_tr.append(td_optr);
											}
										}

										t.append(data_tr);
									});
				},
				error : function(err) {
					console.log("-----ajax失败---------")
					alert(err)
				}
			});
}

function show_new_div(parm) {
	// 显示遮罩层
	$("#backdiv").show();
	$(parm.div_obj).html("");
	var div_head = $("<div>").css("width", "100%").css("height", "10%").css(
			"background", "#47647c");
	var lable = $("<lable>").text(parm.title).css("color", "#ffffff");
	div_head.append(lable);
	var div_center = $("<div>").css("width", "100%").css("height", "80%").css(
			"background", "#ffffff");
	var div_foot = $("<div>").css("width", "100%").css("height", "10%").css(
			"background", "#47647c");
	//
	$(parm.div_obj).css("width", parm.width).css("height", parm.height).css(
			"margin", "0 auto").css("position", "absolute").css("top", "20%")
			.css("left", "20%").css("background", "#ffffff").css("z-index",
					"999999");
	div_center.load(parm.html, function(response, status, xhr) {
	});
	for (var i = 0; i < parm.buttons.length; i++) {
		var button = $("<button>").addClass("btn btn-primary").text(
				parm.buttons[i]);
		div_foot.append(button);
		button.click(parm.buttons_callback[i]);
	}
	$(parm.div_obj).append(div_head);
	$(parm.div_obj).append(div_center);
	$(parm.div_obj).append(div_foot);
	$(parm.div_obj).show();
}
function show_new_noheight(parm) {
	// 显示遮罩层
	$("#backdiv").show();
	$(parm.div_obj).html("");
	var div_head = $("<div>").css("width", "100%").css("height", "10%").css(
			"background", "#47647c");
	var lable = $("<lable>").text(parm.title).css("color", "#ffffff");
	div_head.append(lable);
	var div_center = $("<div>").css("width", "100%").css("height", "80%").css(
			"background", "#ffffff");
	var div_foot = $("<div>").css("width", "100%").css("height", "10%").css(
			"background", "#47647c");
	//
	$(parm.div_obj).css("width", parm.width).css(
			"margin", "0 auto").css("position", "absolute").css("top", "20%")
			.css("left", "20%").css("background", "#ffffff").css("z-index",
					"999999");
	div_center.load(parm.html, function(response, status, xhr) {
	});
	for (var i = 0; i < parm.buttons.length; i++) {
		var button = $("<button>").addClass("btn btn-primary").text(
				parm.buttons[i]);
		div_foot.append(button);
		button.click(parm.buttons_callback[i]);
	}
	$(parm.div_obj).append(div_head);
	$(parm.div_obj).append(div_center);
	$(parm.div_obj).append(div_foot);
	$(parm.div_obj).show();
}


// 全选全不选
function checkAll_or_not(e) {
	var checkbox = $(e.target).prop("checked");
	var data_checkbox = $("input[name='data_checkbox']");
	if (checkbox == true) {
		data_checkbox.prop("checked", true);
	} else if (checkbox == false) {
		data_checkbox.prop("checked", false);
	}
}

function delete_obj(parm) {
	var ch = $("input[name='data_checkbox']:checked");
	var ids = "";
	for (var i = 0; i < ch.length; i++) {
		ids += $(ch[i]).val() + ",";
	}

	if (confirm("确认删除吗?")) {
		var obj = new Object();
		if (parm.id != null && parm.id != "") {
			obj[parm.id] = ids;
		} else {
			obj.id = ids;
		}
		$.ajax({
			url : parm.url,
			type : "post",
			data : obj,
			success : parm.success
		});
	}
}
function checkdelete_obj() {
	var ch = $("input[name='data_checkbox']:checked");
	var ids = "";
	for (var i = 0; i < ch.length; i++) {
		ids += $(ch[i]).val() + ",";
	}
	return ids;
}
