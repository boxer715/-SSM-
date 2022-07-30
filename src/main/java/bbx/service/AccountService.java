package bbx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bbx.bean.Account;
import bbx.bean.AccountExample;
import bbx.mapper.AccountMapper;

@Service
public class AccountService {
	
	@Autowired
	AccountMapper accountMapper;

	public List<Account> getAccountBookByUserId(String accountBookId) {
		AccountExample acctExm = new AccountExample();
		acctExm.createCriteria().andAccountbookIdEqualTo(accountBookId);
		return accountMapper.selectByExample(acctExm);
	}

	public void save(Account account) {
		accountMapper.insertSelective(account);
	}

	public Account getAccount(Integer id) {
		return accountMapper.selectByPrimaryKey(id);
	}

	public void updateAccount(Account account) {
		accountMapper.updateByPrimaryKeySelective(account);
	}

	public void deleteAccountById(Integer id) {
		accountMapper.deleteByPrimaryKey(id);
	}

}
