package collection.list;

import java.util.ArrayList;

public class P12 {
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
		al1.add(10);
		//al1.add(15);
		System.out.println(al1);
		//to check whether element of al1 is present inside al or not.
		System.out.println(al.containsAll(al1));
	}
}
