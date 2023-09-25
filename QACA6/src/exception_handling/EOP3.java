package exception_handling;
//Exception Object Propagation..
public class EOP3 {
	public static void dinga()
	{
		System.out.println("Dinga Begin");
		dingi();
		System.out.println("Dinga End");
		
	}
	public static void main(String[] args) {
		try {
		System.out.println("Main Begin");
		dinga();
		System.out.println("Main End");
		}
		catch(Exception e)
		{
			System.out.println("please don't pass zero in dnominator");
		}
	}
	public static void dingi()
	{
		
			System.out.println("Dingi Begin");
			int a=10;
			int b=0;
			int res=a/b;
			System.out.println(a+"/"+b+"="+res);
			System.out.println("Dingi End");
		
	}
}
/*
Main Begin
Dinga Begin
Dingi Begin
please don't pass zero in dnominator

 */

