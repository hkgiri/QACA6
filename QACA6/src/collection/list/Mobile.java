package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

class Mob
{
	int mid;
	String brand;
	double price;
	Mob(){}
	public Mob(int mid, String name, double price) {
		super();
		this.mid = mid;
		this.brand = brand;
		this.price = price;
	}
	public String toString() {
		return "Mob [mid=" + mid + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
public class Mobile {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.add(new Mob(120,"Samsung",20000)));
		System.out.println(al.add(new Mob(121,"Apple",70000)));
		System.out.println(al.add(new Mob(122,"Redmi",16000)));
		System.out.println(al.add(new Mob(123,"Realme",19999)));
		
	}
}
