package bbx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bbx.bean.Msg;
import bbx.bean.User;
import bbx.bean.UserExample;
import bbx.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public Boolean checkUserByName(String userName) {
		UserExample userExm = new UserExample();
		userExm.createCriteria().andUserNameEqualTo(userName);
		return userMapper.countByExample(userExm)!=0;
	}

	public void saveUser(User user) {
		userMapper.insertSelective(user);
	}

	public int checkUser(String userName, String userPassword) {
		UserExample userExm = new UserExample();
		userExm.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword);
		return userMapper.selectByExample(userExm).size();
	}

}
