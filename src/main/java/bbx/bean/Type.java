package bbx.bean;

public class Type {
    private Integer typeId;

    private String typeParent;

    private String typeName;

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

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", typeParent=" + typeParent + ", typeName=" + typeName + "]";
	}
    
}