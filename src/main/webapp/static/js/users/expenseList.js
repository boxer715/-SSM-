function init(){
	loadAccounts();
	loadOneTypes();
	loadTwoTypes(1);
	$(document).on("change","#TypeOneInNewExpense",loadTwoTypes);
	$(document).on("click","#oneType_add_btn",addOneType);
	$(document).on("click","#twoType_add_btn",addTwoType);
	$(document).on("click","#type_save_btn",addType);
}

function addType(){
	var baseUrl=localStorage.getItem("baseUrl");
	var accountBookId = localStorage.getItem("accountBookId");
	$("#hiddenAccountbookId").val(accountBookId)

	$.ajax({
		url:baseUrl+"type",
		data:$("#TypeAddModal form").serialize(),
		type:"POST",
		success:function(result){
			//1、关闭模态框
			$("#TypeAddModal").modal('hide');
			$("#TypeAddModal input[name=typeName]").val("");
			$("#hiddenParentId").val("");
			//2. 加载
			var newType = result.extend.type;
			var newParent = newType.typeParent;
			if(newParent==null){
				//说明新加了一个一级标签
				loadOneTypes();

			} else {
				//否则添加了一个二级标签
				loadTwoTypes();
			}
		}
	});
	
}

function addOneType(){
	$("#addTypeLabel").text("添加一级类别");
	openAddTypeModal();
}

function addTwoType(){
	$("#addTypeLabel").text("添加二级类别");
	$("#hiddenParentId").val($("#TypeOneInNewExpense").val());
	openAddTypeModal();
}

function openAddTypeModal(){
	//弹出模态框
	$("#TypeAddModal").modal({
		backdrop:"static"
	});
}

function loadAccounts(){
	var baseUrl=localStorage.getItem("baseUrl");
	var accountBookId = localStorage.getItem("accountBookId");
	var accountSelect = $("#AccountInNewExpense");
	$.ajax({
		url:baseUrl+"account",
		data:"accountBookId="+accountBookId,
		type:"GET",
		success:function(result){
			if(result.code=="100"){
				var accounts = result.extend.accountList;
				$.each(accounts, function(){
					var accountOption = $("<option></option>").append(this.accountName).attr("value",this.accountId);
					accountOption.appendTo(accountSelect);
				});
			} else {
				$("#AccountInNewExpense option").text("无账户");
			}
			
		}
	});
}

function loadOneTypes(){
	var baseUrl=localStorage.getItem("baseUrl");
	var accountBookId = localStorage.getItem("accountBookId");
	var typeOneSelect = $("#TypeOneInNewExpense");
	typeOneSelect.empty();
	
	$.ajax({
		url:baseUrl+"oneTypes",
		data:"accountBookId="+accountBookId,
		type:"GET",
		success:function(result){
				var types = result.extend.typeOneList;
				$.each(types, function(){
					var typeOneOption = $("<option></option>").append(this.typeName).attr("value",this.typeId);
					typeOneOption.appendTo(typeOneSelect);
				});
				$("#TypeOneInNewExpense").val(1);
		}
	});
}

function loadTwoTypes(pId){
	var parentId = isNumber(pId) ? pId : parseInt($("#TypeOneInNewExpense").val());
	var baseUrl=localStorage.getItem("baseUrl");
	var accountBookId = localStorage.getItem("accountBookId");
	var typeTwoSelect = $("#TypeTwoInNewExpense");
	typeTwoSelect.empty();
	$.ajax({
		url:baseUrl+"twoTypes",
		data:"accountBookId="+accountBookId+"&parentId="+parentId,
		type:"GET",
		success:function(result){
			var types = result.extend.typeTwoList;
			if(types.length==0){
				var typeTwoOption = $("<option></option>").append("暂无二级分类");
				typeTwoOption.appendTo(typeTwoSelect);
			} else {
				$.each(types, function(){
					var typeTwoOption = $("<option></option>").append(this.typeName).attr("value",this.typeId);
					typeTwoOption.appendTo(typeTwoSelect);
				});
			}
		}
	});
}

function isNumber(value) {
	return typeof value === 'number' && !isNaN(value);
}