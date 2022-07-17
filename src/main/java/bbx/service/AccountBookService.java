package bbx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bbx.bean.AccountBook;
import bbx.bean.AccountBookExample;
import bbx.mapper.AccountBookMapper;

@Service
public class AccountBookService {
	
	@Autowired
	AccountBookMapper accountBookMapper;

	public List<AccountBook> getAccountBookByUserId(String userId) {
		AccountBookExample acctBookExm = new AccountBookExample();
		acctBookExm.createCriteria().andUserIdEqualTo(userId);
		return accountBookMapper.selectByExample(acctBookExm);
	}

	public void save(AccountBook accountBook) {
		accountBookMapper.insertSelective(accountBook);
	}
}
