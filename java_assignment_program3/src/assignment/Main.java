package assignment;

public class Main {

	public static void main(String[] args) {

		Book book = new Book(101,"java basics", "james gosling");
		Magazine magazine = new Magazine(201,"Tech Today",45);
		book.toString();
		
		magazine.toString();
		
		Library l=new Library();
		l.addition(book);
		l.addition(magazine);
		
		l.showAllItems();
	}

}
