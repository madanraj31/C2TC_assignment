package assignment;

public class Book extends Item{
	private String author;

	public Book(int id, String title, String author) {
		super(id, title);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ",id="+id+",title="+title+"]";
	}

	

}

