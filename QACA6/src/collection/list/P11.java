package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		//to search for an element which is read from the user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int key=s.nextInt();
		//passed value is 30.
		if (al.contains(key))
		{
			System.out.println(key+" is present inside collection at the index: "+al.indexOf(key));
		}
		else
			System.out.println(key+" is not present inside collection at the index: "+al.indexOf(key));
	}
	
}
