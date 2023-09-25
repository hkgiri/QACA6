package Comprator_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DriverHuman {

	public static void main(String[] args) {
		// add 4 Human object into an arrays.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of object to be stored");
		int size=sc.nextInt();
		Human[] h=new Human[size];
		for (int i = 0; i < size;)
		{
			sc.nextLine();
			System.out.println("Enter the name of the human");
			String name=sc.nextLine();
			System.out.println("Enter the height of the human");
			double height=sc.nextDouble();
			System.out.println("Enter the weight of the human");
			double weight=sc.nextDouble();
			System.out.println("********************************");
			h[i]=new Human(height,name,weight);
			System.out.println(++i +" :Human object is created");
		}
		//to print all the elements of arrays
		for (int i = 0; i < size; i++) 
		{
		 	System.out.println(h[i]);
		}
		//to sort on Decending order the elements based on Height using builin.
		Arrays.sort(h,new ShortbyHeight());
		System.out.println("After sorting in Decending based on height");
		for (int i =size-1; i > 0; i--) 
		{
			System.out.println(h[i]);
		}
		//to sort the elements based on Weight using builin.
		Arrays.sort(h,new SortbyWeight());
		System.out.println("After sorting based on Weight");
		for (int i = 0; i < size; i++) 
		{
		System.out.println(h[i]);
		}
		//to sort the elements based on Name using builin.
		Arrays.sort(h,new SortbyName());
		System.out.println("After sorting based on Name");
		for (int i = 0; i < size; i++) 
		{
		System.out.println(h[i]);
		}	
		}

}
