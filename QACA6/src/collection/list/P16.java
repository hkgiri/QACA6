package collection.list;

import java.util.ArrayList;

public class P16 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add(20);
		al1.add(40);
		al1.add(60);
		al1.add(80);
		System.out.println(al1);
		//to the remove all the elements from collection the list.
		al.clear();
		System.out.println(al);
	}
}
