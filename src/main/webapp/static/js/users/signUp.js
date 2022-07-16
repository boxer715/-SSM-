$(document).on("change","#signUpUserName",function(){
	checkUserNameValid();
});

$(document).on("change","#signUpEmail",function(){
	checkEmailValid();
});

$(document).on("change",".signUpPassword",function(){
	checkPassword();
});

$(document).on("click","#signUpBtn",function(){
	console.log(check_valid_form());
	if(!check_valid_form()){
		return false;
	}
	console.log("ajax start");
	
	$.ajax({
	    url:localStorage.getItem("baseUrl")+'user',
	    type:"POST",
	    data:$("#addNewUser").serialize(),
	    success:function(result){
	    	console.log(result);
	    	return;
	    }
	});
	
	window.location.href = localStorage.getItem("baseUrl")+"remarkSignUp";
})

function checkUserNameValid(){
	var output;
	var userName = $("#signUpUserName").val();
	console.log("check "+userName);
	$.ajax({
		url:localStorage.getItem("baseUrl")+'checkUser',
		data:"userName="+userName,
		type:"POST",
		success:function(result){
			if(result.code==100){
				show_validate_msg("#signUpUserName","success","用户名可用");
				$("#signUpBtn").attr("ajax-va","success");
				output=true;
			}else{
				show_validate_msg("#signUpUserName","error",result.extend.va_msg);
				$("#signUpBtn").attr("ajax-va","error");
				output=false;
			}
		}
	});
	return output;
}

function checkEmailValid(){
	var email = $("#signUpEmail").val();
	var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
	if(regEmail.test(email)){
		show_validate_msg("#signUpEmail","success","邮箱可用");
		$("#signUpBtn").attr("ajax-va","success");
		return true;
	}else{
		show_validate_msg("#signUpEmail","error","邮箱格式不正确");
		$("#signUpBtn").attr("ajax-va","error");
		return false;
	}
}

function checkPassword(){
	var password1 = $("#signUpPassword1").val();
	var password2 = $("#signUpPassword2").val();
	var inputAll = (password1!='' && password2!='');
	if(inputAll && password1 != password2){
		show_validate_msg("#signUpPassword1","error","");
		show_validate_msg("#signUpPassword2","error","密码不一致");
		$("#signUpBtn").attr("ajax-va","error");
		return false;
	} else {
		show_validate_msg("#signUpPassword1","success","");
		show_validate_msg("#signUpPassword2","success","");
		$("#signUpBtn").attr("ajax-va","success");
		return true;
	}
}

//显示校验结果的提示信息
function show_validate_msg(ele,status,msg){
	//清除当前元素的校验状态
	$(ele).parent().removeClass("has-success has-error");
	$(ele).next("span").text("");
	if("success"==status){
		$(ele).parent().addClass("has-success");
		$(ele).next("span").text(msg);
	}else if("error" == status){
		$(ele).parent().addClass("has-error");
		$(ele).next("span").text(msg);
	}
}

function check_valid_form(){
	
	return $("#signUpUserName").parent().hasClass("has-success") && checkEmailValid() && checkPassword();
}