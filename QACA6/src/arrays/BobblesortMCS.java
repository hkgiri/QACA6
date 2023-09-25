package arrays;
//Design a  method which helps to sort an arrays and helps to return the arrays.
public class BobblesortMCS 
{
	public static void main(String[] args) {
		int[]a= {90,195,30,120,60,45,25,10,5};
		a=sort(a);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static int[] sort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length-1; j++) 
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	
	}
}
