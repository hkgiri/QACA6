package Binary_Search;

import java.util.Arrays;

public class P1 {
	public static void main(String[] args) {
		int[] a= {20,80,60,50,30};
		Arrays.sort(a); //precondition for binary search.
		System.out.println("print sorted Arrays");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		int key=80;
		int count=0;
		int low=0;
		int high=a.length-1;
		System.out.println();
		System.out.println("print search number");
		while (low<=high)
		{
			int mid=(low+high)/2;
			if (key==a[mid])
			{
				count++;
				break;
			}
			else if (key<a[mid])
			{
				high=mid-1;
			}
			else
			low=mid+1;
		}
		if (count==1)
		{
			System.out.println(key+" is present in the arrays");
		}
		else
			System.out.println(key+" is not present in the arrays");
		
	}
}
