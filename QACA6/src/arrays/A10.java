package arrays;
//walp to find the average of of array element.given array is double[]a={10,20,30,40,50};
public class A10 {

	public static void main(String[] args) 
	{
		int[]a= {10,20,30,40,50};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		System.out.println("The average of array element: "+avg);
		
	}

}
