package Linear_Search;
//wajp to find one particular element in the array.  
public class P1 {

	public static void main(String[] args) 
	{
		int[] a= {10,20,60,80,50};
		int search=20;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]==search)
			{
				count++;
				break;
			}
		}
		if (count==1)
		{
			System.out.println(search+" is present in the array");
		}
		else
			System.out.println(search+" is not present in the array");
	}

}
