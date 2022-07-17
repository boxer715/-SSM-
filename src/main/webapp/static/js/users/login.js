$(document).on("click","#signUpBtn",function(){
	console.log("click signUpBtn");
	window.location.href = localStorage.getItem("baseUrl")+'signUp';
})

$(document).on("click","#signInBtn",function(){
	console.log("submit form");
	$.ajax({
	    url:localStorage.getItem("baseUrl")+'login',
	    type:"POST",
	    data:$("#loginForm").serialize(),
	    success:function(result){
	    	console.log(result);
	    	if(result.code==200){
	    		$("#warningMessage").css("color","#F00").text(result.extend.message);
	    	} else {
	    		localStorage.setItem("userId",result.extend.userId);
	    		window.location.href = localStorage.getItem("baseUrl")+"remarkLogInSuccess";
	    	}
	    }
	});
})


	

//		$.ajax({
//		    url:localStorage.getItem("baseUrl")+'user',
//		    type:"POST",
//		    data:$("#addNewUser").serialize(),
//		    success:function(result){
//		    	console.log(result);
//		    	return;
//		    }
//		});

