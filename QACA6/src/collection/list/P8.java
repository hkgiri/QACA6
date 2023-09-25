package collection.list;

import java.util.ArrayList;

public class P8 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Smith");
		al.add("Adams");
		al.add("John");
		System.out.println("Total Test Engineers "+al.size());
		System.out.println("Test Engineers list "+al);
		
		ArrayList al1=new ArrayList();
		al1.add("Miller");
		al1.add("King");
		al1.add("Jacob");
		System.out.println("Total Test Engineers "+al1.size());
		System.out.println("Test Engineers list "+al1);
		
		//to add TestEngineer list to developers list
		//al.addAll(al1);
		System.out.println("Total All "+al.size());
		System.out.println(al);
		al.addAll(2,al1);
		System.out.println(al.size());
		System.out.println(al);
	}
}
