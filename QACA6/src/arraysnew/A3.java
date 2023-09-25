package arraysnew;

import java.util.Scanner;

//wajp to find the sum of element of int[]. take input from users.
public class A3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements of array is: "+sum);
	}

}
