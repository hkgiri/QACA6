package arrays;

public class Bubble_sort 
{
	public static void main(String[] args) {
		int[]a= {20,10,30,5,25};
		//print the elements before sorting.
		System.out.println("Elements of array befor shorting");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		//logic for Bobble Sort.
		for (int j = 0; j < a.length; j++) 
		{
			for (int i = 0; i < a.length-1; i++) 
			{
				//logic for Swapping.
				if (a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
			// print the element after shorting.
			System.out.println("Elements of array after shorting");
			for (int i = 0; i < a.length; i++)
			{
				System.out.println(a[i]);
			}
		}
	}

