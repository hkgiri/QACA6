package Object_Class;

public class BookDriver {
	public static void main(String[] args) {
		Book b1=new Book(123,200,"Who Will Cry When You Die ");
		Book b2=new Book(124,450,"Panchtantra");
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));//false.
		System.out.println(b1.hashCode()==b2.hashCode());//false.
	}
}
