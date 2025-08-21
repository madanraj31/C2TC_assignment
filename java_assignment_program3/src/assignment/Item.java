package assignment;

public class Item {
	
	protected int id;
	protected String title;
	
	public Item(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + "]";
	}
	
}
