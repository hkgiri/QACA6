package collection.list;

import java.util.ArrayList;

public class P13 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		//to remove the element from the Arraylist
		//al.remove(2);
		al.remove(Integer.valueOf(20));
		System.out.println(al);
	}
}
