package bbx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bbx.bean.AccountBook;
import bbx.bean.Msg;
import bbx.service.AccountBookService;
import bbx.utils.Utils;

@Controller
public class AccountBookController {
	
	@Autowired
	AccountBookService accountBookService;
	
	@RequestMapping(value="/accountBook",method=RequestMethod.GET)
	@ResponseBody
	public Msg getAccountBooks(@RequestParam("userId")String userId) {
		
		List<AccountBook> accountBooks = accountBookService.getAccountBookByUserId(userId);
		if(accountBooks.size()==0) {
			return Msg.fail().add("message", "目前没有账本，新建一个吧");
		} else {
			return Msg.success().add("accountBookList", accountBooks);
		}
	}
	
	@RequestMapping(value="/accountBook",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveAccountBooks(AccountBook accountBook) {
		accountBookService.save(accountBook);
		return Msg.success();
	}
	
}
