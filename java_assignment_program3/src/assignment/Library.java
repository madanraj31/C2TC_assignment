package assignment;

import java.util.*;

public class Library {

private final List<Item> items;
	
	public Library() {
		this.items=new ArrayList<>();
	}
	
	public void addition(Item item) {
		items.add(item);
	}
	
	public void showAllItems() {
		System.out.println("Library contains");
		for(Item item : items) {
			if(items instanceof Book) {
				Book b=(Book) item;
				System.out.println("- "+b.getTitle()+" by " + b.getAuthor());
			}else if (item instanceof Magazine) {
				Magazine m=(Magazine) item;
				System.out.println("- "+m.getTitle() + " Issue " + m.getIssuenumber());
			}else {
				System.out.println("- " + item.getTitle());
			}
		}
	}
}
