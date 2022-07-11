$(function(){
	var current = $("#currentPage");
	var pageNums = $("li.pageNums");
	
	//for(pagenum in pageNUms) 不会用
	for(var i=0; i<pageNums.length; i++){
		var checkPage = pageNums[i];
		//checkPage.children[0]是<a>标签，没有text()方法，只有text属性
		if(current.text()==checkPage.children[0].text){
			$(checkPage).addClass("active");
		}
	}
});