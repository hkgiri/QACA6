package Linear_Search;

import java.util.Scanner;

//wajp to search one particular element from the given array ask user to given input.
public class P2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an arrays");
		int size=sc.nextInt();
		//creating array object with the help of new.
		int[] a = new int[size];
		System.out.println("Enter the integer numbers");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		//search the number given by user.
		System.out.println("Enter the search number");
		int key=sc.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]==key)
			{
				count++;
				break;
			}
		}
		if (count==1)
		{
			System.out.println(key+" is present in the arrays");
		}
		else
			System.out.println(key+" is not present in the arrays");
	}
}
