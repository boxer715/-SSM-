package bbx.bean;

public class AccountBook {
    private Integer accountbookId;

    private String accountbookName;

    private String userId;

    public Integer getAccountbookId() {
        return accountbookId;
    }

    public void setAccountbookId(Integer accountbookId) {
        this.accountbookId = accountbookId;
    }

    public String getAccountbookName() {
        return accountbookName;
    }

    public void setAccountbookName(String accountbookName) {
        this.accountbookName = accountbookName == null ? null : accountbookName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

	@Override
	public String toString() {
		return "AccountBook [accountbookId=" + accountbookId + ", accountbookName=" + accountbookName + ", userId="
				+ userId + "]";
	}
    
}