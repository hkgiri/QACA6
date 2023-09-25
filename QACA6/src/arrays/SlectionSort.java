
package arrays;

public class SlectionSort {
	public static void main(String[] args) {
		int[]a= {15,20,10,40,30};
		for (int i = 0; i < a.length; i++)
		{
			int pos=i;
			for (int j = i+1; j < a.length; j++)
			{
				if (a[j]<a[pos])
				{
					pos=j;
				}
			}
			if (pos!=i)
			{
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}	
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
