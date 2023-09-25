package var_args_Method;
//var args method is a least priority.....
public class V1 {
	public static int[] test(int...a)
	{
		int[] b=a;
		System.out.println("From int...var...args");
		return b;
	}
	public static void main(String[] args) {
		System.out.println("From main");
		int[] arr=new int[4];
		int sum=10;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sum;
			sum+=arr[i];
		}
		int[] b=test(arr);
		System.out.println("Print all added arrays");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		test(10);
	}
	
	public static void test(double a)
	{
		System.out.println();
		System.out.println("From double");
	}
}
/*
From main
From int...var...args
Print all added arrays
10 20 40 80 
From double
*/