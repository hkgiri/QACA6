package exception_handling;
//1 try and catch only
import java.util.InputMismatchException;
import java.util.Scanner;
public class Eh2 {
	public static void main(String[] args) {
		System.out.println("*****************Welcome to division application*****************");
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter integer value in Numerator");
			int a=sc.nextInt();
			System.out.println("Enter integer value in Dnominator");
			int b=sc.nextInt();
			int res=a/b;
			System.out.println(a+"/"+b+"="+res);			
		}
		catch(ArithmeticException s)
		{
			System.out.println("please do not pass the zero value in Dnominator");
		}
		catch(InputMismatchException s1)
		{
			System.out.println("please enter integer value only");
		}
		System.out.println("Thanks for using the Application");
	}
}
