package arrays;
// wajp to count the number of elements divisible by 3&7 both. given array is: int[]a={12,21,9,42,49,50,56,100};
public class A11 {

	public static void main(String[] args) 
	{
		int[]a= {12,21,9,42,49,50,56,100};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			
			if (a[i]%3==0&&a[i]%7==0)
			{
				count++;
				System.out.println(a[i]);
			}
			
		}
		System.out.println("total divisible number are: "+count);
	}

}
