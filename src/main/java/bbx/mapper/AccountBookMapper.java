package bbx.mapper;

import bbx.bean.AccountBook;
import bbx.bean.AccountBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountBookMapper {
    int countByExample(AccountBookExample example);

    int deleteByExample(AccountBookExample example);

    int deleteByPrimaryKey(Integer accountbookId);

    int insert(AccountBook record);

    int insertSelective(AccountBook record);

    List<AccountBook> selectByExample(AccountBookExample example);

    AccountBook selectByPrimaryKey(Integer accountbookId);

    int updateByExampleSelective(@Param("record") AccountBook record, @Param("example") AccountBookExample example);

    int updateByExample(@Param("record") AccountBook record, @Param("example") AccountBookExample example);

    int updateByPrimaryKeySelective(AccountBook record);

    int updateByPrimaryKey(AccountBook record);
}