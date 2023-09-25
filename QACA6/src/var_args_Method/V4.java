package var_args_Method;

import java.util.Scanner;
//using var_args_method and adding the passing values.. (creating Non-Static method and using reff)
public class V4 {
	public int test(int...a)
	{
		int sum=0;
		System.out.println("adding the Elements");
		for (int i = 0; i <a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of the arrays");
	int size=sc.nextInt();
	int[] a=new int[size];
	System.out.println("Enter the Elements");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	 V4 d=new V4();//creating object
	 int c = d.test(a);
	 System.out.println("Result is: "+c);
	}

}
