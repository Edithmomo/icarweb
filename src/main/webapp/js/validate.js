// 手机号码
// 验证规则：11位数字，以1开头。
function checkMobile(dom) {
	var re = /^1\d{10}$/
	if (re.test(dom.value)) {
		if($("#valierr")[0] != undefined){
			$("#valierr").html("正确")
			$("#valierr").css({"color":"green"});
		}else{
			$(dom).after("<span id='valierr' style='display:inline;position:relative;top:-20px;color:green;' >正确</span>");
		}
		return true;
	} else {
		if($("#valierr")[0] != undefined){
			$("#valierr").html("错误")
			$("#valierr").css({"color":"red"});
		}else{
			$(dom).after("<span id='valierr' style='display:inline;position:relative;top:-20px;color:red;' >错误</span>");
		}
		return false;
	}
}
//身份证验证
function testid(dom) {
	if($("#vali_card")[0] == undefined){
		$(dom).after("<span id='vali_card' style='display:inline;position:relative;top:-20px;left: 50px;' >错误</span>");
	}
	  var id = dom.value;
	  if(id == ""){
		  $("#vali_card").html('身份证号不能为空')
		  $("#vali_card").css({"color":"red"});
		  return false;
	  }
    // 1 "验证通过!", 0 //校验不通过
       var format = /^(([1][1-5])|([2][1-3])|([3][1-7])|([4][1-6])|([5][0-4])|([6][1-5])|([7][1])|([8][1-2]))\d{4}(([1][9]\d{2})|([2]\d{3}))(([0][1-9])|([1][0-2]))(([0][1-9])|([1-2][0-9])|([3][0-1]))\d{3}[0-9xX]$/;
       // 号码规则校验
       if(!format.test(id)){
    	   $("#vali_card").html('身份证号码不符合规范')
 		  $("#vali_card").css({"color":"red"});
    	   return false;
       }
       // 区位码校验
       // 出生年月日校验 前正则限制起始年份为1900;
       var year = id.substr(6,4),// 身份证年
           month = id.substr(10,2),// 身份证月
           date = id.substr(12,2),// 身份证日
           time = Date.parse(month+'-'+date+'-'+year),// 身份证日期时间戳date
           now_time = Date.parse(new Date()),// 当前时间戳
           dates = (new Date(year,month,0)).getDate();// 身份证当月天数
       if(time>now_time||date>dates){
    	   $("#vali_card").html('出生日期不符合规范')
  		  $("#vali_card").css({"color":"red"});
    	   return false;
       }
       // 校验码判断
       var c = new Array(7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2);   // 系数
       var b = new Array('1','0','X','9','8','7','6','5','4','3','2');  // 校验码对照表
       var id_array = id.split("");
       var sum = 0;
       for(var k=0;k<17;k++){
           sum+=parseInt(id_array[k])*parseInt(c[k]);
       }
       if(id_array[17].toUpperCase() != b[sum%11].toUpperCase()){
    	   $("#vali_card").html('身份证校验码不符合规范');
   		  $("#vali_card").css({"color":"red"});
    	   return false;
       }
       $("#vali_card").html('身份证符合规范');
       $("#vali_card").css({"color":"green"});
       return true;
}
//车牌号验证
function isVehicleNumber(vehicleNumber) {
    var result = false;
    if (vehicleNumber.length == 7){
      var express = /^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$/;
      result = express.test(vehicleNumber);
      if(result==false){
    	  alert("车牌号输入不合法");
      }
    }else{
    	alert("车牌号输入不合法");
    }  
}
//姓名校验
function isVehicleName(vehicleName) {
    if (vehicleName.length > 7 || vehicleName.length<1){
    	  alert("不合法输入");
      }
}
/*判断输入是否为合法的手机号码*/
function isphone2(inputString)
{
     var partten = /^1[3,5,8]\d{9}$/;
     var fl=false;
     if(partten.test(inputString))
     {
    	 return true;
     }else{  
          alert('您输入的不是手机号码');
     }
}
//日期校验
function check(date){
	var a = /^(\d{4})-(\d{2})-(\d{2})$/;
	if (!a.test(date)) { 
	alert("日期格式不正确!") ;
	return false;
	} 
	else
	return true;
} 

//姓名
function validateName(dom) {
	var nameReg = /^[\u4E00-\u9FA5]{2,8}$/;
	var name = dom.value;
	if($("#vali_name")[0] == undefined){
		$(dom).after("<span id='vali_name' style='display:inline;position:relative;top:-20px;left: 50px;' >错误</span>");
	}
	  if(name == ""){
		  $("#vali_name").html('姓名不能为空')
		  $("#vali_name").css({"color":"red"});
		  return false ;
	  }
	if (!nameReg.test(name)) {
		$("#vali_name").html('姓名必需为2~8位汉字组成')
		$("#vali_name").css({"color":"red"});
		return false;
	}
	$("#vali_name").html('正确')
	$("#vali_name").css({"color":"green"});
	return true;
}

//密码
function validate_password(dom) {
	var pw = dom.value;
	if($("#vali_pw")[0] == undefined){
		$(dom).after("<span id='vali_pw' style='display:inline;position:relative;top:-20px;left: 50px;' ></span>");
	}
	  if(pw == ""){
		  $("#vali_pw").html('密码不能为空')
		  $("#vali_pw").css({"color":"red"});
		  return false ;
	  }
	if (pw.length < 6 || pw.length > 12){
		$("#vali_pw").html('密码由6~12字符组成')
		$("#vali_pw").css({"color":"red"});
		return false;
	}
	$("#vali_pw").html('正确')
	$("#vali_pw").css({"color":"green"});
	return true;
}
