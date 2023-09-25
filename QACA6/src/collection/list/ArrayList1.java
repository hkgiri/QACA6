package collection.list;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		
		//to convert ArrayList to Array using forEach loop.
		Object[] o=ls.toArray();
		System.out.println(o);
		for (Object obj : ls) {
			System.out.println(obj);
		}
	}
}
