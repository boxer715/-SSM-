package bbx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bbx.bean.Msg;
import bbx.bean.User;
import bbx.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value="/checkUser",method=RequestMethod.POST)
	@ResponseBody
	public Msg checkuser(@RequestParam("userName")String userName) {//先判断用户名是否是合法的表达式;
	    String regx = "(^[a-zA-Z0-9_-]{5,16}$)|(^[\u2E80-\u9FFF]{2,5})";
	    if(!userName.matches(regx)){
	        return Msg.fail().add("va_msg", "用户名必须是5-16位数字和字母的组合或者2-5位中文");
	    }
	    
	    //数据库用户名重复校验
	    Boolean exist = userService.checkUserByName(userName);
	    if(!exist) {
	        return Msg.success();
	    } else {
	        return Msg.fail().add("va_msg", "用户名不可用");
	    }   
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveUser(User user) {
	    userService.saveUser(user);
	    return Msg.success();
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Msg login(String userName, String userPassword) {
	    List<User> users = userService.checkUser(userName, userPassword);
	    if(users.size()==0) {
	    	return Msg.fail().add("message", "用户名或密码错误");
	    } else {
	    	return Msg.success().add("userId", users.get(0).getUserId());
	    }
	}
}
