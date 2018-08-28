

function initPage() {
	$.ajax({
		url :"../../../PageController/getPageModel.action",
		type :"post",
		success: initPageSuccess
	});
}

function initPageSuccess(data){
	var pagination =$("#pagination");
	pagination.html("");
	var first = $("<li><a href='#'>&laquo;</a></li>");
	pagination.append(first);
	for(var i=0;i<data.maxpage;i++){
		var li  = $("<li>");
		var a = $("<a>");
		a.text(i+1);
		li.append(a);
		pagination.append(li);
	}
	var last = $("<li><a href='#'>&raquo;</a></li>");
	pagination.append(last);
}






