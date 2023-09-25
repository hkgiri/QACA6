package Object_Class;

public class Book {
	int bid;
	double price;
	String name;
	
	public Book(){}

	public Book(int bid, double price, String name) {
		this.bid = bid;
		this.price = price;
		this.name = name;
	}
	
	public boolean equals(Object o)
	{
		Book temp=(Book)o;//downcasting 
		return this.bid==temp.bid&&this.price==temp.price&&this.name==temp.name;
	}
	public int hashCode()
	{
		int hc=0;
		hc=bid;
		hc=hc+(int)price;
		hc=hc+name.hashCode();
		return hc;
		
		
	}

}
