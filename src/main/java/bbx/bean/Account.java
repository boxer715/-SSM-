package bbx.bean;

public class Account {
    private Integer accountId;

    private String accountName;

    private String accountAmount;

    private String accountbookId;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(String accountAmount) {
        this.accountAmount = accountAmount == null ? null : accountAmount.trim();
    }

    public String getAccountbookId() {
        return accountbookId;
    }

    public void setAccountbookId(String accountbookId) {
        this.accountbookId = accountbookId == null ? null : accountbookId.trim();
    }

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountAmount=" + accountAmount
				+ ", accountbookId=" + accountbookId + "]";
	}
    
    
}