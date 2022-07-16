

$(document).on("click","#signUpBtn",function(){
	console.log("click signUpBtn");
	window.location.href = localStorage.getItem("baseUrl")+'signUp';
})