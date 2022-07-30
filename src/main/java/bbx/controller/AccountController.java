package bbx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bbx.bean.Account;
import bbx.bean.AccountBook;
import bbx.bean.Msg;
import bbx.service.AccountBookService;
import bbx.service.AccountService;
import bbx.utils.Utils;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/account",method=RequestMethod.GET)
	@ResponseBody
	public Msg getAccountBooks(@RequestParam("accountBookId")String accountBookId) {
		
		List<Account> accounts = accountService.getAccountBookByUserId(accountBookId);
		if(accounts.size()==0) {
			return Msg.fail().add("message", "目前没有账户，新建一个吧");
		} else {
			return Msg.success().add("accountList", accounts);
		}
	}
	
	@RequestMapping(value="/account",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveAccountBooks(Account account) {
		accountService.save(account);
		return Msg.success();
	}
	
	@RequestMapping(value="/account/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getAccount(@PathVariable("id")Integer id){
		
		Account acct = accountService.getAccount(id);
		return Msg.success().add("Account", acct);
	}
	
	//这里的pathVariable要写成Account里属性名accountId，不然参数account没有id。
	@ResponseBody
	@RequestMapping(value="/account/{accountId}",method=RequestMethod.PUT)
	public Msg saveEmp(Account account,HttpServletRequest request){
		accountService.updateAccount(account);
		return Msg.success()	;
	}
	
	//这里的pathVariable要写成Account里属性名accountId，不然参数account没有id。
	@ResponseBody
	@RequestMapping(value="/account/{accountId}",method=RequestMethod.DELETE)
	public Msg delete(@PathVariable("accountId") Integer id){
		accountService.deleteAccountById(id);
		return Msg.success().add("message", "delete successfully")	;
	}
}
