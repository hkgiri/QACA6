package collection.list;

import java.util.ArrayList;

public class P3 {
	public static void main(String[] args) {
		//add 10,20,30,40 to arrayLIst.
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println("Elements present inside the ArrayList "+a);
		System.out.println("the number of Element inside list "+a.size());
		
		// to add 15 at the index 2
		a.add(2, 15);
		System.out.println("After adding index at 2 store 15");
		System.out.println("Elements present inside the ArrayList "+a);
		System.out.println("the number of Element inside list "+a.size());
	}
}
