package bbx.bean;

public class Expense {
    private Integer expenseId;

    private String accountId;

    private String typeId;

    private String accountbookId;

    private String expenseAmount;

    private String expenseComment;

    private String expenseDate;

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getAccountbookId() {
        return accountbookId;
    }

    public void setAccountbookId(String accountbookId) {
        this.accountbookId = accountbookId == null ? null : accountbookId.trim();
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount == null ? null : expenseAmount.trim();
    }

    public String getExpenseComment() {
        return expenseComment;
    }

    public void setExpenseComment(String expenseComment) {
        this.expenseComment = expenseComment == null ? null : expenseComment.trim();
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate == null ? null : expenseDate.trim();
    }

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", accountId=" + accountId + ", typeId=" + typeId
				+ ", accountbookId=" + accountbookId + ", expenseAmount=" + expenseAmount + ", expenseComment="
				+ expenseComment + ", expenseDate=" + expenseDate + "]";
	}
    
}