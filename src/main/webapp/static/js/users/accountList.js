function loadAccount(){
	$.ajax({
		url:localStorage.getItem("baseUrl")+"account",
		data:"accountBookId="+localStorage.getItem("accountBookId"),
		type:"GET",
		success:function(result){
			console.log(result);
			if(result.code=="100"){
				//处理成功
				fillInAccount(result.extend.accountList);
			} else {
				//空账本
				fillInMessage(result.extend.message);
			}
		}
	});
}


//点击新建账本，弹出模态框
$(document).on("click","#newAccountBtn",function(){
	$("#AccountAddModal form")[0].reset();
	$("#hiddenAccountbookId").val(localStorage.getItem("accountBookId"));
	$("#AccountAddModal").modal({
		backdrop:"static"
	});
});
//点击保存账本
$(document).on("click","#account_save_btn",function(){
	$.ajax({
		url:localStorage.getItem("baseUrl")+"account",
		data:$("#AccountAddModal form").serialize(),
		type:"POST",
		success:function(result){
			$("#AccountAddModal").modal('hide');
			loadAccount();
		}
	});
});

//点击删除账本
$(document).on("click",".delete_btn",function(){
	var accountName = $(this).parents("tr").find("td:eq(0)").text();
	if(confirm("确认删除【"+accountName+"】吗？")){
		$.ajax({
			url:localStorage.getItem("baseUrl")+"account/"+$(this).attr("del-id"),
			type:"DELETE",
			success:function(result){
				console.log(result);
				loadAccount();
			}
		});
	}
});

//编辑账户模态框
$(document).on("click",".edit_btn",function(){
	//2、填充账户信息
	getAccount($(this).attr("edit-id"));
	
	//3、把账户的id传递给模态框的更新按钮 
	$("#account_update_btn").attr("edit-id",$(this).attr("edit-id"));
	$("#AccountUpdateModal").modal({
		backdrop:"static"
	});
})

function getAccount(id){
	$.ajax({
		url:localStorage.getItem("baseUrl")+"account/"+id,
		type:"GET",
		success:function(result){
			var account = result.extend.Account;
			$("#account_update_name").val(account.accountName);
			$("#account_update_amount").val(account.accountAmount);
		}
	})
}

//提交账户更新
$(document).on("click","#account_update_btn",function(){
	$.ajax({
		url:localStorage.getItem("baseUrl")+"account/"+$(this).attr("edit-id"),
		type:"PUT",
		data:$("#AccountUpdateModal form").serialize(),
		success:function(result){
			//alert(result.msg);
			//1、关闭对话框
			$("#AccountUpdateModal").modal("hide");
			//2、回到本页面
			loadAccount();
		}
	});
})

function fillInMessage(message){
	var acct = $("#account_div");
	var div25 = $('<div class="col-md-8 col-md-offset-2" style="height:25px;"></div>');
	var div50 = $('<div class="col-md-8 col-md-offset-2" style="height:50px;"></div>');
	acct.empty();
	var messageH2 = $('<h2></h2>').append(message);
	acct.append(div25)
			.append(div50.addClass("center").append(messageH2));
}

function fillInAccount(accountList){
	var acctTbl = $("#account_table tbody");
	acctTbl.empty();
	$.each(accountList, function(index, item){
		var accountName = $("<td></td>").append(item.accountName);
		var accountAmount = $("<td></td>").append(item.accountAmount);
		var editSpan = $("<span></span>").addClass("glyphicon glyphicon-pencil").append("edit");
		var editButton = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn").append(editSpan);
		editButton.attr("edit-id",item.accountId);
		var deleteSpan = $("<span></span>").addClass("glyphicon glyphicon-trash").append("delete");
		var deleteButton = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn").append(deleteSpan);
		deleteButton.attr("del-id",item.accountId);
		var operationTd = $("<td></td>").append(editButton).append(" ").append(deleteButton);
		
		$("<tr></tr>").append(accountName)
					  .append(accountAmount)
					  .append(operationTd)
					  .appendTo(acctTbl);
	})
}