package arraysnew;

import java.util.Scanner;

//wajp to create int[] of size 5 and print maximum and minimum value.take elements from user.
public class A6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]a=new int[5];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>max)
			{
				max=a[i];
			}
			else if (a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max value of elements is: "+max);
		System.out.println("min value of elements is: "+min);
		
	}

}
