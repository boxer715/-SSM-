package bbx.bean;

import java.util.ArrayList;
import java.util.List;

public class ExpenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExpenseIdIsNull() {
            addCriterion("expense_id is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIdIsNotNull() {
            addCriterion("expense_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseIdEqualTo(Integer value) {
            addCriterion("expense_id =", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotEqualTo(Integer value) {
            addCriterion("expense_id <>", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdGreaterThan(Integer value) {
            addCriterion("expense_id >", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("expense_id >=", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdLessThan(Integer value) {
            addCriterion("expense_id <", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdLessThanOrEqualTo(Integer value) {
            addCriterion("expense_id <=", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdIn(List<Integer> values) {
            addCriterion("expense_id in", values, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotIn(List<Integer> values) {
            addCriterion("expense_id not in", values, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdBetween(Integer value1, Integer value2) {
            addCriterion("expense_id between", value1, value2, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("expense_id not between", value1, value2, "expenseId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdIsNull() {
            addCriterion("accountBook_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdIsNotNull() {
            addCriterion("accountBook_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdEqualTo(String value) {
            addCriterion("accountBook_id =", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdNotEqualTo(String value) {
            addCriterion("accountBook_id <>", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdGreaterThan(String value) {
            addCriterion("accountBook_id >", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdGreaterThanOrEqualTo(String value) {
            addCriterion("accountBook_id >=", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdLessThan(String value) {
            addCriterion("accountBook_id <", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdLessThanOrEqualTo(String value) {
            addCriterion("accountBook_id <=", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdLike(String value) {
            addCriterion("accountBook_id like", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdNotLike(String value) {
            addCriterion("accountBook_id not like", value, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdIn(List<String> values) {
            addCriterion("accountBook_id in", values, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdNotIn(List<String> values) {
            addCriterion("accountBook_id not in", values, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdBetween(String value1, String value2) {
            addCriterion("accountBook_id between", value1, value2, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andAccountbookIdNotBetween(String value1, String value2) {
            addCriterion("accountBook_id not between", value1, value2, "accountbookId");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountIsNull() {
            addCriterion("expense_amount is null");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountIsNotNull() {
            addCriterion("expense_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountEqualTo(String value) {
            addCriterion("expense_amount =", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountNotEqualTo(String value) {
            addCriterion("expense_amount <>", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountGreaterThan(String value) {
            addCriterion("expense_amount >", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountGreaterThanOrEqualTo(String value) {
            addCriterion("expense_amount >=", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountLessThan(String value) {
            addCriterion("expense_amount <", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountLessThanOrEqualTo(String value) {
            addCriterion("expense_amount <=", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountLike(String value) {
            addCriterion("expense_amount like", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountNotLike(String value) {
            addCriterion("expense_amount not like", value, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountIn(List<String> values) {
            addCriterion("expense_amount in", values, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountNotIn(List<String> values) {
            addCriterion("expense_amount not in", values, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountBetween(String value1, String value2) {
            addCriterion("expense_amount between", value1, value2, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseAmountNotBetween(String value1, String value2) {
            addCriterion("expense_amount not between", value1, value2, "expenseAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentIsNull() {
            addCriterion("expense_comment is null");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentIsNotNull() {
            addCriterion("expense_comment is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentEqualTo(String value) {
            addCriterion("expense_comment =", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentNotEqualTo(String value) {
            addCriterion("expense_comment <>", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentGreaterThan(String value) {
            addCriterion("expense_comment >", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentGreaterThanOrEqualTo(String value) {
            addCriterion("expense_comment >=", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentLessThan(String value) {
            addCriterion("expense_comment <", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentLessThanOrEqualTo(String value) {
            addCriterion("expense_comment <=", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentLike(String value) {
            addCriterion("expense_comment like", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentNotLike(String value) {
            addCriterion("expense_comment not like", value, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentIn(List<String> values) {
            addCriterion("expense_comment in", values, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentNotIn(List<String> values) {
            addCriterion("expense_comment not in", values, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentBetween(String value1, String value2) {
            addCriterion("expense_comment between", value1, value2, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseCommentNotBetween(String value1, String value2) {
            addCriterion("expense_comment not between", value1, value2, "expenseComment");
            return (Criteria) this;
        }

        public Criteria andExpenseDateIsNull() {
            addCriterion("expense_date is null");
            return (Criteria) this;
        }

        public Criteria andExpenseDateIsNotNull() {
            addCriterion("expense_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseDateEqualTo(String value) {
            addCriterion("expense_date =", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateNotEqualTo(String value) {
            addCriterion("expense_date <>", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateGreaterThan(String value) {
            addCriterion("expense_date >", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateGreaterThanOrEqualTo(String value) {
            addCriterion("expense_date >=", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateLessThan(String value) {
            addCriterion("expense_date <", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateLessThanOrEqualTo(String value) {
            addCriterion("expense_date <=", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateLike(String value) {
            addCriterion("expense_date like", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateNotLike(String value) {
            addCriterion("expense_date not like", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateIn(List<String> values) {
            addCriterion("expense_date in", values, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateNotIn(List<String> values) {
            addCriterion("expense_date not in", values, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateBetween(String value1, String value2) {
            addCriterion("expense_date between", value1, value2, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateNotBetween(String value1, String value2) {
            addCriterion("expense_date not between", value1, value2, "expenseDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}