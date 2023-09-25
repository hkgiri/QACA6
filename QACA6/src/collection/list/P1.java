package collection.list;

import java.util.ArrayList;

public class P1 {
	public static void main(String[] args) {
	 
		//create an object of arrayslist store it and check size 
		//as well as whether it has any elements or not
		
		ArrayList a=new ArrayList(); 
		System.out.println(a);//[]
		//to check whether collection is really empty or not
				System.out.println(a.isEmpty());//true
		//to store the elements in ArrayList.
		a.add(10);
		a.add(20);
		//to check whether collection is really empty or not
		System.out.println(a.isEmpty());//false
		//to check number of elements present inside list.
				System.out.println(a.size());//2
		//to print the store elements.
				System.out.println(a);//[10,20]
		
		
	}
}
