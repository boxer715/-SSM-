function loadAccountBook(){
	$.ajax({
		url:localStorage.getItem("baseUrl")+"accountBook",
		data:"userId="+localStorage.getItem("userId"),
		type:"GET",
		success:function(result){
			console.log(result);
			if(result.code=="100"){
				//处理成功
				fillInAccountBook(result.extend.accountBookList);
			} else {
				//空账本
				fillInMessage(result.extend.message);
			}
		}
	});
}
//退出
$(document).on("click","#logOutBtn",function(){
	localStorage.removeItem("userId");
	window.location.href = localStorage.getItem("baseUrl");
});
//点击新建账本，弹出模态框
$(document).on("click","#newAccountBookBtn",function(){
	$("#AccountBookAddModal form")[0].reset();
	$("#hiddenUserId").val(localStorage.getItem("userId"));
	$("#AccountBookAddModal").modal({
		backdrop:"static"
	});
});
//点击保存账本
$(document).on("click","#accountBook_save_btn",function(){
	$.ajax({
		url:localStorage.getItem("baseUrl")+"accountBook",
		data:$("#AccountBookAddModal form").serialize(),
		type:"POST",
		success:function(result){
			$("#AccountBookAddModal").modal('hide');
			loadAccountBook();
		}
	});
});

//单击账本跳转
$(document).on("click",".accountBookBtn",function(){
	localStorage.setItem("accountBookId",$(this).attr("accountbookid"));
	window.location.href = localStorage.getItem("baseUrl")+"expenseList";
})

function fillInMessage(message){
	var acctBook = $("#accountBooks");
	var div25 = $('<div class="col-md-8 col-md-offset-2" style="height:25px;"></div>');
	var div50 = $('<div class="col-md-8 col-md-offset-2" style="height:50px;"></div>');
	acctBook.empty();
	var messageH2 = $('<h2></h2>').append(message);
	acctBook.append(div25)
			.append(div50.addClass("center").append(messageH2));
}

function fillInAccountBook(accountBookList){
	var acctBook = $("#accountBooks");
	acctBook.empty();
	$.each(accountBookList, function(index, item){
		var div25 = $('<div class="col-md-8 col-md-offset-2" style="height:25px;"></div>');
		var div50 = $('<div class="col-md-8 col-md-offset-2" style="height:50px;"></div>');
		var btnBlue = $('<button type="button" class="btn btn-info btn-lg btn-block accountBookBtn"></button>');
		var btnWhite = $('<button type="button" class="btn btn-default btn-lg btn-block accountBookBtn"></button>');
		var btn = item.accountbookId%2==0 ? btnBlue : btnWhite;
		btn.attr("accountBookId", item.accountbookId);
		div50.append(btn.append(item.accountbookName));
		acctBook.append(div25)
				.append(div50);
	})
}