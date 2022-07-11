package bbx.mapper;

import bbx.bean.Expense;
import bbx.bean.ExpenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpenseMapper {
    int countByExample(ExpenseExample example);

    int deleteByExample(ExpenseExample example);

    int deleteByPrimaryKey(Integer expenseId);

    int insert(Expense record);

    int insertSelective(Expense record);

    List<Expense> selectByExample(ExpenseExample example);

    Expense selectByPrimaryKey(Integer expenseId);

    int updateByExampleSelective(@Param("record") Expense record, @Param("example") ExpenseExample example);

    int updateByExample(@Param("record") Expense record, @Param("example") ExpenseExample example);

    int updateByPrimaryKeySelective(Expense record);

    int updateByPrimaryKey(Expense record);
}