package collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

class Book
{
	int bid;
	String title;
	double price;
	Book(){}
	public Book(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}
	
}
public class DriverBook {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Book(101,"Manual",350));
		ls.add(new Book(102,"SQL",250));
		ls.add(new Book(103,"Java",1000));
		ls.add(new Book(104,"Selenium",800));
		System.out.println(ls);
		
		ListIterator<Book> li=ls.listIterator();
		//add a new book if the price of book is 250 
		while(li.hasNext())
		{
			Book b=li.next();
			if(b.price==250)
			{
				li.add(new Book(105,"Api",300));
			}
		}
		System.out.println(ls);
		//Remove a book if the title of book is java
		while(li.hasPrevious())
		{
			Book b=li.previous();
			if (b.title.equalsIgnoreCase("java")){
				li.remove();
			}
		}
		System.out.println(ls);
		
		
		
	}
}
