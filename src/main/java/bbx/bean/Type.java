package bbx.bean;

import bbx.utils.Utils;

public class Type {
    private Integer typeId;

    private String typeParent;

    private String typeName;

    private String accountbookId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeParent() {
        return typeParent;
    }

    public void setTypeParent(String typeParent) {
        this.typeParent = typeParent == null ? null : typeParent.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getAccountbookId() {
        return accountbookId;
    }

    public void setAccountbookId(String accountbookId) {
        this.accountbookId = accountbookId == null ? null : accountbookId.trim();
    }

	@Override
	public String toString() {
		String typeLevel = Utils.isStringEmptyOrNull(typeParent) ? "一级目录" : "二级目录";
		return "Type [typeLevel=" + typeLevel + ", typeName=" + typeName + "]";
	}
    
    
}