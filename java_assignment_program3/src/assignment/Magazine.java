package assignment;

public class Magazine extends Item {
	
	private int issuenumber;

	public Magazine(int id,String title,int issuenumber) {
		super(id, title);
		this.issuenumber = issuenumber;
	}

	public int getIssuenumber() {
		return issuenumber;
	}

	public void setIssuenumber(int issuenumber) {
		this.issuenumber = issuenumber;
	}
	@Override
	public String toString() {
		return "Magazine [issuenumber=" + issuenumber + ", id=" + id + ", title=" + title + "]";
	}
	
}

