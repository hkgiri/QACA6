package arraysnew;

import java.util.Scanner;

// wajp to store n-number of elements in int array and print those element. take input to from user..
public class A2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter element of array");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Entered element of array are:");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

	}
}
