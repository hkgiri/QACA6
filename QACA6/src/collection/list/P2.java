package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		//crete an ArrayList object
		ArrayList a=new ArrayList();
		
		//add int value.
		a.add(50);
		//add double value
		a.add(20.5);
		//add char value
		a.add('A');
		//add boolean value
		a.add(true);
		//add book object
		 a.add(new Book()); 
		//add Student object
		 a.add(new Student());
		//add Marker object
		a.add(new Marker());
		//add Scanner object
		a.add(new Scanner(System.in));
		System.out.println(a);
		
	}
}
