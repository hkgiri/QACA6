package collection.list;
import java.util.ArrayList;
class Pen1 {
	int pid;
	String brand;
	double price;
	Pen1(){}
	public Pen1(int pid, String brand, double price) {
		super();
		this.pid = pid;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen1 [pid=" + pid + ", brand=" + brand + ", price=" + price + "]";
	}
	
}

public class GetPen {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		Pen1 p1=new Pen1(100,"Cello",25);
		al.add(p1);
		Pen1 p2=new Pen1(101,"renolds",45);
		al.add(p2);
		Pen1 p3=new Pen1(102,"Linc",20);
		al.add(p3);
		Pen1 p4=new Pen1(103,"Elkos",30);
		al.add(p4);
		System.out.println(al);
		//to access the elements using get()
		System.out.println("Print the only price elements with increase price 20%");
		for (int i = 0; i < al.size(); i++) {
			Pen1 p=(Pen1)al.get(i);
			System.out.println(p.price+(p.price*20)/100);
			
		}
		//to remove an object whose brand name Linc
		for (int i = 0; i < al.size(); i++) {
			Pen1 p=(Pen1)al.get(i);
			if (p.brand=="linc")
			{
				al.remove(i);
			}
		}
		System.out.println("After Removing the object");
		System.out.println(al);
	}
}

